/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculo.imc;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class CalculoIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float peso = 0, altura = 0;
        float IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cual es el peso: ");
        peso = sc.nextInt();
        System.out.println("Dime cual es la altura (cm): ");
        altura = sc.nextInt();
        if (peso < 20 || peso > 300 || altura < 0.5 || altura > 2.5) {
            altura /= 100;
            IMC = peso / (altura * altura);
            System.out.printf("Tu indice masa corporal es %.2f%n", IMC);
            if (IMC < 18.5) {
                System.out.println("\nBajo peso");
            } else if (IMC < 24.9) {
                System.out.println("\nPeso normal");
            } else if (IMC < 29.9) {
                System.out.println("Sobrepeso");
            } else if (IMC > 30) {
                System.out.println("Obesidad");
            }
        } else {
            System.out.println("Datos invalidos");
        }

    }

}
