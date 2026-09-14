/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroinputteclado;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class NumeroInputTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean esPrimo = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i < 100; i++) {
            esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                } else {

                    continue;
                }
            }
            if (esPrimo) {
                System.out.println(i);
            }

        }
    }

}
