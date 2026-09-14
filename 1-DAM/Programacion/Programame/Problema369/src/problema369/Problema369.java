/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema369;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Problema369 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = -1;
        String contador;
        Scanner sc = new Scanner(System.in);
        do {
            numero = sc.nextInt();
            if (numero > 0 || numero <= 1000) {
                for (int i = 1; i <= numero; i++) {
                    contador = "1";
                    System.out.print(contador);
                    if (numero == 0) {
                        break;
                    } 
                }
                System.out.println();
                
            }
        } while (numero != 0);
    }

}
