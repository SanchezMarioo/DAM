/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float baseImponible, iva, totalIVA;
        System.out.print("Indica la base imponible: ");
        baseImponible = input.nextFloat();
        System.out.print("Indica la IVA:");
        iva = input.nextFloat();
        totalIVA = (baseImponible * iva / 100) + baseImponible;
        System.out.println("El precio total con IVA es: " + totalIVA);
    }
}