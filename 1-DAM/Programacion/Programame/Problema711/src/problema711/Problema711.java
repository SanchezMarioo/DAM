/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema711;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Problema711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numCasos; i++) {
            String numCadena = sc.nextLine();
            int suma = 0;
            char[] numeros = numCadena.toCharArray();
            ArrayList<Integer> numerosArray = transformarCharANumero(numeros);
            for (int j = 0; j < numerosArray.size(); j++) {
                // Par
                if (numerosArray.get(j) % 2 == 0) {
                    int mayorNumero = mayorNumeroIzq(numerosArray, j);
                    int sumaPorNumero = numerosArray.get(j) * 3 + mayorNumero;
                    suma += sumaPorNumero;
                } // Impar
                else {
                    int mayorNumero = mayorNumeroDer(numerosArray, j);
                    int sumaPorNumero = numerosArray.get(j) * 2 + mayorNumero;
                    System.out.println(sumaPorNumero);
                    suma += sumaPorNumero;
                }

            }
            System.out.println(suma);
        }

    }

    static ArrayList<Integer> transformarCharANumero(char[] numeros) {
        ArrayList<Integer> numerosTrans = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            String numerosTransformar = Character.toString(numeros[i]);
            numerosTrans.add(Integer.parseInt(numerosTransformar));
        }
        return numerosTrans;
    }

    static int mayorNumeroIzq(ArrayList<Integer> numeros, int posicion) {
        int mayorNumero = numeros.get(0);
        for (int i = posicion; i < numeros.size(); i++) {
            if (numeros.get(i) < mayorNumero) {
                mayorNumero = numeros.get(i);
            }

        }
        return mayorNumero;
    }

    static int mayorNumeroDer(ArrayList<Integer> numeros, int posicion) {
        int mayorNumero = numeros.get(0);
        for (int i = posicion; i > 0; i--) {
            if (numeros.get(i) > mayorNumero) {
                mayorNumero = numeros.get(i);
            }

        }
        return mayorNumero;
    }

}
