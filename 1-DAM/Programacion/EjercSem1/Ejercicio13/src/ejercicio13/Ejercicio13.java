/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base, altura;
        System.out.print("Introduce la base: ");
        base = input.nextFloat();
        System.out.print("Introduce la altura: ");
        altura = input.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

}
