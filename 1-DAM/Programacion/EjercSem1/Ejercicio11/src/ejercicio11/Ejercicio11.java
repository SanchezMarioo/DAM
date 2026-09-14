/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        final float PRECIOKGMANZANAS;
        final float PRECIOKGPERAS;
        PRECIOKGMANZANAS = 2.35f;
        PRECIOKGPERAS = 1.35f;
        float kgManzanas;
        float kgPeras;
        System.out.print("¿Cuantos KG has vendido de manzanas este semestre?: ");
        kgManzanas = input.nextFloat();
        System.out.print("¿Cuantos KG has vendido de peras este semestre?: ");
        kgPeras = input.nextFloat();
        System.out.print("¿Cuantos KG has vendido de manzanas este segundo semestre?: ");
        kgManzanas += input.nextFloat();
        System.out.print("¿Cuantos KG has vendido de peras este segundo semestre?: ");
        kgPeras += input.nextFloat();
        float ventasTotalManzanas;
        float ventasTotalPeras;
        
        ventasTotalManzanas = kgManzanas * PRECIOKGMANZANAS;
        ventasTotalPeras = kgPeras * PRECIOKGPERAS;
        float ventasTotal = ventasTotalManzanas + ventasTotalPeras;
        System.out.println("El importe total es de: " + ventasTotal + "€");
        
        
        
    }
    
}
