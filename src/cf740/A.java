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
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int arr[] = new int[n];
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
            int len = arr[i];
            String s = sc.nextLine();
            String[] a = s.split(" ");
            int[] aNum = new int[len];
            for(int k = 0; k < a.length; k++){
                aNum[k] = Integer.parseInt(a[k]);
            }
            res[i] = vongLap(aNum);
            System.out.println(res[i]);
        }
       
    }

    static int vongLap(int[] arr) {
        int l = arr.length;
        int count = 0;
        if (checkSort(arr)) {
            return count;
        }
        for (int i = 0; i < l; i++) {
            swap(arr, i);
            count++;
            if (checkSort(arr)) {
                return count;
            }
        }
        return count;
    }

    static void swap(int arr[], int j) {
        int n = j % 2 == 0 ? 0 : 1;
        for (int i = n; i < arr.length - 1; i += 2) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
//        for(int i = 0; i < arr.length - 1; i++){
//            System.out.println(arr[i]);
//        }
    }

    static boolean checkSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }

        }
        return true;
    }
}
