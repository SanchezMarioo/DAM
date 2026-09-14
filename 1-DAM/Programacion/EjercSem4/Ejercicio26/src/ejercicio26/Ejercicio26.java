/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int FILAS = 3;
        final int COLUMNAS = 3;
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int[] sumasColumnas = new int[3];
        int sumaColumna = 0;
        int indiceMenor = 0;
        int[][] matriz = new int[FILAS][COLUMNAS];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Posicion" + "[" + i + "]" + "[" + j + "] " + ":");
                numero = sc.nextInt();
                matriz[i][j] = numero;

            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            sumaColumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaColumna += matriz[j][i];
                System.out.print(matriz[i][j] + "\t");
            }
            sumasColumnas[i] = sumaColumna;
            System.out.println();
        }

        for (int i = 0; i < sumasColumnas.length; i++) {
            if (sumasColumnas[indiceMenor] > sumasColumnas[i]) {
                indiceMenor = i;
            }
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][indiceMenor] + "\t");
        }
    }
}
