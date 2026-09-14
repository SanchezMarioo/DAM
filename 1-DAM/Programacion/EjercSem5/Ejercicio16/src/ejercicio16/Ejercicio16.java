/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion = 0;
        do {
            System.out.println("========== MENÚ ==========");
            System.out.println("0. Salir");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Elige una opción: ");
            Scanner sc = new Scanner(System.in);
            double resultado = 0;
            eleccion = sc.nextInt();
            if (eleccion == 0) {
                break;
            }
            System.out.print("Ingresa el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = sc.nextDouble();

            switch (eleccion) {
                case 1 ->
                    resultado = suma(num1, num2);
                case 2 ->
                    resultado = resta(num1, num2);
                case 3 ->
                    resultado = multi(num1, num2);
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("Error: división por cero");
                        resultado = 0;
                    } else {
                        resultado = division(num1, num2);
                    }
                }
                default ->
                    System.out.println("NO valido");
            }
            System.out.println("El resultado es " + resultado);
        } while (true);
    }

    static double suma(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    static double resta(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    static double multi(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    static double division(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }

}
