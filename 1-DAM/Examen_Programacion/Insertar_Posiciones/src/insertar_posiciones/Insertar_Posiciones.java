/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertar_posiciones;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Insertar_Posiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int arrayNumeros[] = new int[numero];
        int posicionInsertar = 0;
        for (int i = 0; i < numero; i++) {
            arrayNumeros[i] = sc.nextInt();
        }
        int numerosInsertar = sc.nextInt();
        int arrayNuevo[] = new int[numero + numerosInsertar];
        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayNuevo[i] = arrayNumeros[i];
        }
        while (numero < arrayNuevo.length) {

            posicionInsertar = 0;
            int numeroInsertar = sc.nextInt();
            for (int i = 0; i < numero; i++) {
                if (arrayNuevo[i] <= numeroInsertar) {
                    posicionInsertar++;
                }
            }
            for (int i = arrayNuevo.length - 1; i > posicionInsertar; i--) {
                arrayNuevo[i] = arrayNuevo[i - 1];
            }
            arrayNuevo[posicionInsertar] = numeroInsertar;
            numero++;
        }
        for (int i = 0; i < arrayNuevo.length; i++) {
            System.out.print(arrayNuevo[i] + " ");
        }

    }

}
