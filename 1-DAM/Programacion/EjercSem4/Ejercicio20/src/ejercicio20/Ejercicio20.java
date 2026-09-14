/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int FILAS = 4;
        final int COLUMNAS = 4;
        int numeroSacar = 0;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[FILAS][COLUMNAS];

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                numeroSacar = (int) (Math.random() * 100 + 1);
                matriz[i][j] = numeroSacar;
            }
        }

        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                System.out.print(matriz[i][j] + "\t");
                sumaFilas += matriz[i][j];
            }
            System.out.print(sumaFilas);
            System.out.println();
            sumaFilas = 0;

        }
        for (int i = 0; i < COLUMNAS; i++) {
            for (int j = 0; j < FILAS; j++) {
                sumaColumnas += matriz[j][i];
            }
            System.out.print(sumaColumnas + "\t");
            sumaColumnas = 0;
        }
        System.out.println();

    }
}
