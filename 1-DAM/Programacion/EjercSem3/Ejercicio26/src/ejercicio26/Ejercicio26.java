/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int alto, ancho;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el alto: ");
        alto = sc.nextInt();
        System.out.println("Dime el ancho: ");
        ancho = sc.nextInt();

        for (int i = 0; i <= alto; i++) {
            System.out.print("\n");
            for (int j = 0; j <= ancho; j++) {
                if (i == 0 || j == 0 || j == ancho || i == alto) {
                    System.out.print("*");

                } else {
                    System.out.print(".");
                }

            }
        }
    }

}
