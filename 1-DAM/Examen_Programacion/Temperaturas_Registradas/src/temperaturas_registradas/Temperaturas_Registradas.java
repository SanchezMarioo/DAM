/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturas_registradas;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Temperaturas_Registradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        int array[] = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            int numeroAñadir = sc.nextInt();
            array[i] = numeroAñadir;
        }
        for (int i = 0; i < array.length - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[indice]) {
                    indice = j;
                }
            }
            int aux = array[i];
            array[i] = array[indice];
            array[indice] = aux;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
