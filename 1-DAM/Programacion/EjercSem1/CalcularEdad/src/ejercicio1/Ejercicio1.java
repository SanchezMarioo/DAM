/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        byte edad; 
        System.out.print("Introduce tu edad: ");
        edad = input.nextByte();
        System.out.println("Tu edad actualmente es de: " + edad);
        edad+=10;
        System.out.println("Tu edad dentro de 10 annos sera: " + edad);
        
        
            
    }
    
}
