/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculationofprimenumbers;

/**
 *
 * @author Asus1
 */
public class CalculationOfPrimeNumbers {

    /**
     * эта программа11111 вычисляет простые убрать числа,кратные меньшим простым
     * числам, и все оставшиеся будут простыми.она печает
     *
     * числа не превосходящие аргумент
     *
     */
    public static void main(String[] args) {
        int max = 1000;
        try {
            max = Integer.parseInt(args[0]);
        } catch (Exception e) {
        }
        boolean[] a = new boolean[max + 1];
        for (int i = 0; i <= max; i++) {
            a[i] = true;
            a[0] = a[1] = false;
        }
        int b = (int) Math.ceil(Math.sqrt(max));
        for (int i = 0; i <= b; i++) {
            if (a[i]) {
                for (int j = 2 * i; j <= max; j = j + 1) {
                    a[j] = false;
                }
            }
            int r;
            for (r = max; !a[r]; r--) {
                System.out.println("Наибольшее число > " + max + " eto" + r);
            }

        }
    }
}
