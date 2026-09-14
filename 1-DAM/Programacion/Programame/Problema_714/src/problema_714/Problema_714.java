/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_714;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Problema_714 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < (numCasos / 4); i++) {
            numCasos /= 2;
            for (int j = 0; j < numCasos; j++) {
                if (i < 2) {
                    String equipos = sc.nextLine();
                } else {
                    int num = sc.nextInt();
                }

            }
        }

    }

}
