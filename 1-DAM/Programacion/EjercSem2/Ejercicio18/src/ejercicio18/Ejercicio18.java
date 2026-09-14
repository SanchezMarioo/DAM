/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTeclado;
        double numeroCalcular;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero decimal: ");
        numeroCalcular = sc.nextDouble();
        System.out.println("MENU CALCULADORA ");
        System.out.println("1.Calcular la raiz cuadrada del valor introducido. ");
        System.out.println("2.Para redondear hacia arriba ");
        System.out.println("3.Para redondear hacia abajo ");
        System.out.println("4.Calcular el logaritmo natural");
        System.out.print("Introduce un numero (1-4): ");
        numeroTeclado = sc.nextInt();
        switch (numeroTeclado){
            case 1: // Raiz cuadrada COMPROBAR si mayor que > 0 
                numeroCalcular = (int) Math.sqrt(numeroCalcular);
                System.out.println("La raiz cuadrada es: " + numeroTeclado);
                break;
            case 2:
                numeroCalcular = Math.round(numeroCalcular); // Metodo Math.ceil
                System.out.println("El numero redondeado es: " + numeroCalcular);
                break;
            case 3:
                numeroCalcular = Math.floor(numeroCalcular);
                System.out.println("El numero redondeado es: " + numeroCalcular);
                break;
            case 4: // Logaritmo COMPROBAR si mayor que > 0 
                numeroCalcular = Math.log(numeroCalcular);
                System.out.println("El logaritmo es: " + numeroCalcular);
                break;
            default:
                System.out.println("No has introducido el numero correcto");
                        
        }
        
    }
    
}
