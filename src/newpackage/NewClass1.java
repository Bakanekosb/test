/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class NewClass1 {

    public static void main(String[] args) {
         Date dt = new Date();
        System.out.println("Today:    " + dt);
        Date tomorrow = new Date(dt.getTime() + (1000 * 60 * 60 * 24));
        System.out.println("Tomorrow: " + tomorrow);

    }
}
