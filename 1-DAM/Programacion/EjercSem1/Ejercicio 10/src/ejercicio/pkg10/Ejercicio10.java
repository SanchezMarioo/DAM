/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg10;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean estaLloviendo;
        boolean hemosTerminadoTareas;
        boolean entregarLibro;
        boolean salirCalle;
        
        System.out.print("Esta lloviendo(true/false): ");
        estaLloviendo = input.nextBoolean();
        System.out.print("Hemos terminado las tareas(true/false): ");
        hemosTerminadoTareas = input.nextBoolean();
        System.out.print("Tienes que entregar algun libro(true/false): ");
        entregarLibro = input.nextBoolean();
        salirCalle = (!estaLloviendo && hemosTerminadoTareas) || entregarLibro;
        System.out.println("Puedes salir a la calle (true/false) " + salirCalle);
    }
    
}
