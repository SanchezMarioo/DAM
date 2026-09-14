/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();

        char[] letras = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
<<<<<<< HEAD
            'n','ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
=======
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
>>>>>>> 9acba2a98c6fa66f04cea7663482c926b7ee90a3
        };

        int[] contador = new int[letras.length];

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            // Convertimos el char a String para usar valueOf
            String letra = String.valueOf(c);

            for (int j = 0; j < letras.length; j++) {
                if (letra.equals(String.valueOf(letras[j]))) {
                    contador[j]++;
                }
            }
        }
<<<<<<< HEAD

        System.out.println("Repeticiones de letras:");
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0) {
                System.out.println(letras[i] + ": " + contador[i]);
            }
        }

=======
        System.out.println("Repeticiones de letras:");
        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > 0) {
                System.out.println(letras[i] + ": " + contador[i]);
            }
        }

>>>>>>> 9acba2a98c6fa66f04cea7663482c926b7ee90a3
        sc.close();
    }
}
