/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        int contador = 1;
        int resultado = 0;
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.print("");

            for (int j = 1; j <= numero; j++) {
                System.out.println("*");
            }
        }
    }
}
