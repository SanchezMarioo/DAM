/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precioiva;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class PrecioIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double IVA, numero,calculoIVA;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime el numero (float): ");
        numero = sc.nextInt();
        System.out.println("Dime porcentaje de IVA (float): ");
        IVA = sc.nextInt();
        calculoIVA = IVA / 100;
        double totalNumero = calculoIVA * numero;
        totalNumero = numero - totalNumero;
        System.out.printf("Total %.2f%n",totalNumero);
        System.out.printf("Total %.0f%n",totalNumero);
        
    }
    
}
