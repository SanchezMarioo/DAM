/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

/**
 *
 * @author Mario
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[50];
        for (int i = 0; i < numeros.length; i++) {
            int numero = (int) (Math.random() * 50 + 1);
            numeros[i] = numero;
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = j;
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;

                }
            }
        }
        for (int i = 1; i <= numeros.length - 1; i++) {
            System.out.print(numeros[i] + "\t");
            if (i % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("");
    }

}
