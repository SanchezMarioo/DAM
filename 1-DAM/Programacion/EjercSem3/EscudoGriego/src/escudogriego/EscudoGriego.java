/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escudogriego;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class EscudoGriego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroImpar = 0;

        char caracter;
        System.out.println("Introduce numero impar: ");
        numeroImpar = sc.nextInt();
        System.out.println("Introduce el caracter a imprimir:");
        caracter = sc.next().charAt(0);
        int ancho = numeroImpar;
        if (numeroImpar % 2 != 0 && numeroImpar >= 5) {
            for (int i = 0; i <= numeroImpar; i++) {
                for (int j = 0; j <= numeroImpar; j++) {
                    if (j == 0 || i == 0 || j == numeroImpar || i == numeroImpar || j == i) {
                        System.out.print(caracter + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();

            }
        }
    }

}
