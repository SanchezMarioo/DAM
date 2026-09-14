/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int respCliente, contador = 0, opcion = 0;
        float sumaPizza = 0;
        do {
            System.out.println(" \n ====== MENU RESTAURANTE ========");
            System.out.println("--------------------------------------");
            System.out.println("Nº Ingrediente Precio ($)");
            System.out.println("1 Queso Extra 1.50$");
            System.out.println("2 Jamon York 1.20$");
            System.out.println("3 Champiñones 1.00$");
            System.out.println("4 Bacon 1.40$");
            System.out.println("5 Aceitunas Negras 0.8$");
            System.out.println("6 Cebolla caramelizada 1.10$");
            System.out.println("7 Peperoni picante 1.6$");
            System.out.println("-------------------------------------- \n");
            System.out.println("Si quieres añadir otro ingrediente mas pulsa 0, de lo contrario pulsa 1: ");
            respCliente = sc.nextInt();
            if (respCliente != 1) {
                System.out.println("Elige el ingrediente: ");
                opcion = sc.nextInt();
                double ingrediente = switch (opcion) {
                    case 1 -> {
                        yield 1.50;
                    }
                    case 2 ->
                        1.20;
                    case 3 ->
                        1.00;
                    case 4 ->
                        1.40;
                    case 5 ->
                        0.8;
                    case 6 ->
                        1.10;
                    case 7 ->
                        1.60;
                    default ->
                        0;
                };
                sumaPizza += ingrediente;
                contador++;
            } else if (respCliente == 1) {
                if (contador <= 0) {
                    System.out.println("No se han introducido ingredientes");
                }
                else if (contador < 3) {
                    System.out.println("Pizza sencilla");
                    System.out.println("La suma total de la pizza es: " + sumaPizza + "$");
                } else if (contador <= 5) {
                    System.out.println("Pizza completa");
                    System.out.println("La suma total de la pizza es: " + sumaPizza + "$");
                } else if (contador <= 7) {
                    System.out.println("Super pizza");
                    System.out.println("La suma total de la pizza es: " + sumaPizza + "$");
                }
            }
        } while (respCliente != 1);
    }

}
