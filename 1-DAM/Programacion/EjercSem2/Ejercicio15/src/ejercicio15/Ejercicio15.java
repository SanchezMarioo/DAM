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
        int numeroTeclado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numeroTeclado = sc.nextInt();
        if (numeroTeclado < -99999 || numeroTeclado > 99999) {
            System.out.println("No se encuentra en el rango");
        } else {
            // Codigo innecesario debido a que lo puedes invertir el valor 
            // Se puede hacer con ternarias 
            if (numeroTeclado <= 0 && numeroTeclado >= -10) {
                System.out.println(1);
            } else if (numeroTeclado <= -10 && numeroTeclado >= -99) {
                System.out.println(2);
            } else if (numeroTeclado <= -100 && numeroTeclado >= -999) {
                System.out.println(3);
            } else if (numeroTeclado <= -1000 && numeroTeclado >= -9999) {
                System.out.println(4);
            }else if (numeroTeclado <= -10000 && numeroTeclado >= -99999) {
                System.out.println(5);
            }
            else if (numeroTeclado >= 10 && numeroTeclado <= 99) {
                System.out.println(2);
            } else if (numeroTeclado >= 100 && numeroTeclado <= 999) {
                System.out.println(3);
            } else if (numeroTeclado >= 1000 && numeroTeclado <= 9999) {
                System.out.println(4);
            } else if (numeroTeclado >= 10000 && numeroTeclado <= 99999) {
                System.out.println(5);
            }
        }
    }

}
