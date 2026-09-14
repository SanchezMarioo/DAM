/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneodados;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class TorneoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int rondas = 0, jugador1 = 0, jugador2 = 0, numeroRandom, numeroRandom2, i = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantas rondas quieres?: ");
        rondas = sc.nextInt();
        do {
            i++;
            numeroRandom = (int) (Math.random() * 10);
            numeroRandom2 = (int) (Math.random() * 10);
            if ((numeroRandom >= 7 || numeroRandom <= 0)) {
                i--;
                continue;
            }
            if ((numeroRandom2 >= 7 || numeroRandom2 <= 0)) {
                i--;
                continue;
            }
            System.out.println("\n==============");
            System.out.println("El jugador 1 ha sacado " + numeroRandom);
            System.out.println("El jugador 2 ha sacado " + numeroRandom2);
            if (numeroRandom > numeroRandom2) {
                System.out.println("El ganador es el jugador 1");
                System.out.println("==============\n");
                jugador1++;
            } else if (numeroRandom == numeroRandom2) {
                System.out.println("Empate tecnico se repite la ronda");
                System.out.println("==============\n");
                i--;
            } else {
                System.out.println("El ganador  de esta ronda es el jugador 2");
                System.out.println("==============\n");
                jugador2++;
            }

        } while (i < rondas);
        System.out.println("\n==================");
        System.out.println("RESUMEN:");
        System.out.println("El jugador 1 ha ganado " + jugador1 + "rondas");
        System.out.println("El jugador 2 ha ganado " + jugador2 + "rondas");
        System.out.println("\n==================");
    }

}
