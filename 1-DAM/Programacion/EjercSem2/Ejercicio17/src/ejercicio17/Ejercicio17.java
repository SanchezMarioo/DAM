/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTeclado;
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU HEROES ");
        System.out.println("1.Spiderman ");
        System.out.println("2.Batman ");
        System.out.println("3.Wonder Woman ");
        System.out.println("4. Iron Man");
        System.out.print("Introduce un numero (1-4): ");
        numeroTeclado = sc.nextInt();
        switch (numeroTeclado) {
            case 1:
                System.out.println("Frase motivadora Spiderman");
                break;
            case 2:
                System.out.println("Frase motivadora Batman");
                break;
            case 3:
                System.out.println("Frase motivadora Wonder Woman");
                break;
            case 4:
                System.out.println("Frase motivadora Iron Man");
                break;
            default:
                System.out.println("No has introducido un numero valido");

        }
    }

}
