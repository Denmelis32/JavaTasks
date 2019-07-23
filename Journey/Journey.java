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
        String aTravels;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println(" Куда хотите отправится?" + "\n");
        for (;;) {
            if (((aTravels = sc.nextLine()) != null) ) {
                System.out.println(" Сколько людей с вами отправится? " + "\n");
                if (((aNumberTraveler = sc.nextInt()) > 0)
                        && ((aNumberTraveler = sc.nextInt()) < 1000)) {
                      
                          && ((aNumberTraveler = sc.nextInt()) < 1000)) {
                      int aCosts[] = new int [aNumberTraveler];
                      // Откуда брать эту цену???Как узнать сколько они потратили ? 
                      //Я могу через сканнер сделать,чтобы для каждого писалось,сколько он потратил
                      //но как это потом уравнять ?
                      for(int i = 0 ;i<aCosts.length;i++)
                    aCosts[i]=sc.nextInt();
                }
            } else {
                break;
            }
        }
    }
}
