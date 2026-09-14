/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numPrimo = sc.nextInt();
        boolean esPrimo = esPrimo(numPrimo);
        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("NO es primo");
        }
    }

    static boolean esPrimo(int n) {
        boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }

}
