/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_cine;

import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class Cine {

    private ArrayList<Sala> salas;

    public void añadirSala(Sala sala) {
        salas.add(sala);
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void mostrarSala(Sala sala) {
        boolean asientos[][] = sala.getAsientos();
        for (int i = 0; i < asientos.length; i++) {;
            for (int j = 0; j < asientos.length; j++) {
                if (asientos[i][j]) {
                    System.out.println("X" + "\t");
                } else {
                    System.out.println("O" + "\t");
                }
            }
        }
    }

}
