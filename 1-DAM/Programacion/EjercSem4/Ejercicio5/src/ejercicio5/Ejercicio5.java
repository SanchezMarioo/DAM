package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int LONGITUD_ARRAY = 50;

        int numPositivo = 0, numNegativo = 0, numCero = 0;
        int[] numeros = new int[LONGITUD_ARRAY];

        // Mostrar menú al usuario
        System.out.println("Pulsa 1 para mostrar cuántos números positivos tiene el array");
        System.out.println("Pulsa 2 para mostrar cuántos números negativos tiene el array");
        System.out.println("Pulsa 0 para mostrar cuántos ceros tiene el array");
        System.out.print("Escoge una opción: ");

        int tecladoNumero = sc.nextInt();

        // Generar números aleatorios y contarlos
        for (int i = 0; i < numeros.length; i++) {
            int numero = (int) (Math.random() * 201) - 100; // rango -100 a 100
            numeros[i] = numero;

            if (numero > 0) {
                numPositivo++;
            } else if (numero == 0) {
                numNegativo++;
            } else {
                numCero++;
            }
        }

        // Evaluar opción del usuario
        switch (tecladoNumero) {

            case 1:
                System.out.println("La cantidad de números positivos es: " + numPositivo);
                break;

            case 2:
                System.out.println("La cantidad de números negativos es: " + numNegativo);
                break;

            case 0:
                System.out.println("La cantidad de ceros es: " + numCero);
                break;

            default:
                System.out.println("Opción no válida. Debes elegir 0, 1 o 2.");
                break;
        }
    }
}
