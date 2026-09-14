/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTeclado, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, numeroCapicua = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numeroTeclado = sc.nextInt();
        if (numeroTeclado < 0 || numeroTeclado > 100000) {
            System.out.println("No se encuentra en el rango");
        } else {
            if (numeroTeclado < 10) {
                num1 = numeroTeclado / 10;
                System.out.println("Es capicua, da igual como lo mires");
            } else if (numeroTeclado <= 99) {
                num2 = numeroTeclado / 10;
                num1 = numeroTeclado % 10;
                if (num1 == num2) {
                    System.out.println("Es capicua");
                }
            } else if (numeroTeclado <= 999) {
                System.out.println(3);
                num3 = numeroTeclado / 100;
                num1 = numeroTeclado % 10;
                System.out.println(num1 + " " + num2 + " " + num3);
                if (num1 == num3) {
                    System.out.println("Es Capicua");
                }
            } else if (numeroTeclado <= 9999) {
                System.out.println(4);
                num4 = numeroTeclado / 1000;
                num3 = numeroTeclado / 100 % 10;
                num2 = numeroTeclado / 10 % 10;
                num1 = numeroTeclado % 10;
                System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);
                if((num4 == num1) && (num2 == num3)){
                    System.out.println("Es capicua");
                }
            }

        }
    }

}
