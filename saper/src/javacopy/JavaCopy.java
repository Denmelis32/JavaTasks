/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacopy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus1
 */
public class JavaCopy {
    

    public static void main(String a[]) {
        String rus = ".*";
    int huar = 0;
        Random r = new Random();
        String c;
        Scanner sr = new Scanner(System.in);
        if (sr.hasNextByte()) {
            byte aGet = sr.nextByte();
            byte[] aLength = new byte[aGet];
            for (byte i = 0; i < aLength.length; i++) {
                System.out.println();
                for (byte s = 0; s < aLength.length; s++) {
                    String sum = rus + rus.toUpperCase();
                    char cc = sum.charAt(r.nextInt(sum.length()));
                    if (Character.toString(cc).equals("*")){
                     huar ++;
                    }
                    
                    System.out.print(cc);
                }
                
            }
           System.out.println(huar);
        }
       
    }
    
}
