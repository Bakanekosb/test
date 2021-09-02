/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Dell
 */
public class NewClass2 {

    public static void main(String[] args) {
        long res = 0;
//       for(long i = 2434684652L ; i < 70655063956L ; i++){
//           res += (90123106661L % i);
//       }
//        System.out.println(90123106661L % 70655063956L);
         System.out.println((200 % 51));
    }

    static long modulo_inverse(long n, long m) {
        for (long i = 1; i < m; i++) {
            if (( n * i) % m == 1) {
                return i;
            }
        }
        return -1; // not exist
    }
}
