/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flechas;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Flechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ivan Rodriguez Garcia

        Scanner in = new Scanner(System.in);

        int numCasos;
        numCasos = in.nextInt();

        String[] nombre = new String[numCasos];

        int[] valor = new int[numCasos];
        int[] peso = new int[numCasos];
        nombre[0] = in.next();
        valor[0] = in.nextInt();
        peso[0] = in.nextInt();

        for (int i = 1; i < numCasos; i++) {
            casoDePrueba(nombre, valor, peso, i, in);
        }
        System.out.println("");
        for (int i = 0; i < numCasos; i++) {
            System.out.println(nombre[i]);
        }
        int a = in.nextInt();
    }

    public static void casoDePrueba(String[] nombre, int[] valor, int[] peso, int i, Scanner in) {
        nombre[i] = in.next();
        valor[i] = in.nextInt();
        peso[i] = in.nextInt();
        bubbleSort(valor, peso, nombre);
    }

    static void bubbleSort(int[] valor, int[] peso, String[] nombre) {
        int tempInt;
        String tempString;
        for (int i = 0; i < valor.length; i++) {
            for (int j = i + 1; j < valor.length; j++) {
                if (valor[i] < valor[j] && peso[i] < peso[j]) {
                    tempInt = valor[i];
                    valor[i] = valor[j];
                    valor[j] = tempInt;
                    tempInt = peso[i];
                    peso[i] = peso[j];
                    peso[j] = tempInt;
                    tempString = nombre[i];
                    nombre[i] = nombre[j];
                    nombre[j] = tempString;
                }
            }
        }
    }
}

    

