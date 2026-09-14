/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0, sumaTotal = 0;
        final int MAXIMOSENTEROS = 8;
        for (int i = 1; i <= MAXIMOSENTEROS; i++) {
            System.out.println("Dime un numero: " + i);
            numero = sc.nextInt();
            suma += numero;
            
        }
        sumaTotal = suma / MAXIMOSENTEROS;
        System.out.println("La media de los primeros " + MAXIMOSENTEROS + " numero es: " + sumaTotal);
    }

}
