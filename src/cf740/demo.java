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
public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int a[] = new int[3];
            int index[] = new int[3];
            String s = sc.nextLine();
            int min = s.length();
            int minTemp;
            char c[] = s.toCharArray();
            boolean flag = false;
            for (int i = 0; i < c.length; i++) {
                if (findIndex(a, c[i] - 48) != -1) {
                    index[findIndex(a, c[i] - 48)] = i;
                    
                } else {
                    int temp = findIndex(a, 0);
                    a[temp] = c[i] - 48;
                    index[temp] = i;
                    if (findIndex(a, 0) == -1) {
                        minTemp = minLength(index);
                        if (minTemp < min) {
                            min = minTemp;
                            flag =  true;
                        }
                        a[minIndex(index)] = 0;
                    }
                }
            }
            
            System.out.println(flag ? min + 1 : 0);
            t--;
        }
    }

    static int findIndex(int[] a, int val) {
        for (int i = 0; i < 3; i++) {
            if (a[i] == val) {
                return i;
            }
        }
        return -1;
    }

    static int minLength(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < 3; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max - min;
    }
    
    static int minIndex(int[] a) {
        int min = a[0];
        int minIndex = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
}
