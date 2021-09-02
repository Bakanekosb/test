/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            n--;
            ArrayList<Character> lst = new ArrayList<>();
            lst.add('A');
            lst.add('B');
            lst.add('C');
            int count[] = new int[3];
            String s = sc.nextLine();
            char ch[] = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                count[lst.indexOf(ch[i])]++;
            }

            int index;
            if (count[0] == count[1] + count[2]) {
                index = 0;
            } else if (count[1] == count[2] + count[0]) {
                index = 1;
            } else if (count[2] == count[1] + count[0]) {
                index = 2;
            } else {
                index = -1;
            }
            if (index == -1) {
                System.out.println("NO");
                continue;
            }
            int countOpen = 0;
            int countClose = 0;

            if (lst.indexOf(ch[0]) == index) {
                for (int i = 0; i < s.length(); i++) {
                    if (ch[i] == lst.get(index)) {
                        ch[i] = '(';
                        countOpen++;
                    } else {
                        ch[i] = ')';
                        countClose++;
                    }
                    if (countClose > countOpen) {
                        System.out.println("NO");
                        break;
                    }
                }
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (ch[i] != lst.get(index)) {
                        ch[i] = '(';
                        countOpen++;
                    } else {
                        ch[i] = ')';
                        countClose++;
                    }
                    if (countClose > countOpen) {
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if (countClose == countOpen) {
                System.out.println("YES");
            }

        }
    }
}
