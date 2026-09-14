/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insercion_manteniendo;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Insercion_Manteniendo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int arrayNumeros[] = new int[numero + 1];

        for (int i = 0; i < numero; i++) {
            arrayNumeros[i] = sc.nextInt();
        }

        int numeroOrdenar = sc.nextInt();
        int posicionInsertar = 0;

// Buscar posición correcta
        for (int i = 0; i < numero; i++) {
            if (arrayNumeros[i] < numeroOrdenar) {
                posicionInsertar++;
            }
        }

// Desplazar a la derecha
        for (int i = numero; i > posicionInsertar; i--) {
            arrayNumeros[i] = arrayNumeros[i - 1];
        }

// Insertar
        arrayNumeros[posicionInsertar] = numeroOrdenar;

// Mostrar resultado
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i] + " ");
        }
    }
}

