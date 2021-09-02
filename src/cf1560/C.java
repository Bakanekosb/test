/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf1560;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(find(arr[i])[0] +" " + find(arr[i])[1]);

        }
    }

    private static int[] find(int n) {
        int arr[] = new int[2];
        int r = 1, c = 1;
        int i = 1;
        while (true) {
            if (n > i * i) {
                i++;
            } else {
                break;
            }
        }
        int lt = (i - 1) * (i - 1) + 1;
        int rt = i * i;
        int mid = lt + (rt - lt) / 2;
        if (n == mid) {
            r = i;
            c = i;
        }
        if (n > mid) {
            r = i;
            c = (rt - n) + 1;
        }
        if (n < mid) {
            c = i;
            r = (n - lt) + 1;
        }
        arr[0] = r;
        arr[1] = c;
        return arr;
    }

}
