/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero 1: ");
        int num1 = sc.nextInt();
        System.out.println("Dime el numero 2: ");
        int num2 = sc.nextInt();
        System.out.println("El MCD es " + mcd(num1, num2));
    }

    static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a == 0) {
            return b;
        }
        if (a >= b) {
            return mcd(a - b, b);
        } else if (b > a) {
            return mcd(a, b - a);
        }

        return 0;
    }

}
