/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchmaxmin;

/**
 *
 * @author Asus1
 */
public class SearchMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int a = 10;
        double[] array = new double[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double b = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
                b += array[i] / array.length;
            }
        }
        System.out.println("максимальное = " + max);
        System.out.println("минимальное = " + min);
        System.out.println(b);
    }
}
