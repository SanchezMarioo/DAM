/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analizador_frases;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Analizador_Frases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String palabra = "";
        String frase = sc.nextLine().trim() + " "; // añadimos un espacio final para detectar la última palabra
        int caracteres = 0, a = 0, e = 0, iC = 0, o = 0, u = 0, contadorPalabras = 0, empiezaLetra = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                palabra += c; // Suma letras para hacer la palabra
                caracteres++;
                palabra = palabra.toLowerCase();
                char primeraLetra = palabra.charAt(0);
                char ultimaLetra = palabra.charAt(palabra.length() - 1);
                if (primeraLetra == ultimaLetra) {
                    empiezaLetra++;
                }
                char letraMinuscula = Character.toLowerCase(c);
                if (letraMinuscula == 'a') {
                    a++;
                } else if (letraMinuscula == 'e') {
                    e++;
                } else if (letraMinuscula == 'i') {
                    iC++;
                } else if (letraMinuscula == 'o') {
                    o++;
                } else if (letraMinuscula == 'u') {
                    u++;
                }
            } else {
                palabra = "";
                contadorPalabras++;
            }

        }
        System.out.println("Total de caracteres (sin espacios): " + caracteres);
        System.out.println("Número de palabras: " + contadorPalabras);
        System.out.println("Vocales: a=" + a + ", e=" + e + ", i=" + iC + ", o=" + o + ", u=" + u + " ");
        System.out.println("Palabras que empiezan y terminan con la misma letra: " + empiezaLetra);
        char primera = frase.charAt(0);
        char ultima = frase.charAt(frase.trim().length() - 1);
        System.out.println(primera);
        System.out.println(ultima);
        if ((primera == '¿' && ultima == '?') || (primera == '¡' && ultima == '!')) {
            System.out.println("La frase termina correctamente con signo de apertura y cierre.");
        } else if (ultima == '!') {
            System.out.println("La frase termina con signo de exclamación.");
        } else if (ultima == '?') {
            System.out.println("La frase termina con signo de interrogación.");
        } else {
            System.out.println("La frase no termina con signo de exclamación ni interrogación.");
        }

    }

}
