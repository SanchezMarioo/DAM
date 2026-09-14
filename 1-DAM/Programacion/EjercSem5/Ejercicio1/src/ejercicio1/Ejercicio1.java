/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int COLUMNAS = 5;
        final int FILAS = 3;
        final int MAXIMO = 254;
        int[][] matriz = new int[5][3];
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < FILAS; j++) {
                int numeroRandom = (int) (Math.random() * MAXIMO + 1);
                matriz[i][j] = numeroRandom;
            }
        }
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < FILAS; j++) {
                            System.out.print(matriz[i][j] + "\t");
                        }
                        System.out.println();
                    }

                }
                case 2 -> {
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < FILAS; j++) {
                            int numeroRandom = (int) (Math.random() * MAXIMO);
                            matriz[i][j] = numeroRandom;
                        }
                    }
                }
                case 3 ->
                    System.out.println("Saliendo del programa");
                default ->
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 3);

    }

    static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa 1 si quieres visualizar la matriz");
        System.out.println("Pulsa 2 si quieres volver a rellenar la matriz con nuevos números");
        System.out.println("Pulsa 3 para salir");
        System.out.println("Elige una opcion");

    }

}
