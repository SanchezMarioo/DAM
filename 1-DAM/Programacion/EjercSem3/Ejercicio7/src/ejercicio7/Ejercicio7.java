/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int altura = 0, alturaMaxima = 0, contador = 1, contadorArbol = 0;
        while (altura != -1) {
            if (altura != 1) {
                if (altura < 0) {
                    System.out.println("Dime la altura: ");
                }
                altura = sc.nextInt();
                contador++;
                if (altura > alturaMaxima) {
                    alturaMaxima = altura;
                    contadorArbol = contador;
                }
            }
        }
        System.out.println("El arbol " + contadorArbol + " con mayor altura es: " + alturaMaxima);
    }
}