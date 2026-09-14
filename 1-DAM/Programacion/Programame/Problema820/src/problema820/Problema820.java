/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema820;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Problema820 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int matrizTamano = sc.nextInt();
        int numCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCasos; i++) {
            char matriz[][] = new char[matrizTamano][matrizTamano];
            for (int j = 0; j < matrizTamano; j++) {
                String linea = sc.next();
                for (int k = 0; k < linea.length(); k++) {
                    matriz[j][k] = linea.charAt(k);
                }
            }
            for (int j = 0; j < matrizTamano; j++) {
                System.out.println("");
                for (int k = 0; k < matrizTamano; k++) {
                    System.out.print(matriz[j][k]);
                }
            }
            System.out.println("");
        }
    }

}
