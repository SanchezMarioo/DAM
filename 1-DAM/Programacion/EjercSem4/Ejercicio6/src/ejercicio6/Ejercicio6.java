/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        final int LONGITUD_ARRAY = 50;

        int numPositivo = 0, numNegativo = 0, numCero = 0, numMaximo = 0, numMinimo = 0;
        int[] numeros = new int[LONGITUD_ARRAY];

        // Mostrar menú al usuario
        System.out.println("Pulsa 0 para mostrar cuántos ceros tiene el array");
        System.out.println("Pulsa 1 para mostrar cuántos números positivos tiene el array");
        System.out.println("Pulsa 2 para mostrar cuántos números negativos tiene el array");
        System.out.println("Pulsa 3 si se quiere ver el número mayor");
        System.out.println("Pulsa 4 si se desea conocer el número menor");
        System.out.print("Escoge una opción: ");
        int tecladoNumero = sc.nextInt();
        // Generar números aleatorios y clasificar por positivos, negativos y ceros
        for (int i = 0; i < LONGITUD_ARRAY; i++) {
            int numero = (int) (Math.random() * 201) - 100; // rango -100 a 100
            // Sacar el numero máximo
            if (numMaximo < numero) {
                numMaximo = numero;
            }
            // Sacar el numero minimo
            if (numMinimo > numero) {
                numMinimo = numero;
            }
            numeros[i] = numero;
            if (numero > 0) {
                numPositivo++;
            } else if (numero < 0) {
                numNegativo++;
            } else {
                numCero++;
            }
        }
        // Logica del usuario
        switch (tecladoNumero) {
            case 0:
                System.out.println("La cantidad de ceros es: " + numCero);
                break;
            case 1:
                System.out.println("La cantidad de números positivos es: " + numPositivo);
                break;
            case 2:
                System.out.println("La cantidad de números negativos es: " + numNegativo);
                break;
            case 3:
                System.out.println("El numero maximo del array es: " + numMaximo);
                break;
            case 4:
                System.out.println("El numero minimo del array es: " + numMinimo);
                break;
            default:
                System.out.println("Opción no válida. Debes elegir 0, 1 o 2.");
                break;
        }
    }

}
