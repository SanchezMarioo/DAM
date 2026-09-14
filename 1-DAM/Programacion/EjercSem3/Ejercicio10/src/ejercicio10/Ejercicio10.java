/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

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
        Scanner sc = new Scanner(System.in);
        int metaAhorro = 0, deposito, sumaDeposito = 0, contador = 0, faltaDinero = 0;
        System.out.println("Cual es la meta de ahorro: ");
        metaAhorro = sc.nextInt();
        System.out.println("Tu objetivo de ahorro es: " + metaAhorro + "\n");
        do {
            System.out.println("¿De cuanto es el deposito que has hecho?: ");
            deposito = sc.nextInt();
            contador++;
            sumaDeposito += deposito;
            faltaDinero = metaAhorro - sumaDeposito;
            if (sumaDeposito < metaAhorro) {
                System.out.println("No has llegado a la meta te falta " + faltaDinero + " $");
            } else if (sumaDeposito == metaAhorro) {
                System.out.println("¡Objetivo cumplido!");
            } else {
                System.out.println("¡Te has pasado, ahorrador experto!");
                
            }
        } while (sumaDeposito < metaAhorro);
        System.out.println("Para ello has necesitado hacer " + contador + " depositos");
    }

}
