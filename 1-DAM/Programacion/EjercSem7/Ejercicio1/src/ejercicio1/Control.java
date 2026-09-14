/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mario.sanper.2
 */
public class Control {

    private ArrayList<Farola> farolas;
    private Random random = new Random();
    private final int NUM_FAROLAS = 5;
    private final int FILTRO_CONSUMO = 15;
    private final int MIN_ZONA = 0;
    private final int MAX_ZONA = 4;
    private final double MIN_CONSUMO = 8.0;
    private final double MAX_CONSUMO = 75.9;

    public Control() {
        farolas = new ArrayList<>();
        rellenarFarolas();
    }

    public void rellenarFarolas() {
        for (int i = 0; i < NUM_FAROLAS; i++) {
            farolas.add(new Farola("FAR" + i, generarConsumo(), generarZona()));
        }
    }

    private Zona generarZona() {
        int num = random.nextInt(MIN_ZONA, MAX_ZONA);
        return Zona.values()[num];
    }

    private double generarConsumo() {
        return random.nextDouble(MIN_CONSUMO, MAX_CONSUMO);
    }

    public void mostrarFarolas() {
        for (Farola farola : farolas) {
            System.out.println("");
            System.out.println("==================================");
            System.out.println("Codigo: " + farola.getCodigo());
            System.out.printf("Consumo: %.2f ", farola.getConsumo());
            System.out.println("");
            System.out.println("Zona: " + farola.getZona());
            System.out.println("==================================");

        }
    }

    public void farolasFiltroConsumo() {
        System.out.println("Farolas mayores a " + FILTRO_CONSUMO);
        for (Farola farola : farolas) {
            if (farola.getConsumo() > FILTRO_CONSUMO) {
                System.out.println("");
                System.out.println("==================================");
                System.out.println("Codigo: " + farola.getCodigo());
                System.out.printf("Consumo: %.2f ", farola.getConsumo());
                System.out.println("");
                System.out.println("Zona: " + farola.getZona());
                System.out.println("==================================");
            }

        }
    }

    private Farola getMayorConsumo() {
        Farola mayorConsumo = farolas.get(0);
        for (Farola farola : farolas) {
            if (farola.getConsumo() > mayorConsumo.getConsumo()) {
                mayorConsumo = farola;
            }

        }
        return mayorConsumo;

    }

    public void mostrarMayorConsumo() {
        Farola farola = getMayorConsumo();
        System.out.println("");
        System.out.println("MAYOR CONSUMO");
        System.out.println("==================================");
        System.out.println("Codigo: " + farola.getCodigo());
        System.out.printf("Consumo: %.2f ", farola.getConsumo());
        System.out.println("");
        System.out.println("Zona: " + farola.getZona());
        System.out.println("==================================");

    }
}
