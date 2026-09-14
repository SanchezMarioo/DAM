/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {12, 3, 2, 45, 7, 1, 28, 9};
        final int NUMERO_AÑADIR = 50;
        int[] nuevo = new int[numeros.length + 1];

        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                nuevo[0] = NUMERO_AÑADIR;
            }
            nuevo[i + 1] = numeros[i];
        }
        for (int i = 0; i < nuevo.length; i++) {
            System.out.print(nuevo[i] + " ");
        }
    }

}
