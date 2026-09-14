/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte num1,num2;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un primer numero: ");
        num1 = sc.nextByte();
        System.out.print("Introduce un segundo numero: ");
        num2 = sc.nextByte();
        
        if (num1 == num2) {
            System.out.println("El numero " + num1 + " es igual que " + num2);
        } else{
            System.out.println("El numero " + num1 + " NO es igual que " + num2);
        }
        
    }
    
}
