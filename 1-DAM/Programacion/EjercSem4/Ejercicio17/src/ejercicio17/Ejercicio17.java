/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] valores = {10, 20, 30, 40, 50};
        int[] nuevo = new int[valores.length + 1];
        int posicionInsertar = 0;
        int numeros = 0;
        boolean entraDeNuevo = false;
        boolean esIgual = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Añade un numero: ");
        int numeroAñadir = sc.nextInt();
        while (numeroAñadir < 0) {
            System.out.println("Añade un numero: ");
            numeroAñadir = sc.nextInt();
            if (numeroAñadir < 0) {
                continue;
            }
        }
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] >= numeroAñadir) {
                posicionInsertar = i;
                break;
            } else if (!entraDeNuevo) {
                posicionInsertar = valores.length;
            }
        }
        for (int i = 0; i < posicionInsertar; i++) {
            nuevo[i] = valores[i];
        }
        nuevo[posicionInsertar] = numeroAñadir;
        for (int i = posicionInsertar; i < valores.length; i++) {
            nuevo[i + 1] = valores[i];
        }
        for (int i = 0; i < nuevo.length; i++) {
            System.out.print(nuevo[i] + " ");
        }
    }

}
