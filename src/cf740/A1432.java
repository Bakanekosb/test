/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf740;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class A1432 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }        
        Arrays.sort(A);
        
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(B);
        
        int C[] = new int [256];
        
        for(int i = 0; i < n; i++){
            C[A[i]]++;
        }
        for(int i = 0; i < n; i++){
            System.out.println(C[A[i]]);
        }
    }
}
