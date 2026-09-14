/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, numPositivo = 0, numCero = 0, numNegativo = 0;
        int sumaPositivo = 0, sumaNumNegativo = 0;
        System.out.println("Dime el numero n de los numeros para mostrar: ");
        int tecladoNumero = sc.nextInt();

        int[] numeros = new int[tecladoNumero];
        System.out.println("Teclea los " + tecladoNumero + " numeros: " );
        for (int i = 0; i < numeros.length; i++) {  
            numero = sc.nextInt();
            if (numero > 0) {
                sumaPositivo+= numero;
                numPositivo++;
            } else if (numero < 0) {
                sumaNumNegativo += numero;
                numNegativo++;
            } else {
                numCero++;
            }
            numeros[i] += numero;
        }
        sumaNumNegativo = (numNegativo > 0) ? sumaNumNegativo / numNegativo : 0;
        sumaPositivo = (numPositivo > 0) ? sumaPositivo / numPositivo : 0;
        System.out.println("Numeros positivos: " + sumaPositivo);
        System.out.println("Numeros ceros: " + numCero);
        System.out.println("Numeros negativos: " + sumaNumNegativo);

    }

}
