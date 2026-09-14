/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroRandom, eleccion = 0, suma = 0, sumaUsuario = 0;
        boolean rendirse = false;
        Scanner sc = new Scanner(System.in);
        while (rendirse == false) {
            numeroRandom = (int) (Math.random() * 100) + 1;
            System.out.println("El numero es: " + numeroRandom);
            System.out.println("Si quieres otro numero pulsa 0");
            System.out.println("De lo contrario pulsa 1");
            eleccion = sc.nextInt();
            suma += numeroRandom;
            while (eleccion != 0 && eleccion != 1) // Si es un if saca un numero {
                System.out.println(" \n Elige la opcion valida (0/1) \n");
                System.out.println("Si quieres otro numero pulsa 0");
                System.out.println("De lo contrario pulsa 1");
                System.out.println("Elige una opcion: ");
                eleccion = sc.nextInt();
            }
            if (eleccion == 1) {
                System.out.println("¿Cuál crees que es la suma total de todos los números que te mostré: ");
                sumaUsuario = sc.nextInt();
                if (sumaUsuario == suma) {
                    System.out.println("¡Enhorabuena! Eres un crack matemático ?");
                } else {
                    System.out.println("Fallaste, el resultado es: " + suma);
                }
                rendirse = true;
            }
        }

    }
