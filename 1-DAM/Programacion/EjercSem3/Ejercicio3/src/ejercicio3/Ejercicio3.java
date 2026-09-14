/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        int edadMaxima = 0;
        int edadMinima = 0;
        boolean esMayor = true;
        System.out.println("Dime la edad: ");
        edad = sc.nextInt();
        if (edadMinima < 0 && edadMaxima < 0) {
            esMayor = false;
        } else {
            edadMinima = edad;
        }
        while (edad != -1 && esMayor == true) {
            System.out.println("Dime la edad: ");
            edad = sc.nextInt();
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
            if (edad < edadMinima && edad != -1) {
                edadMinima = edad;
            }
        }
        if (esMayor == true) {
            System.out.println("La edad maxima es: " + edadMaxima + " y la edad minima es: " + edadMinima);
        }

    }

}
