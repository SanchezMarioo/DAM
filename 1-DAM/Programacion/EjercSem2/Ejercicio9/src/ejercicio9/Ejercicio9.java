/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        boolean entradaVIP,hijoArtistaInvitado;
        Scanner sc = new Scanner (System.in);
        System.out.print("Cuantos años tienes: ");
        edad = sc.nextInt();
        System.out.print("Tienes entrada VIP (true/false): ");
        entradaVIP = sc.nextBoolean();
        System.out.print("Eres hijo del artista invitado (true/false): ");
        hijoArtistaInvitado = sc.nextBoolean();
        
        
        
        if ((edad >= 18 && entradaVIP) || (edad <= 18 && hijoArtistaInvitado)){
            System.out.println("Puedes pasar");
        } else {
            System.out.println("No puedes pasar");
        }
    }
    
}
