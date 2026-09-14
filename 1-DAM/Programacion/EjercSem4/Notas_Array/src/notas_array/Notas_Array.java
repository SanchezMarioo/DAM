/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas_array;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Notas_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int notas[] = new int [8];
        System.out.println("Dime las notas de Programacion ");
        notas[0] = sc.nextInt();
        System.out.println("Dime las notas de Lengujaes ");
        notas[1] = sc.nextInt();
        System.out.println("Dime las notas de Entornos ");
        notas[2] = sc.nextInt();
        System.out.println("Dime las notas de IPE ");
        notas[3] = sc.nextInt();
        System.out.println("Dime las notas de Ingles ");
        notas[4] = sc.nextInt();
        System.out.println("Dime las notas de TSP ");
        notas[5] = sc.nextInt();
        System.out.println("Dime las notas de Bases de datos ");
        notas[6] = sc.nextInt();        
        System.out.println("Dime las notas de Sistemas ");
        notas[7] = sc.nextInt();
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

    }
    
}
