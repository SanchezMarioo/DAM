/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroHormigas, numeroAranas,numeroCochinillas,sumaTodo;
        Scanner sc = new Scanner (System.in);
        System.out.print("Cuantas hormigas has encontrado: ");
        numeroHormigas = sc.nextInt();
        numeroHormigas = numeroHormigas * 6;
        System.out.print("Cuantas arañas has encontrado: ");
        numeroAranas = sc.nextInt();
        numeroAranas = numeroAranas * 8;
        System.out.print("Cuantas cochinillas has encontrado: ");
        numeroCochinillas = sc.nextInt();
        numeroCochinillas = numeroCochinillas * 14;
        
        sumaTodo = numeroHormigas + numeroAranas + numeroCochinillas;
        
        
        System.out.println(sumaTodo);
        
    }
    
}
