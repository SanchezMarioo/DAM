/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenadacion_java;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ordenadacion_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int contadorPares = 0;
        int contadorImpares = 0;
        int numeros[] = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            int numeroAñadir = sc.nextInt();
            numeros[i] = numeroAñadir;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        int pares[] = new int[contadorPares];
        int impares[] = new int[contadorImpares];
        contadorPares = 0;
        contadorImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }
        for (int i = 0; i < pares.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < pares.length; j++) {
                if (pares[j] < pares[indiceMin]) {
                    indiceMin = j;
                }
            }
            int aux = pares[indiceMin];
            pares[indiceMin] = pares[i];
            pares[i] = aux;

        }
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < impares.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1 ; j < impares.length; j++) {
                if (impares[j] < impares[indiceMin]) {
                    indiceMin = j;
                }
            }
            int aux = impares[indiceMin];
            impares[indiceMin] = impares[i];
            impares[i] = aux;
        }
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
            
        }
    }

}
