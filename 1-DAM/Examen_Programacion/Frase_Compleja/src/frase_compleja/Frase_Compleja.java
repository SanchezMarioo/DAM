/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frase_compleja;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Frase_Compleja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().trim() + " "; // añadimos un espacio final para detectar la última palabra

        int totalPalabras = 0;
        int mismoInicioFin = 0;
        int masDeCinco = 0;

        String palabra = "";
        System.out.println("Palabras invertidas:");

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c != ' ') {
                palabra += c;
            } else if (!palabra.isEmpty()) {
                totalPalabras++;

                // Comprobar si empieza y termina con la misma letra
                char primera = Character.toLowerCase(palabra.charAt(0));
                char ultima = Character.toLowerCase(palabra.charAt(palabra.length() - 1));
                if (primera == ultima) {
                    mismoInicioFin++;
                }

                // Comprobar si tiene más de 5 letras
                if (palabra.length() > 5) {
                    masDeCinco++;
                }

                // Mostrar la palabra invertida
                for (int j = palabra.length() - 1; j >= 0; j--) {
                    System.out.print(palabra.charAt(j));
                }
                System.out.println();

                // Reiniciar la palabra
                palabra = "";
            }
        }

        System.out.println("\nNúmero total de palabras: " + totalPalabras);
        System.out.println("Palabras que empiezan y terminan con la misma letra: " + mismoInicioFin);
        System.out.println("Palabras con más de 5 letras: " + masDeCinco);

    }

}
