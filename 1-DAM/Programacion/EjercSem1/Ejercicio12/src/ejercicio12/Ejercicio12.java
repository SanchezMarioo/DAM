/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas, minutos, segundos;
        int segundosUsuario;
        Scanner sc = new Scanner(System.in);
        System.out.print("Indica los segundos: ");
        segundosUsuario = sc.nextInt();
        horas = (segundosUsuario / 3600);
        minutos = (segundosUsuario % 3600) / 60;
        segundos = (segundosUsuario % 60);
        System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos");

    }

}
