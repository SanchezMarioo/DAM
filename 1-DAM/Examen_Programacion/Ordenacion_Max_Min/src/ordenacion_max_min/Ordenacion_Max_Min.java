/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacion_max_min;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ordenacion_Max_Min {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numeros[] = new int[numero];
        for (int i = 0; i < numeros.length; i++) {
            int numeroAñadir = sc.nextInt();
            numeros[i] = numeroAñadir;
        }
        int contadorDecre = numeros.length;
        for (int i = 0; i < numeros.length - 1; i++) {
            
            int indiceMin = i;
            int indiceMax = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMin]) {
                    indiceMin = j;
                }
                if (numeros[j] > numeros[indiceMin]) {
                    indiceMax = j;
                }
                int auxMin = numeros[indiceMin];
                numeros[indiceMin] = i;
                numeros[i] = auxMin;
                contadorDecre--;
                int auxMax = numeros[indiceMax];
                numeros[indiceMax] = i;
                numeros[contadorDecre] = auxMax;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

}
