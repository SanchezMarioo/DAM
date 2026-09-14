/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroNota = 0;
        int contador = 0;
        int suspenso = 0, duda = 0, aprobado = 0;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("Dime un numero: ");
            numeroNota = sc.nextInt();
            if (numeroNota < 4){
                suspenso++;
            } else if (numeroNota == 4){
                duda++;
            } else {
                aprobado++;
            }
            contador++;
        } while (contador < 7);
        System.out.println("Suspensos: " + suspenso );
        System.out.println("Duda: " + duda );
        System.out.println("Aprobados: " + aprobado );
    }
    
}
