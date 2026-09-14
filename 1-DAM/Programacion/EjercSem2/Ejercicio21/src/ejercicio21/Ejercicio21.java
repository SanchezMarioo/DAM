/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTeclado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero (1-12) : ");
        numeroTeclado = sc.nextInt();
        
        int eleccion = switch (numeroTeclado){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };
        System.out.println("El mes " + numeroTeclado +  " tiene " + eleccion + " dias");

    }

}
