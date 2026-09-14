/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige si quieres dos o tres numeros: ");
        int eleccion = sc.nextInt();
        if (eleccion == 2) {
            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();
            double max = maximo(num1, num2);
            System.out.println("El número máximo es: " + max);
        } else if (eleccion == 3) {
            System.out.print("Introduce el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double num2 = sc.nextDouble();
            System.out.print("Introduce el tercer número: ");
            double num3 = sc.nextDouble();
            double max = maximo(num1, num2, num3);
            System.out.println("El número máximo es: " + max);
        } else {
            System.out.println("Elige una opcion correcta");
        }

    }

    static double maximo(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static double maximo(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
