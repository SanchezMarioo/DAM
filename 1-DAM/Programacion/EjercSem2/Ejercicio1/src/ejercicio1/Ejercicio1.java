/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int numeroTeclado;
        boolean numeroPositivo;
        System.out.print("Escribe un numero: ");
        numeroTeclado = sc.nextInt();
        numeroPositivo = numeroTeclado > 0;
        System.out.println(numeroPositivo);
    }
    
}
