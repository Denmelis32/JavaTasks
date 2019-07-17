/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finka;

/**
 *
 * @author Asus1
 */
public class Finka {

    /**
     * 1
     * Распечатывает 120 первых чисел 
     * каждый его элемент фор1мируется как сумма двух предыдущих элементов ряда,
     * начиная с элементов 1 и 1
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 1;
       int b = 1;
       int c ;
       
       System.out.println(a+" " + b + " ");
       for(int i = 0; i<120;i++){
       c = a+ b;
       System.out.println(c +" ");
       b = c ;
       }
       System.out.println();
       
            
    }
    
}
