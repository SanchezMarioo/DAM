/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramideimpares;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class PiramideImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int altura, n = 1, nAsignacion = 1;
        Scanner sc = new Scanner(System.in);
        altura = sc.nextInt();

        for (int i = 0; i <= altura; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");
                n += 2;
            }
        }
    }

}
