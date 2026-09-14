/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_impar_ordenar;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Par_Impar_Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeros[] = new int[numero];
        int caNum = 0;
        int cb[] = new int[numero / 3];
        int cm[] = new int[numero / 3];
        int contador = 0;
        if (numero % 2 == 0) {
            caNum = (numero / 3) + 1;
        } else {
            caNum = numero / 3;
        }
        int ca[] = new int[caNum];

        for (int i = 0; i < numeros.length; i++) {
            int numeroAñadir = sc.nextInt();
            numeros[i] = numeroAñadir;
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < cb.length; i++) {
            cb[i] = numeros[contador];
            contador++;
        }
        for (int i = 0; i < cm.length; i++) {
            cm[i] = numeros[contador];
            contador++;
        }
        for (int i = 0; i < ca.length; i++) {
            ca[i] = numeros[contador];
            contador++;

        }
        contador = 0;
        for (int i = 0; i < numero / 3 - 1; i++) {
            for (int j = numero / 3 - 1; j > 0; j--) {

                if (j == (numero / 3) - 1) {
                    numeros[contador] = ca[j];
                } else if (j == (numero / 3) - 2) {
                    numeros[contador] = cb[j];
                } else {
                    numeros[contador] = cm[j];
                }
                contador++;
            }

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }

}
