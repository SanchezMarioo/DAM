/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11ç;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio11ç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = sc.nextInt();
        if (num1 == num2) {
            System.out.println("El numero " + num1 + " es igual que " + num2);
        } else {
            if (num1 > num2) {
                System.out.println("El numero " + num1 + " es mayor que " + num2);
            } else {
                System.out.println("El numero " + num2 + " es menor que " + num1);
            }
        }
    }
}
