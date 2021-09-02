/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cf741;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class A2 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        while (t > 0) {
            int k = Integer.parseInt(sc.nextLine());
            String n = sc.nextLine();
            String m = "";
            int tam = 0;
            int dem = 0;
            int cong = 0;
            for (int i = 0; i < n.length(); i++) {
                int b = Integer.parseInt(String.valueOf(n.charAt(i)));
                if ((b % 2 == 0 && b != 2) || b == 1 || b == 9) {
                    tam = b;
                    dem++;
                    break;

                } else if (b == 2) {
                    m += b;
                } else if (b % 2 != 0) {
                    m += b;
                    if (m.length() < 2) {
                        continue;
                    }
                    for (int j = 2; j < Integer.parseInt(m); j++) {
                        if (Integer.parseInt(m) % j == 0) {
                            cong++;
                            break;
                        }
                    }
                    if (cong > 0) {
                        break;
                    } else {
                        m = m.substring(0, 1);
                    }
                }
            }

            if (cong == 0) {
                m = n.substring(n.length() - 3, n.length() - 1);
            }
            if (dem > 0) {
                System.out.println(1);
                System.out.println(tam);
            } else {
                System.out.println(m.length());
                System.out.println(m);
            }

            t--;
        }
    }
}
