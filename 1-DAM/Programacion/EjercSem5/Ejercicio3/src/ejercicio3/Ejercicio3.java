/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sacarNumeros(num1, num2);
    }

    static void sacarNumeros(int num1, int num2) {
        int incio = num1;
        int fin = num2;
        if (num1 > num2) {
            incio = num2;
            fin = num1;
        }
        for (int i = incio; i <= fin; i++) {
            System.out.print(i + " ");
        }
    }

}
