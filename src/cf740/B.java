/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf740;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            String[] s = string.split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }
        for (int i = 0; i < n; i++) {
            List<Integer> lst = breakPoint(arr[i][0], arr[i][1]);
            System.out.println(lst.size());
            for (int j = 0; j < lst.size(); j++) {
                if (j < lst.size() - 1) {
                    System.out.print(lst.get(j) + " ");
                } else {
                    System.out.println(lst.get(j));
                }
            }
        }

    }

    static List<Integer> breakPoint(int a, int b) {
        List<Integer> lst = new ArrayList<>();
        if (a == b) {
            for (int i = 0; i <= 2 * a; i += 2) {
                lst.add(i);
            }
            return lst;
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if ((a - b) % 2 == 0) {
            for (int i = 0; i <= 2 * b; i += 2) {
                int res = i + (a - b) / 2;
                lst.add(res);
            }
        } else {
            for (int i = 0; i <= 2 * b; i += 2) {
                int res = i + (a - b) / 2;
                lst.add(res);
                res++;
                lst.add(res);
            }
        }

        return lst;

    }
}
