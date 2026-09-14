/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroTeclado, i = 0;
        System.out.println("Introduce el numero (1-100) : ");
        numeroTeclado = sc.nextInt();

        while (numeroTeclado > i) {
            if (numeroTeclado > 100) {
                System.out.println("Es mayor que 100 ");
                break;
            } else {
                i++;
                System.out.println("Buenos Dias " + i);
            }
        }

    }

}
