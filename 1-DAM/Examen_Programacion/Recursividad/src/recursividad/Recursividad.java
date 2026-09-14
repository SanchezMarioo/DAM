/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package recursividad;

import java.util.Scanner;

/**
 *
 * @author angelvidal
 */
public class Recursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce un número entero positivo: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Error: el factorial no está definido para números negativos.");
        } else {
            System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        }
    }
    
    // Función recursiva que calcula el factorial
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // caso base
        } else {
            return n * factorial(n - 1); // llamada recursiva
        }
    }
}
