/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
            
        }
        System.out.println(factorial);
    }

}
