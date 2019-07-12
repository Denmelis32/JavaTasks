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
        setting();
    }
public static void setting() {
        String sum;
        Scanner sr = new Scanner(System.in);
        byte aGet = sr.nextByte();
        byte aGet2 = sr.nextByte();
        String rus = ".*";
        int huar = 0;
        byte k;
        int num;
        Random r = new Random();
        String c;
        byte[][] aLength = new byte[aGet][aGet2];
        byte g = 0;
        for (byte i = 0; i < aLength.length; i++) {
            System.out.println();
            for (byte s = 0; s < aLength[i].length; s++) {
                sum = rus + rus.toUpperCase();
                char cc = sum.charAt(r.nextInt(sum.length()));
                if (Character.toString(cc).equals("*")) {

                    huar++;
                    if (aLength[i + 1][s + 1] >= 0) {
                        
                    }
                } else {
                    System.out.print(cc);
                }
                          }
System.out.print(huar);
        }
    }
}
