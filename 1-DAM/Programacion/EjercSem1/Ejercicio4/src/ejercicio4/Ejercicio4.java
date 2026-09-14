/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fechaNacimiento;
        int fechaActual;
        System.out.print("¿Que año naciste: ");
        fechaNacimiento = input.nextInt();
        System.out.print("En que año estamos: ");
        fechaActual = input.nextInt();
        int diferenciaAnos;
        diferenciaAnos = fechaActual - fechaNacimiento;
        System.out.println("Tu edad es: " + diferenciaAnos);
        
    }
    
}
