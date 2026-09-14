/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dime un numero:");
            numero = sc.nextInt();
        } while (numero < 0 || numero >= 10);
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + "*" + i + "=" + resultado);

        }
    }

}
