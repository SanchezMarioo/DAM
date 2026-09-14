/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema532;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Problema532 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int casos = 0;
        int numero = 0;
        int num2 = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        casos = sc.nextInt();

        if (casos > 0 || casos <= 1000) {
            for (int i = 0; i < casos; i++) {
                numero = sc.nextInt();
                num2 = sc.nextInt();
                resultado = num2 - numero;
                System.out.println(resultado);
            }
            

        }
    }

}
