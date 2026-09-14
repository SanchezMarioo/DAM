/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador_vocales;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Contador_Vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "Hola";
        Scanner sc = new Scanner(System.in);
        char letra;
        boolean salirBucle = false;
        int contador = 0;
        do {
            System.out.println("Introduce una frase: ");
            frase = sc.nextLine();
            for (int j = 0; j < frase.length(); j++) {
                letra = frase.charAt(j);
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    contador++;
                } else if (letra == '.') {
                    salirBucle = true;
                    break;
                }
            }

        } while (!salirBucle);
        System.out.println("La frase tiene " + contador);

    }

}
