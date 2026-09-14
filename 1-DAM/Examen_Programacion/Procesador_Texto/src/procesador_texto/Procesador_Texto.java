/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesador_texto;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Procesador_Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String frase = "";
        String palabra = "";
        int contadorPalabra = 1;
        frase = sc.nextLine();
        frase += "  ";

        for (int i = 0; i < frase.length() - 1; i++) {
            char caracter = frase.charAt(i);

            if (caracter != ' ') {
                palabra += caracter;
            } else {
                System.out.println(palabra);
                char primeraLetra = palabra.charAt(0);
                primeraLetra = Character.toLowerCase(primeraLetra);
                if (primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i' || primeraLetra == 'o' || primeraLetra == 'u') {
                    System.out.println("Palabra " + contadorPalabra + " empieza por vocal " + " " + palabra.length());
                } else {
                    System.out.println("Palabra " + contadorPalabra + " empieza por consonante " + " " + palabra.length());
                }
                palabra = "";
                contadorPalabra++;
            }

        }
    }

}
