/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf741;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        if (s.contains("4") || s.contains("6") || s.contains("1") || s.contains("8") || s.contains("9")) {
            System.out.println(k - 1);
        } 
        
        else {
            char[] c = s.toCharArray();
            if(c[0] == '2' ){
                
            }
            
        }

    }
}
