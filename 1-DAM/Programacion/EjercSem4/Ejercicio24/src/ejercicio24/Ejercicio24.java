/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        int[] numeros = new int[10];
        boolean noEntra = false;
        System.out.println("Introduce un numero: ");
        numero = sc.nextInt();
        numeros[0] = numero;
        do {
            noEntra = false;
            contador++;
            System.out.println("Introduce un numero: " + contador);
            numero = sc.nextInt();
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numero) {
                    System.out.println("El numero esta repetido");
                    noEntra = true;
                    break;
                }
            }
            if (!noEntra) {
                numeros[contador] = numero;

            } else {
                contador--;
            }
        } while (contador < 9);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

}
