/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sala_aeropuertos;

import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class Sala {

    private String id;
    private int capacidad;
    private ArrayList<Reserva> listaReservas;

    public Sala(String id, int capacidad) {
        this.id = id;
        this.capacidad = capacidad;
        listaReservas = new ArrayList<>();
    }

    public boolean haySolapamiento(Reserva nuevaReserva) {
        for (Reserva listaReserva : listaReservas) {
            if (nuevaReserva.getHoraIncio() < listaReserva.getHoraFin() && listaReserva.getHoraIncio() == nuevaReserva.getHoraFin()) {
                return true;
            }

        }
        return false;
    }

}
