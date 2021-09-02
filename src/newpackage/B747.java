/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package newpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class B747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        if (n % 4 != 0) {
            System.out.println("===");
            return;
        }
        char[] string = new char[n];
        int a[] = new int[n];
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
        map.put('?', 0);
        boolean check = true;
        for (int i = 0; i < n; i++) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (s.charAt(i) == entry.getKey()) {
                    int temp = entry.getValue() + 1;
                    if (s.charAt(i) != '?' && temp > n / 4) {
                        check = false;
                        break;
                    }
                    entry.setValue(temp);
                    break;
                }
            }
            if (!check) {
                 System.out.println("===");
                return;
            }
        }
           
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '?') {
                System.out.print(s.charAt(i));

            } else {
                for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue() < n / 4) {
                        System.out.print(entry.getKey());
                        int temp = entry.getValue() + 1;
                        entry.setValue(temp);
                        break;
                    }

                }
            }
        }
        
       
    }
}
