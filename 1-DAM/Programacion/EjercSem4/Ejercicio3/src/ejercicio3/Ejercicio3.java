/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[10];
        int sumaNumerosRandom = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numeroRandom = (int) (Math.random() * 100) + 1;
            numeros[i] = numeroRandom;
        }
        for (int i = 0; i < numeros.length; i++) {
            sumaNumerosRandom += numeros[i];
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nLa suma de los " + numeros.length + " primeros numeros random es: " + sumaNumerosRandom);
    }

}
