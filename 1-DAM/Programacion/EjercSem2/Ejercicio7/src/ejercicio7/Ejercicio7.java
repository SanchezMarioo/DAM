/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero casi/cero: ");
        numero = sc.nextFloat();

        if (numero != 0 && numero < 1 && numero > -1) {
            System.out.println("Numero casi cero ");
        } else {
            System.out.println("No es numero casi cero");
        }

    }

}
