/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int respCliente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres aprender: ");
        respCliente = sc.nextInt();
        if (respCliente >= 0) {
            for (int i = 0; i <= respCliente; i++) {
                System.out.println(i);
            }
        } else{
            for (int i = 0; i >= respCliente; i--){
                System.out.println(i);
            }
        }
    }

}
