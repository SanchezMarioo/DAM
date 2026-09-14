/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        final int LONGITUD_ARRAY = 5;
        char[] letras = new char[LONGITUD_ARRAY];
        for (int i = 0; i < LONGITUD_ARRAY; i++) {
            System.out.print("Dime el caracter para añadir al array: ");
            char caracter = sc.next().charAt(0);
            letras[i] = caracter;

        }
        for (int j = LONGITUD_ARRAY - 1; j >= 0; j--) {
            System.out.print(letras[j] + " ");
        }
    }

}
