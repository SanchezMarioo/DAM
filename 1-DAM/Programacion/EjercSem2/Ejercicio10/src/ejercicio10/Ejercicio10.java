/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numeroTeclado,numeroTeclado2;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer numero: ");
        numeroTeclado = sc.nextFloat();
        System.out.println("Introduce el segundo numero: ");
        numeroTeclado2 = sc.nextFloat();
        double numeroMaximo = numeroTeclado > numeroTeclado2 ? numeroTeclado : numeroTeclado2;
        double numeroMinimo = numeroTeclado < numeroTeclado2 ? numeroTeclado : numeroTeclado2;
        System.out.println("El numero maximo es: " + numeroMaximo + " El numero minimo es " + numeroMinimo);
    }
    
}
