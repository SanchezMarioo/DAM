/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char caracter;

        do {
            System.out.print("Introduce un carácter (Z para salir): ");
            caracter = sc.next().charAt(0); // Leer el primer carácter de la entrada

            if (caracter == 'Z') {
                System.out.println("Programa terminado.");
                break;
            }
            
            if (esVocal(caracter)) {
                System.out.println("El carácter es una vocal.");
            } else {
                System.out.println("El carácter no es una vocal.");
            }
        } while (caracter != 'Z');
    }

    static boolean esVocal(char c) {
        c = Character.toLowerCase(c); // Convertir a minúscula para simplificar la comparación
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
