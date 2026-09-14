/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, esImpar,suma = 0;
        final int IMPARES = 30;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < IMPARES * 2; i+=2) {
            suma+=i;
        }
        System.out.println(suma);
    }
}
