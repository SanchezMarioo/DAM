/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero hasta el que quieres sacar el numero primo: ");
        int numeroPrimo = sc.nextInt();
        int[] numerosPrimos = divisoresPrimos(numeroPrimo);
        for (int i = 0; i < numerosPrimos.length; i++) {
            if (numerosPrimos[i] != 0) {
                System.out.print(numerosPrimos[i] + " ");
            }

        }
    }

    static int[] divisoresPrimos(int numeroPrimo) {
        int restoDivision = 0;
        boolean noEsPrimo = false;
        int contadorNumero = 0;
        int[] arrayPrimos = new int[numeroPrimo];
        int num = 2;
        do {
            noEsPrimo = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    noEsPrimo = true;
                    break;
                }
            }
            if (!noEsPrimo) {
                arrayPrimos[contadorNumero] = num;
                contadorNumero++;
            }
            num++;

        } while (num <= numeroPrimo);
        return arrayPrimos;
    }
}
