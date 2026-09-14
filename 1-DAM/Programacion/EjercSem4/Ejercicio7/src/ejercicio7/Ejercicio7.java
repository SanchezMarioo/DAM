/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int LONGITUD_ARRAY = 45;
        int[] numeros = new int[LONGITUD_ARRAY];
        int numero, teclado, coincideArray = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Dime un número entre 0 y 100: ");
            teclado = sc.nextInt();
            if (teclado < 0 || teclado > 100) {
                System.out.println("Número no válido, debe estar entre 0 y 100.");
            }
        } while (teclado < 0 || teclado > 100);
        for (int i = 0; i < LONGITUD_ARRAY; i++) {
            numero = (int) (Math.random() * 100 + 1);

            if (numero == teclado) {
                coincideArray++;
            }
            numeros[i] = numero;

        }
        System.out.println("El numero " + teclado + " esta " + coincideArray + " veces");
    }

}
