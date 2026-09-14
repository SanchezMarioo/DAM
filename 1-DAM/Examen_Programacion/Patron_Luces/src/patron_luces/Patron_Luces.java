/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patron_luces;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Patron_Luces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int matriz[][] = new int[n][n];
        int comandos = 0;
        n--;
        while (comandos < k) {
            comandos++;
            int fila = 0;
            int columna = 0;

            do {
                fila = sc.nextInt() - 1;
                columna = sc.nextInt() - 1;
                if (fila < 0 || fila > n || columna < 0 || columna > n) {
                    System.out.println("Formato incorrecto");
                }
            } while (fila < 0 || fila > n || columna < 0 || columna > n);
            if ((fila == 0 && columna == 0)) {
                matriz[fila][columna] = 1;
                matriz[fila][columna + 1] = 1;
                matriz[fila + 1][columna] = 1;
                continue;
            }
            if (columna == 0) {
                matriz[fila][columna] = 1;
                matriz[fila][columna + 1] = 1;
                matriz[fila + 1][columna] = 1;
                continue;
            }
            if (columna == n && fila == 0) {
                matriz[fila][columna] = 1;
                matriz[fila][columna - 1] = 1;
                matriz[fila + 1][columna] = 1;
                continue;
            }
            if (columna == n) {
                matriz[fila][columna] = 1;
                matriz[fila][columna - 1] = 1;
                matriz[fila - 1][columna] = 1;
                continue;
            }
            if (fila == n) {
                matriz[fila][columna] = 1;
                matriz[fila][columna - 1] = 1;
                matriz[fila - 1][columna] = 1;
                continue;
            }

            if (fila == 0) {
                matriz[fila][columna] = 1;
                matriz[fila][columna + 1] = 1;
                matriz[fila + 1][columna] = 1;
                matriz[fila][columna - 1] = 1;
                continue;

            }
            if (fila >= 1 || columna >= 1) {
                matriz[fila + 1][columna] = 1;
                matriz[fila - 1][columna] = 1;
                matriz[fila][columna + 1] = 1;
                matriz[fila][columna - 1] = 1;
                matriz[fila][columna] = 1;
                continue;
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }

    }
}
