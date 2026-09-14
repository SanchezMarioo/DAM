/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTeclado;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dime un numero: ");
        numeroTeclado = sc.nextInt();
        
        if (numeroTeclado % 2 == 0 && numeroTeclado != 0 ){
            System.out.println("Es par");
        }
        if (numeroTeclado % 2 == 1 ){
            System.out.println("Es impar");
        }
        if (numeroTeclado == 0 ){
            System.out.println("No si es par o impar");
        }
    }
    
}
