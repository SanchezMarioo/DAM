/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema217;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Problema217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = -1;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; numero != 0; i++) {
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("DERECHA");
                } else {
                    System.out.println("IZQUIERDA");
                }
            }
        }
    }

}
