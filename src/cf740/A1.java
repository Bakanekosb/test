/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf740;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class A1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int dem = 1;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }

            for (int i = 1; i < 10000; i++) {
                if (sorted(n, a)) {
                    break;
                }
                boolean flag = false;
                int j;
                if (dem % 2 == 0) {
                    j = 1;
                    flag = hi(j, n - 1, a);

                } else {
                    j = 0;
                    flag = hi(j, n - 2, a);
                }

                dem++;
                if (sorted(n, a)) {
                    break;
                }
            }

            System.out.println(dem - 1);

            t--;
        }
    }

    static public boolean hi(int j, int n, int a[]) {
        boolean flag = false;
        for (; j < n; j += 2) {

            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
                flag = true;

            }

        }
        return flag;
    }

    static public boolean sorted(int n, int a[]) {
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (a[i] > a[i + 1]) {
                return flag;
            }
            if (i == n - 2) {
                break;
            }
        }
        return flag = true;
    }

}

