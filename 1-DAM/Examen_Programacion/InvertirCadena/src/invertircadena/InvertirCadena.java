/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertircadena;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class InvertirCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "",palabraAlReves = "";
        char letra;
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            letra = palabra.charAt(i);
            palabraAlReves += letra;

        }
        System.out.println("La palabra al reves es: " + palabraAlReves );
    }

}
