/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        char[] c = new char[n];
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    c[s.length()/2 + i/2] = s.charAt(i);
                }
                else{
                    c[s.length()/2 - i/2 - 1] = s.charAt(i);
                }
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    c[s.length()/2 - i/2] = s.charAt(i);
                }
                else{
                    c[s.length()/2 -i/2 + i/2 + 1] = s.charAt(i);
                }
            }
        }
        
        System.out.println(String.valueOf(c));
    }
}
