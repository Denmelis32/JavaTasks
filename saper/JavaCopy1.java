2/*
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
 *Входные данные будут состоять из произвольного числа полей.Первая строка поля содержит два целых числа 
 * n u m (0<n,m<=100) которые соответствую числу строк и столбцов поля соотвественно .Каждая из последующих n строк
 * содержит ровно m символов ,представляя собой поле.
 * Безопасные клеточки (.) мины(*) и то и другое без кавычек.Первая трока поля,где n u m = 0,представляют собой окончание входных данных и обрабытываться не должна 
 * 
 * следующие n строк должны содержать поле с символами (.) замененными на число мин в соседних клеточках.Ммежду выводами полей должна быть пустая строка
 * 
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
