/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.print("Dime un numero:  ");
        numero = input.nextInt();
        int esPar;
        esPar = numero % 2;
        boolean esParBool;
        esParBool = esPar == 0;
        System.out.println("El numero " + numero +  " es par " + esParBool);
        
        
        
    }
    
}
