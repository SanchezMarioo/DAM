/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letras_posicion;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Letras_Posicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabraDos, palabra, letrasComun = "";
        char letraPalabra;
        int posicionLetra, contador = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra: ");
        palabra = sc.nextLine();
        System.out.println("Escribe otra palabra: ");
        palabraDos = sc.nextLine();
        if (palabra.length() != palabraDos.length()) {
            return;
        }
        for (int i = 0; i < palabra.length(); i++) {
            letraPalabra = palabra.charAt(i);
            posicionLetra = palabraDos.indexOf(letraPalabra);
            if (palabra.charAt(i) == palabraDos.charAt(i)) {
                letrasComun += palabra.charAt(i) + ", ";
            }
        }
        System.out.println("Coinciden " + letrasComun + " letras en la misma posición.");
    }

}
