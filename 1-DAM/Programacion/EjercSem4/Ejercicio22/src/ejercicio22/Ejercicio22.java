/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        final int FILAS = 5;
        final int COLUMNAS = 5;
        int numeroSacar = 0;
        int aparece = 0;
        int numero = 0;
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[FILAS][COLUMNAS];
        do {
            System.out.println("Numero a encontrar (0-9): ");
            numero = sc.nextInt();
        } while (numero < 0 || numero > 10);
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                numeroSacar = (int) (Math.random() * 10 + 1);
                matriz[i][j] = numeroSacar;
            }
        }

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                if (numero == matriz[i][j]) {
                    System.out.println("Columna " + (i + 1) + ", Filas " + (j + 1));
                    aparece++;
                }
            }
        }
        System.out.println("El numero " + numero + " sale " + aparece + " veces");
    }

}
