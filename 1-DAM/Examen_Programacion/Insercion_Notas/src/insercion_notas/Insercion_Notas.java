/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insercion_notas;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Insercion_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroMaximo = sc.nextInt();
        int numerosAlmacenados = sc.nextInt();
        int notas[] = new int[numeroMaximo];
        boolean esRep = false;
        System.out.println();
        for (int i = 0; i < numerosAlmacenados; i++) {
            int numero = sc.nextInt();
            notas[i] = numero;
        }
        while (numerosAlmacenados < notas.length) {
            esRep = false;
            int posicionAñadir = 0;
            int numeroAñadir = sc.nextInt();
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] == numeroAñadir) {
                    esRep = true;
                    break;
                }
                if (notas[i] > numeroAñadir) {
                    posicionAñadir++;
                }
            }
            if (!esRep) {
                if (notas.length == posicionAñadir) {
                    notas[posicionAñadir] = numeroAñadir;
                } else {
                    int aux = notas[posicionAñadir];
                    notas[posicionAñadir] = numeroAñadir;
                    notas[posicionAñadir + 1] = aux;
                    for (int i = aux + 1; i < notas.length - 1; i++) {
                        notas[i + 1] = notas[i];
                    }
                    numerosAlmacenados++;
                }

            } else {
                System.out.println("La nota " + numeroAñadir + " ya existe y no se puede insertar.");
            }

        }
        for (int i = 0; i < numerosAlmacenados - 1; i++) {
            System.out.print(notas[i] + " ");
        }
    }

}
