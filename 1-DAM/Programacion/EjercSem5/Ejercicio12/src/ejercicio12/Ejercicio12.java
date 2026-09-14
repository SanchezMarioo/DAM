/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cantidadNum = sc.nextInt();
        int valoresMinimos = sc.nextInt();
        int valoresMaximos = sc.nextInt();
        int[] arrayNum = numerosRandom(cantidadNum, valoresMinimos, valoresMaximos);
        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i] + " ");
        }
    }

    static int[] numerosRandom(int cantidadNum, int valoresMinimos, int valoresMaximos) {
        int[] arrayNumero = new int[cantidadNum];
        for (int i = 0; i < cantidadNum; i++) {
            int numeroRandom = (int) (Math.random() * (valoresMaximos - valoresMinimos + 1) + valoresMinimos);
            arrayNumero[i] = numeroRandom;
        }
        return arrayNumero;
    }
}
