/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int aforoMaximo, numVendidasEntradas;
        float precioEntrada;
        final double porcentajeCancelaConcierto = 0.2;
        final double porcentajeSeRealizaRebaja = 0.5;
        final double rebajaEntrada = 0.8; // Es por lo que se multiplica es decir si se quiere un 30% se hara 0.7
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el aforo maximo: ");
        aforoMaximo = sc.nextInt();
        System.out.print("Dime el precio entrada: ");
        precioEntrada = sc.nextInt();
        System.out.print("Dime el numero de entradas vendidas: ");
        numVendidasEntradas = sc.nextInt();

        double seCancelaConcierto = aforoMaximo * porcentajeCancelaConcierto;

        double seRealizaRebaja = aforoMaximo * porcentajeSeRealizaRebaja;
        
        if (aforoMaximo < numVendidasEntradas) {
            System.out.println("El numero de entradas vendidas es mayor que el aforo maximo");
        }
        
        if (seCancelaConcierto > numVendidasEntradas) {
            System.out.println("Se cancela el concierto.");
        } else if (seRealizaRebaja > numVendidasEntradas) {
            precioEntrada*=rebajaEntrada;
            System.out.println("El precio final de la entrada: " + precioEntrada);
        } else {
            System.out.println("El concierto se mantiene y el precio de la entrada es " + precioEntrada);
        }

    }

}
