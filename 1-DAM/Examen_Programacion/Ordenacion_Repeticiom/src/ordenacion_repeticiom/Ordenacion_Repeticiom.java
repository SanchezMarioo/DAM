/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacion_repeticiom;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ordenacion_Repeticiom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int rep = 0;
        int numero = sc.nextInt();
        int numeros[] = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            int numeroAñadir = sc.nextInt();
            numeros[i] = numeroAñadir;
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int aux = numeros[indiceMinimo];
            numeros[indiceMinimo] = numeros[i];
            numeros[i] = aux;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    rep++;
                }

            }
            if (rep > 0) {
                System.out.println("Numero" + numeros[i] + " Repeticiones: " + (rep + 1));
            }
            rep = 0;

        }

    }

}
