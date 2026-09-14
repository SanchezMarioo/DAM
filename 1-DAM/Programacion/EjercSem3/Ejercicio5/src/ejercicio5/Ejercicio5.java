/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0, contadorEdad = 0, sumaEdad = 0;
        float media = 0;
        System.out.println("Dime la edad:");
        numero = sc.nextInt();
        if (numero <= 0) {
            System.out.println("El primer numero es cero");
        } else {
            while (true) {
                System.out.println("Dime la edad:");
                numero = sc.nextInt();
                if (numero <= 0) {
                    break;
                }
                contador++;

                sumaEdad += numero;
                if (numero >= 18) {
                    contadorEdad++;
                }

            }
            media = sumaEdad / contador;
            if (contador == 0) {
                System.out.println("No se han introducido numeros");
            } else {
                System.out.println("La media de edad de alumnos es: " + media + " la suma de los alumnos es: " + sumaEdad + " y los alumnos >= 18 son: " + contadorEdad);
            }
        }

    }
}
