/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricesejerciciob;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class MatricesEjercicioB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "";
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;

        boolean formatoCorrecto = true;
        int[][] matrices = new int[3][3];
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices.length; j++) {
                matrices[i][j] = 0;
            }
        }
        do {
            formatoCorrecto = true;
            System.out.print("Dime las coordenadas (x,y): ");
            frase = sc.nextLine();
            if (frase.length() > 3) {
                System.out.println("Formato incorrecto");
                formatoCorrecto = false;
            }
            if (frase.equals("FIN")) {
                continue;
            }
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (frase.charAt(1) != ',') {
                    System.out.println("Formato incorrecto");
                    formatoCorrecto = false;
                    break;
                } else {
                    String[] numeros = frase.split(",");
                    fila = Integer.parseInt(numeros[0]);
                    columna = Integer.parseInt(numeros[1]);

                    if ((fila < 0 || fila > 2) && (columna < 0 || columna > 2)) {
                        System.out.println("Introduce un numero del (0-2)");
                        formatoCorrecto = false;
                        break;

                    }

                }
            }
            matrices[fila][columna]++;
            if (formatoCorrecto) {

                for (int j = 0; j < matrices.length; j++) {
                    for (int k = 0; k < matrices.length; k++) {
                        System.out.print(matrices[j][k] + "\t");
                    }
                    System.out.println();
                }
            }
        } while (!frase.equals("FIN"));
    }
}
