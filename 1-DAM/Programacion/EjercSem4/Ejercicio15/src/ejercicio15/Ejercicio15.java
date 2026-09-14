/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] notas = {3, 3, 2, 10, 7, 9};
        int[] notas2 = new int[notas.length + 1];

        int numero = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        do {
            System.out.print("\nDime un numero: ");
            numero = sc.nextInt();
        } while (numero <= 0 || numero > 10);
        // COGER SIEMPRE EL CORTO Y SUMAR +1d
        for (int i = 0; i < notas2.length; i++) {
            if (i == 0 || i == 1) {
                notas2[i] = notas[i];
            } else if (i == 2) {
                notas2[i] = numero;
            } else {
                notas2[i] = notas[i - 1];
            }
        }
        for (int i = 0; i < notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }
    }

}
