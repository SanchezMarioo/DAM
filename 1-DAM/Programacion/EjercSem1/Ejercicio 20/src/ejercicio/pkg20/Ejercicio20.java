/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg20;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        boolean acompañadoAdulto,paseVip,resultado,mayorEdad;
        Scanner sc = new Scanner (System.in);
        System.out.print("¿Cuantos años tienes?: ");
        edad = sc.nextInt();
        mayorEdad = edad >= 12;
        System.out.print("¿Vas acompañado de un adulto (true/false): "); // Si vas solo, lo tengo que negar con !
        acompañadoAdulto = sc.nextBoolean();
        System.out.print("¿Vas tienes entrada VIP (true/false): ");
        paseVip = sc.nextBoolean();
        
        resultado = mayorEdad || acompañadoAdulto || paseVip;
        System.out.println("Puedes entrar: " + resultado);
        
        
        
        
    }
    
}
