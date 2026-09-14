/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;
        int numeroOrdenado1 = 0, numeroOrdenado2 = 0, numeroOrdenado3 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cual es el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Dime cual es el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Dime cual es el tercer numero: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            numeroOrdenado1 = num1;
            if (num2 > num3) {
                numeroOrdenado2 = num2;
                numeroOrdenado3 = num3;
            } else {
                numeroOrdenado2 = num3;
                numeroOrdenado3 = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            numeroOrdenado1 = num2;
            if (num1 > num3) {
                numeroOrdenado2 = num1;
                numeroOrdenado3 = num3;
            } else {
                numeroOrdenado2 = num3;
                numeroOrdenado3 = num1;
            }
        } else if (num3 > num1 && num3 > num2) {
            numeroOrdenado1 = num3;
            if (num1 > num2) {
                numeroOrdenado2 = num1;
                numeroOrdenado3 = num2;
            } else {
                numeroOrdenado2 = num2;
                numeroOrdenado3 = num1;
            }
        }
        System.out.println("Ordenados de mayor a menor: " + numeroOrdenado1 + "," + numeroOrdenado2 + "," + numeroOrdenado3 );

    }

}
