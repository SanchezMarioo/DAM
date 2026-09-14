/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_tablas;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio_Tablas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int FILAS = 6;
        final int COLUMNAS = 4;
        int datos[][];
        int numero = 1;
        datos = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                datos[i][j] = numero;
                numero++;
            }
        }
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
