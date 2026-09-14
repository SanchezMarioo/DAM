/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba1;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Error: Introduce un numero");
            sc.next();
        }
        int filas = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Error: Introduce un numero");
            sc.next();
        }
        int columnas = sc.nextInt();
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Error: Introduce un numero: ");
                    sc.next();
                }
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0) {
                    if (j == 0) {
                        if ((matriz[i][j] > matriz[i][j + 1]) && (matriz[i][j] > matriz[i + 1][j])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    } else if (j == columnas - 1) {
                        if ((matriz[i][j] > matriz[i][j - 1]) && (matriz[i][j] > matriz[i + 1][j])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    } else {
                        if ((matriz[i][j] > matriz[i + 1][j]) && (matriz[i][j] > matriz[i][j - 1]) && (matriz[i][j] > matriz[i][j + 1])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    }
                } else if (i == filas - 1) {
                    if (j == 0) {
                        if ((matriz[i][j] > matriz[i][j + 1]) && (matriz[i][j] > matriz[i - 1][j])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    } else if (j == columnas - 1) {
                        if ((matriz[i][j] > matriz[i][j - 1]) && (matriz[i][j] > matriz[i - 1][j])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    } else {
                        if ((matriz[i][j] > matriz[i - 1][j]) && (matriz[i][j] > matriz[i][j - 1]) && (matriz[i][j] > matriz[i][j + 1])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    }
                } else {
                    if (j == 0) {
                        if ((matriz[i][j] > matriz[i - 1][j]) && (matriz[i][j] > matriz[i + 1][j]) && (matriz[i][j] > matriz[i][j + 1])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    } else if (i == filas - 1) {
                        if ((matriz[i][j] > matriz[i - 1][j]) && (matriz[i][j] > matriz[i][j - 1]) && (matriz[i][j] > matriz[i][j + 1]) && (matriz[i][j] > matriz[i][j - 1])) {
                            System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                        }
                    }
                    if ((matriz[i][j] > matriz[i - 1][j]) && (matriz[i][j] > matriz[i][j - 1]) && (matriz[i][j] > matriz[i + 1][j]) && (matriz[i][j] > matriz[i][j + 1])) {
                        System.out.println("Pico en (" + i + ", " + j + ")" + ": " + matriz[i][j]);
                    }
                }

            }
        }
    }

}
}
