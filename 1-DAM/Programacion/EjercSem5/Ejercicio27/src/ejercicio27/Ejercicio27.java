/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'r', 's', 't', 'u', 'v'};
        char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'q', 's'};
        Scanner sc = new Scanner(System.in);
        String palabraCodificada = "";
        String palabra = sc.next().toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            char letraCodificada = codifica(conjunto1, conjunto2, c);
            palabraCodificada += letraCodificada;
        }
        System.out.println("La palabra codificada es: " + palabraCodificada);
        sc.close();
    }

    static char codifica(char[] conjuntol, char[] conjunto2, char c) {
        char letraCodificada = ' ';
        for (int i = 0; i < conjuntol.length; i++) {
            if (c == conjuntol[i]) {
                return conjunto2[i];
            }
        }
        return c;
    }

}
