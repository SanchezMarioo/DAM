/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_sinrep;

/**
 *
 * @author Mario
 */
public class Matriz_SinRep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int COLUMNAS = 8;
        final int FILAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        int maximo = 99;
        int minimo = 10;
        int numeroRandom = 0;
        int numeroMayor50 = 0;
        boolean[] numeros = new boolean[maximo + 1];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                do {
                    numeroRandom = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
                } while (numeros[numeroRandom]);
                numeros[numeroRandom] = true;
                matriz[i][j] = numeroRandom;
                if (numeroRandom >= 50) {
                    numeroMayor50++;
                }
                
            }
            
        }
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Cantidad de números mayores o iguales a 50: " + numeroMayor50);
    }

}
