/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int minutos,horas,segundos;
        
        System.out.print("Hora minutos segundos (separados por espacio)");
        horas = sc.nextInt();
        minutos = sc.nextInt();
        segundos = sc.nextInt();
        Hora hora1 = new Hora(horas,minutos,segundos);
        System.out.println("Dime (N) cuanto se avanzara");
        int n = sc.nextInt();
        hora1.avanzarSegundos(n);
    }
    
}
