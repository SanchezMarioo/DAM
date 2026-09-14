/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropalindromo;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class NumeroPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0, longitud = 1, numeroCalcular, elevado, base = 10, descomponer = 0, decrementar;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        numeroCalcular = numero;
        // Calculamos la longitud del int
        do {
            numeroCalcular /= 10;
            longitud++;
        } while (numeroCalcular > 9);
        elevado = longitud;
        do {
            elevado++;
            decrementar = (int) Math.pow(base, elevado);
            descomponer = (numero / decrementar) % 10;
            System.out.print(descomponer);

        } while (elevado >= longitud);
    }

}
