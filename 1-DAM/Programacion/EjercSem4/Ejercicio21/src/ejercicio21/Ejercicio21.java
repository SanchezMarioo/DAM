/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el numero: ");
        int numero = sc.nextInt();
        final int FILAS = numero;
        final int COLUMNAS = numero;

        int[][] matriz = new int[FILAS][COLUMNAS];

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                if (i == j) {
                    matriz[i][j] = 1;

                } else {
                    matriz[i][j] = 0;
                }

            }
        }

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                System.out.print(" | " + matriz[i][j] + " | " + "\t");
            }
            System.out.println();
        }
    }

}
