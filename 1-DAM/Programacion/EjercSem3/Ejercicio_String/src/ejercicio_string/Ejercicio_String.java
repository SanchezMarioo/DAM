/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_string;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String nombreApellidos;
        String nombreSinEspacios;
        char letra;
        int longitud;
        
        System.out.println("Dime tu nombre con tus apellidos: ");
        nombreApellidos = sc.nextLine();
        nombreSinEspacios = nombreApellidos.replace(" ", "");
        longitud = nombreSinEspacios.length();
        for (int i = 0; i < nombreApellidos.length(); i++) {
            letra = nombreApellidos.charAt(i);
            System.out.println(letra);
        }
        System.out.println("La longitud es: " + longitud);
    }
    
}
