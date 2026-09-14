/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " " );
        }
        int[] numeros2 = new int[12];
        System.out.print("\nDime el numero añadir en la array: ");
        int numerosUsuario = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            numeros2[i] = numeros[i];

        }
         numeros2[numeros2.length - 1] = numerosUsuario;
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }
    }

}
