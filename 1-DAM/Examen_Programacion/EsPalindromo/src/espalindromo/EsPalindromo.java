/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espalindromo;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class EsPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "", fraseAlReves = "";
        boolean esPalindromo = false;
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        char letra;
        frase = frase.replace(" " , "");
        frase = frase.toLowerCase();
        for (int i = frase.length() - 1 ; i >= 0; i--) {
            letra = frase.charAt(i);
            fraseAlReves += letra;
            fraseAlReves = fraseAlReves.toLowerCase();
            
        }
        if (frase.equals(fraseAlReves)){
            esPalindromo = true;
        }
        System.out.println("Esta frase es: " + esPalindromo);
    }

}
