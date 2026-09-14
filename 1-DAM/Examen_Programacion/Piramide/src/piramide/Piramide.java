/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                if(j == 0 || j == numero){
                    System.out.print(" \n");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
