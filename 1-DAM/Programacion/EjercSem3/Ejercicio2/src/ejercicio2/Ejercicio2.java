/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int incioContador, finalContador, i;

        System.out.println("Numero incio contador: ");
        incioContador = sc.nextInt();
        System.out.println("Numero final contador: ");
        finalContador = sc.nextInt();
        i = incioContador;
        while (i < finalContador - 1) {
            i++;
            System.out.println(i);

        }
        int numeros = finalContador - incioContador - 1;
        System.out.println("Se mostraron " + numeros + " numeros");

    }

}
