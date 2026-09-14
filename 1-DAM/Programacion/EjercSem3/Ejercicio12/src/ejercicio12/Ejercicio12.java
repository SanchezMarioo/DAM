/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int respCliente;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cuantas palabras quieres mostrar: ");
            respCliente = sc.nextInt();
        } while (respCliente < 0);
        for (int i = 0; i < respCliente; i++) {
            System.out.println("Eco");
        }
    }

}
