/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base (a): ");
        int a = sc.nextInt();

        int n;
        do {
            System.out.print("Introduce el exponente (n >= 0): ");
            n = sc.nextInt();
        } while (n < 0);
        double resultadoRecursivo = calcularNumElevado(a, n);

        System.out.println("Resultado (recursivo): " + resultadoRecursivo);

        sc.close();
    }

    static int calcularNumElevado(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * calcularNumElevado(a, n - 1);
    }

}
