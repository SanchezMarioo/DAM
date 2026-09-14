/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

/**
 *
 * @author Mario
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[6][6];
        int contador = 0;
        boolean esRep = false;
        int filas = 0;
        int columnas = -1;
        int numeroRandom = 0;
        do {
            esRep = false;
            contador++;
            if (columnas == 5 && filas == 5) {
                break;
            }
            if (columnas < 5) {
                columnas++;
            } else {
                columnas = 0;
                filas++;
            }
            numeroRandom = (int) (Math.random() * 101);
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] == numeroRandom) {
                        contador--;
                        esRep = true;
                        break;
                    }
                }
            }
            if (!esRep) {
                matriz[filas][columnas] = numeroRandom;

            } else {
                contador--;
                columnas--;
            }

        } while (true);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
