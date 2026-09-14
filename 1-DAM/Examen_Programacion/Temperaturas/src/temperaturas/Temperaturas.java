/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturas;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int temperaturas[] = new int[numero];
        double sumaTemp = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            int numeroAñadir = sc.nextInt();
            temperaturas[i] = numeroAñadir;
        }
        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < temperaturas.length - 1; j++) {
                if (temperaturas[j] > temperaturas[j + 1]) {
                    int aux = temperaturas[j + 1];
                    temperaturas[j + 1] = temperaturas[j];
                    temperaturas[j] = aux;
                }
            }
        }
        for (int i = 0; i < temperaturas.length; i++) {
            sumaTemp += temperaturas[i];
            System.out.print(temperaturas[i] + " ");

        }
        double media = sumaTemp / numero;
        System.out.println("");
        System.out.println("Temperatura mínima: " + temperaturas[0]);
        System.out.println("Temperatura mínima: " + temperaturas[numero - 1]);
        System.out.println("Temperatura media:  " + media);

    }

}
