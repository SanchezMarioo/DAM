/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_acumulativa;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Suma_Acumulativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int suma = 0, numero = 0, contador = 0;
        char eleccion = 'S';
        do {
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            if (numero >= 10) {
                contador++;
            }
            suma += numero;
            System.out.println("La suma es " + suma);
            System.out.println("Desea seguir (S/N): ");
            eleccion = sc.next().charAt(0);
            if (eleccion != 'S') {
                break;
            }
        } while (true);
        System.out.println(contador);
    }

}
