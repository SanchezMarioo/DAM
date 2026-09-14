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
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        float precioTicket;
        System.out.print("Precio compra total tienda: ");
        precioTicket = sc.nextFloat();
        if (precioTicket >=500){
            precioTicket *= 0.9;
        }
        System.out.println("Precio ticket: " + precioTicket + "?");
    }
    
}
