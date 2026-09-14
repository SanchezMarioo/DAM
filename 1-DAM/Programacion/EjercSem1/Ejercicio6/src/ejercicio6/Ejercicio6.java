/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int notaPrimera;
        int notaSegunda;
        System.out.print("Cual es la primera nota: ");
        notaPrimera = input.nextInt();
        System.out.print("Cual es la segunda nota: ");
        notaSegunda = input.nextInt();
        double notaMedia;
        notaMedia = (notaPrimera + notaSegunda) / 2.0; 
        // Se pone 2.0 por que se esta tratando con numeros enteros entoces lo trataria como numero entero y con esto se fuerza a que sea un float
        System.out.println("Tu nota media es: " + notaMedia);
        
        
    }
    
}
