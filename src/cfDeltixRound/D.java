/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfDeltixRound;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        while (q > 0) {
            q--;
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            int len = r - l + 1;
            long ap[] = new long[len];
            long bp[] = new long[len];
            int index = 0;

            if (a[l] > b[l] || a[r] < b[r]) {
                System.out.println(-1);
                continue;
            }
            long tonga = 0, tongb = 0;
            long maxa = 0, maxb = 0;

            for (int i = l; i <= r; i++) {
                if (a[i] > b[i]) {
                    if (index > 0 && ap[index - 1] > 0) {
                        ap[index - 1] += (a[i] - b[i]);
                        maxa = Math.max(maxa, ap[index - 1]);
                    } else {
                        ap[index] = a[i] - b[i];
                        bp[index] = 0;
                        maxa = Math.max(maxa, ap[index]);
                        index++;
                    }
                    tonga += (a[i] - b[i]);
                } else if (a[i] < b[i]) {
                    if (index > 0 && bp[index - 1] > 0) {
                        bp[index - 1] += (b[i] - a[i]);
                        maxb = Math.max(maxb, bp[index - 1]);
                    } else {
                        ap[index] = 0;
                        bp[index] = b[i] - a[i];
                        maxb = Math.max(maxb, bp[index]);
                        index++;
                    }
                    tongb += (b[i] - a[i]);
                }
            }
            if (tonga != tongb) {
                System.out.println(-1);
                continue;
            }
            System.out.println(Math.max(maxa,maxb));
        }
    }
}
