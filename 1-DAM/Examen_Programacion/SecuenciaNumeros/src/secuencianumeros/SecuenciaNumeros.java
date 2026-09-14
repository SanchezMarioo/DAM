/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencianumeros;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class SecuenciaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1, contadorDivisible = 0, promedioSumar = 0, cantidadMayores = 0, numeroMinimo = 0,posicionI = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; numero > 0; i++) {
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
            if(i == 1){
                numeroMinimo = numero;
            }
            if(numero == 0){
                continue;
            }
            promedioSumar += numero;
            if (numero % i == 0) {
                contadorDivisible++;
            }
            if ((promedioSumar / i) < numero) {
                cantidadMayores++;
            }
            if (numero < numeroMinimo) {
                numeroMinimo = numero;
                posicionI = i;
            }

        }
        System.out.println("Cantidad divisible por su posición: " + contadorDivisible);
        System.out.println("Cantidad mayores que promedio parcial: " + cantidadMayores);
        System.out.println("Posición del número más pequeño: " + numeroMinimo);
    }

}
