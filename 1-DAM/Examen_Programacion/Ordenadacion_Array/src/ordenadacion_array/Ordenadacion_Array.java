/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenadacion_array;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ordenadacion_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeros[] = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("No es un numero MELON!");
                sc.next();
            }
            int numeroImprimir = sc.nextInt();
            numeros[i] = numeroImprimir;
        }
        for (int i = 0; i < numeros.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            int aux = numeros[indiceMinimo];
            numeros[i] = numeros[indiceMinimo];
            numeros[i] = aux;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
    }

}
