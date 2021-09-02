/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf740;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<List<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sl = Integer.parseInt(sc.nextLine());
            List<Integer> ls = new ArrayList<>();
            for (int j = 0; j < sl; j++) {
                String line = sc.nextLine();
                String[] s = line.split(" ");
                for (int k = 1; k < Integer.parseInt(s[0]); k++) {
                    ls.add(Integer.parseInt(s[k]));
                }
            }
            lst.add(ls);

        }
        for (List<Integer> list : lst) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
//        List<Integer> ls = new ArrayList<>();
//        ls.add(10);
//        ls.add(15);
//        ls.add(8);
//        lst.add(ls);
//
//        ls = new ArrayList<>();
//        ls.add(12);
//        ls.add(11);
//        lst.add(ls);

//        ls = new ArrayList<>();
//       ls.add(10);
//       ls.add(15);
//       ls.add(8);
//       lst.add(ls);
        System.out.println(minValue(lst));
    }

    static int minValue(List<List<Integer>> lst) {
        int arr[][] = new int[lst.size()][2];
        for (int i = 0; i < lst.size(); i++) {
            arr[i][0] = lst.get(i).size();
            arr[i][1] = valueOfRow(lst.get(i));
        }
        for (int i = 0; i < lst.size() - 1; i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (arr[i][1] > arr[j][1]) {
                    int temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }
        for (int i = 0; i < lst.size() - 1; i++) {
            int tong = 0;
            for (int j = 0; j < lst.size() - 1; j++) {
                tong = tong + arr[j][1] + arr[j][0];
            }
            if (tong >= arr[lst.size() - 1][1]) {
                return arr[i][1];
            }
        }
        return arr[lst.size() - 1][1];
    }

    static int valueOfRow(List<Integer> lst) {
        int max = lst.get(0) + 1;
        for (Integer x : lst) {
            if (x - lst.indexOf(x) + 1 > max) {
                max = x - lst.indexOf(x) + 1;
            }
        }
        return max;
    }

    static void sapxep(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
