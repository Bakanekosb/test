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
public class AB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            int L = 0, R = 0;
            for (int j = 0; j < i; j++) {
                L += a[j];
            }
            for (int j = i + 1; j < n; j++) {
                R += a[j];
            }
            
        }
    }

}
