/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema369;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Problema369 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        do {
            numero = sc.nextInt();
            if (numero != 0) {
                
                for (int i = 0; i < numero; i++) {
                    System.out.print("1");
                }
                System.out.println();
            }

        } while (numero != 0);

    }

}
