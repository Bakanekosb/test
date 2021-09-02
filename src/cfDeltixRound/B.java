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
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int odd = 0, even = 0;
            int o[] = new int[n];
            int e[] = new int[n];   
            int min = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                if(a[i] % 2 == 0){
                    a[i] = 2;                    
                    e[even] = i;
                    even ++;
                }
                else{
                    a[i] = 1;
                    o[odd] = i;                    
                    odd ++;
                }
            }
            if(Math.abs(odd - even) >= 2){
                System.out.println(-1);
            }
            else if(odd > even){
                int count = 0;
                for(int j = 0; j < n; j+=2){
                    min += Math.abs(o[count] - j);
                    count ++;
                }
                System.out.println(min);
            }
            else if (even > odd){
                int count = 0;
                for(int j = 0; j < n; j+=2){
                    min += Math.abs(e[count] - j);
                    count ++;
                }
                System.out.println(min);
            }            
            else if(even == odd){
                int m1 = 0, m2 = 0;
                int count = 0;
                for(int j = 0; j < n; j+= 2){
                    m1 += Math.abs(e[count] - j);
                    m2 += Math.abs(o[count] - j);
                    count ++;
                }
                System.out.println(Math.min(m1, m2));
            }
            t--;
        }

    }
}
