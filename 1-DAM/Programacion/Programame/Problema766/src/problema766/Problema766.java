/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema766;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Problema766 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int horchataDispo = sc.nextInt();
        int litrosHorchata = sc.nextInt();
        ArrayList<Integer> tiempoLista = new ArrayList<>();
        ArrayList<Integer> litrosLista = new ArrayList<>();

        int personaRepartida = 0;

        do {
            int numero = sc.nextInt();
            if (numero == 0) {
                for (int i = 0; i < litrosLista.size(); i++) {
                    int posicion = encontrarNumeroMayor(tiempoLista);
                    if (horchataDispo > litrosLista.get(posicion)) {
                        personaRepartida++;
                        horchataDispo -= litrosLista.get(posicion);
                    } else {
                        continue;
                    }
                }
                break;
            }
            int tiempo = sc.nextInt();

            tiempoLista.add(tiempo);
            int litros = sc.nextInt();
            litrosLista.add(litros);

        } while (true);
        System.out.println(personaRepartida + " " + litrosLista.size());
    }

    static int encontrarNumeroMayor(ArrayList<Integer> tiempoLista) {
        int mayorTiempo = tiempoLista.getFirst();
        int posicionEliminar = 0;
        for (int i = 0; i < tiempoLista.size(); i++) {
            int tiempoActual = tiempoLista.get(i);
            if (tiempoActual > mayorTiempo) {
                mayorTiempo = tiempoActual;
                posicionEliminar = i;
            }

        }
        tiempoLista.remove(posicionEliminar);
        return posicionEliminar;

    }

}
