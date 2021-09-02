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
public class A3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr_sum[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i > 0) {
                arr_sum[i] = arr[i] + arr_sum[i - 1];
            } else {
                arr_sum[i] = arr[i];
            }
        }

        int yum = sc.nextInt();
        int arr_yum[] = new int[yum];
        for (int i = 0; i < yum; i++) {
            arr_yum[i] = sc.nextInt();
        }

        for (int i = 0; i < yum; i++) {
            System.out.println(binarySearch(arr_sum, arr_yum[i]));
        }

    }

    static int binarySearch(int arr[], int y) {
        int len = arr.length;
        int r = len - 1;
        int l = 0;
        while (r >= l) {
            int mid = l + (r - l) / 2;

            if (check(arr, mid, y) == 0) {
                return mid + 1;
            }
            if (check(arr, mid, y) == -1) {
                r = mid - 1;
            }
            if (check(arr, mid, y) == 1) {
                l = mid + 1;
            }
        }

        return -1;

    }

    static int check(int arr[], int index, int y) {
        if (index == 0 && arr[index] >= y) {
            return 0;
        }
        if (arr[index] >= y && arr[index - 1] < y) {
            return 0;
        }
        if (arr[index] < y) {
            return 1;
        }
        if (arr[index - 1] >= y) {
            return -1;
        }
        return 100;
    }
}
