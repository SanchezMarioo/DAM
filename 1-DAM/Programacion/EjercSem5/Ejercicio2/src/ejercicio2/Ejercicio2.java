/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("No es un numero");
            sc.next();
        }
        int segundos = 0;
        do {
            segundos = sc.nextInt();
        } while (segundos < 0);
        transformarFormato(segundos);
    }

    static void transformarFormato(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosResto = segundos % 60;
        System.out.printf("%02d:%02d:%02d", horas, minutos, segundosResto);
    }

}
