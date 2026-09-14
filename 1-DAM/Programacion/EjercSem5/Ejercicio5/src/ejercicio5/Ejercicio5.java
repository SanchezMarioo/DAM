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
        System.out.println("=======MENU==========");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular volumen");
        System.out.println("Elige una opcion: ");
        int opcion = sc.nextInt();
        System.out.println("Dime el radio: ");
        double radio = sc.nextDouble();
        switch (opcion) {
            case 1 ->
                calcularArea(radio);
            case 2 ->
                calcularVolumen(radio);
        };
    }

    static void calcularArea(double radio) {
        double area = 4 * Math.PI * (radio * radio);
        System.out.printf("El area del esfera es %.2f", area);
        System.out.println("");
    }

    static void calcularVolumen(double radio) {
        double volumen = (4.0 / 3.0) * Math.PI * (Math.pow(radio, 3));
        System.out.printf("El volumen del esfera es %.2f", volumen);
        System.out.println("");
    }

}
