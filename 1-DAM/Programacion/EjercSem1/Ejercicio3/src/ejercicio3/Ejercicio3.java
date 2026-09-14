/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        System.out.print("¿Cual es tu edad?: ");
        edad = input.nextInt();
        System.out.println("Su edad actual es de " + edad +  " annos.");
        edad+=10;
        System.out.println("En el anno 3035 tendras " + edad +  " annos.");

    }
    
}
