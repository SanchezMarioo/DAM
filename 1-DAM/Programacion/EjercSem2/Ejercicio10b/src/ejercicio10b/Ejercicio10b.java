/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10b;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio10b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numeroTeclado;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un numero: ");
        numeroTeclado = sc.nextDouble();
        
        double valorAbsoluto = numeroTeclado < 0 ? -numeroTeclado : numeroTeclado;
        
        System.out.println(valorAbsoluto);
        
    }
    
}
