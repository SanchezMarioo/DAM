/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double primeraMedida,segundaMedida,terceraMedida,resultado;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la primera medida (mm): ");
        primeraMedida = input.nextInt();
        System.out.print("Introduce la segunda medida (cm): ");
        segundaMedida = input.nextInt();
        System.out.print("Introduce la tercera medida (m): ");
        terceraMedida = input.nextInt();
        primeraMedida = primeraMedida / 10;
        terceraMedida = terceraMedida * 100;
        resultado = primeraMedida + segundaMedida + terceraMedida;
        System.out.println("Total medida: " + resultado);
        
    }
    
}
