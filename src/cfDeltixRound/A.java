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
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c == 0 && d == 0) {
                System.out.println(0);
            } else if (c == d) {
                System.out.println(1);
            } else if ((c - d) % 2 != 0) {
                System.out.println(-1);
            } else if ((c - d) % 2 == 0) {
                System.out.println(2);
            }
            n--;
        }

    }
}
