/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=======MENU==========");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular volumen");
        System.out.println("Elige una opcion: ");
        int opcion = sc.nextInt();
        System.out.println("Dime el radio: ");
        int radio = sc.nextInt();
        System.out.println("Dime la altura: ");
        int altura = sc.nextInt();
        switch (opcion) {
            case 1 ->
                calcularArea(radio, altura);
            case 2 ->
                calcularVolumen(radio, altura);
        };
    }

    static void calcularArea(int radio, int altura) {
        double area = (2 * Math.PI) * radio * (altura + radio);
        System.out.printf("El area del cilindro es %.2f", area);
        System.out.println("");
    }

    static void calcularVolumen(int radio, int altura) {
        double volumen = (Math.PI) * (radio * radio) * altura;
        System.out.printf("El volumen del cilindro es %.2f", volumen);
        System.out.println("");
    }
}
