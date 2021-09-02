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
public class A20172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int [n];
        int a,b;
       
        for(int i = 0; i < t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j = a - 1; j < b; j++){
                arr[j] ++;
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] % 3 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
    
}
