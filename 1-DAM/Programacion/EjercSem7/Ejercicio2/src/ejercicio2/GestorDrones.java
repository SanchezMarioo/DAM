/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import static ejercicio2.Estado.EN_REVISION;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mario.sanper.2
 */
public class GestorDrones {

    private ArrayList<Dron> drones = new ArrayList<>();
    private Random random = new Random();
    private final int MIN_ESTADO = 0;
    private final int MAX_ESTADO = 2;
    private final int MIN_HORAS = 100;
    private final int MAX_HORAS = 400;
    private final int NUM_DRONES = 7;

    public GestorDrones() {
        rellenarDrones();
    }

    private void rellenarDrones() {
        for (int i = 0; i < NUM_DRONES; i++) {
            drones.add(new Dron(generarHorasVuelo(), generarEstado()));
        }
    }

    public void mostrarDronesRevision() {
        System.out.println("================");
        System.out.println("DRONES EN REVISION");
        System.out.println("=================");
        for (Dron dron : drones) {
            if (dron.getEstadoDron() == EN_REVISION) {
                System.out.println(dron);
                System.out.println("");
            }

        }
    }

    public void mostrarDronesMayoresHora(int horas) {
        System.out.println("================");
        System.out.println("DRONES CON MAYORES A 200 HORAS ");
        System.out.println("=================");
        for (Dron dron : drones) {
            if (dron.getHorasVuelo() > horas) {
                System.out.println(dron);
            }

        }
    }

    public void filtrarDronPorID(int id) {
        System.out.println("================");
        System.out.println("DRONES CON ID " + id);
        System.out.println("=================");
        for (Dron dron : drones) {
            if (dron.getId() == id) {
                System.out.println(dron);
            }
        }
    }

    private Estado generarEstado() {
        int num = random.nextInt(MIN_ESTADO, MAX_ESTADO);
        return Estado.values()[num];
    }

    private int generarHorasVuelo() {
        return random.nextInt(MIN_HORAS, MAX_HORAS);
    }
}
