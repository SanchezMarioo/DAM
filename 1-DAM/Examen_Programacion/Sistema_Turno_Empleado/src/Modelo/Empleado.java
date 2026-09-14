/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.text.Normalizer;
import java.time.Duration;
import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class Empleado {

    private String nombre;
    private ArrayList<Turno> turnos;

    public Empleado(String nombre, ArrayList<Turno> turnos) {
        this.nombre = nombre;
        this.turnos = turnos;
    }

    public boolean agregarTurno(Turno t) {
        return turnos.add(t);
    }

    public Duration calcularTotalHoras() {
        Duration duration = Duration.ZERO;
        for (Turno turno : turnos) {
            duration = duration.plus(turno.calcularDuracion());
        }
        return duration;
    }

    public boolean tieneturnoExcedido() {
        for (Turno turno : turnos) {
            if (turno.calcularDuracion().compareTo(Duration.ofHours(9)) > 0) {
                return true;
            }

        }
        return true;
    }

    public String getNombreOrdenable() {
        return Normalizer.normalize(nombre, Normalizer.Form.NFD);
    }

    @Override
    public String toString() {
        return "Empleado: " + " | " + nombre + " | " + turnos;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

}
