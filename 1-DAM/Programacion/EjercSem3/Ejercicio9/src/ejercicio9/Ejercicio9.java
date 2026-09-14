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
        int numRandom1, numRandom2, sumaRandom = 0, respCliente;
        Scanner sc = new Scanner(System.in);
        numRandom1 = (int) (Math.random() * 100) + 1;
        numRandom2 = (int) (Math.random() * 100) + 1;
        System.out.println(numRandom1 + " " + numRandom2);
        do {
            System.out.println("Dime la suma: ");
            respCliente = sc.nextInt();
            if (respCliente == sumaRandom) {
                System.out.println("Ganaste!!!");
            } else{
                System.out.println("Siguelo intentando \n");
            }
        } while (sumaRandom != respCliente);

    }

}
