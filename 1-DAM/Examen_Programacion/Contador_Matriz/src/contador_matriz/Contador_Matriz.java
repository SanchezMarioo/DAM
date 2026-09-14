/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador_matriz;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Contador_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        String numeros[] = new String[2];
        boolean noEsCorrecto = false;
        int numero = 0;
        int fila = 0;
        int columna = 0;
        String coord = "";
        do {
            noEsCorrecto = false;
            coord = sc.nextLine();
            if (coord.length() != 3) {
                System.out.println("El formato no es correcto (fila;columna)");
                noEsCorrecto = true;
                continue;
            }

            if (!coord.contains(";")) {
                System.out.println("El formato no es correcto (fila;columna)");
                noEsCorrecto = true;
                continue;
            }
            if (noEsCorrecto) {
                System.out.println("El formato no es correcto (fila;columna)");
                continue;
            }
            numeros = coord.split(";");
            fila = Integer.parseInt(numeros[0]);
            columna = Integer.parseInt(numeros[1]);
            if ((fila < 0 || fila > 4) && (columna < 0 || columna > 4)){
                noEsCorrecto = true;
                System.out.println("El formato no es correcto (fila;columna)");
                continue;
            }
            matriz[fila][columna] += 2;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
        } while (!coord.equals("FIN"));

    }

}
