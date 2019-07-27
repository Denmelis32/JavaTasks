/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package journey;

import java.util.Scanner;

/**
 *
 * @author Asus1
 */
public class Journey {

    public static void main(String[] args) {
        int aNumberTraveler;
        int a = 0;
        double price;
        String aTravels;
        Scanner sc;
        sc = new Scanner(System.in);
        aTravels = sc.nextLine();
      while (aTravels != null) {
            System.out.println(" Куда хотите отправиться?");
             aTravels = sc.nextLine();
            a++;

            System.out.println(" Сколько людей с вами отправиться? ");

            if (((aNumberTraveler = sc.nextInt()) > 0)
                    && (aNumberTraveler < 1000)) {

            }
        }
      
        System.out.println(a);
//        }
//        System.out.println(" На какой бюджет рассчитываете? ");
//        if ((price = sc.nextDouble()) > 0) {
////                  int aCosts[] = new int[aNumberTraveler];
//                     for (int i = 0; i < aCosts.length; i++) {
//                      aCosts[i] = sc.nextInt();
    }

}
