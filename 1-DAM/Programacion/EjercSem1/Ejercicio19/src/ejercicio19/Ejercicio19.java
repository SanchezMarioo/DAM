/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int numeroEntero,resultado;
        System.out.print("Indica el numero entero: ");
        numeroEntero = sc.nextInt();
        resultado = numeroEntero % 7;
        int resultadoSuma = (7-(resultado%7))%7;        
        System.out.println("Hasta llegar al multiplo de 7 es: " + resultadoSuma);
        
        
    }
    
}
