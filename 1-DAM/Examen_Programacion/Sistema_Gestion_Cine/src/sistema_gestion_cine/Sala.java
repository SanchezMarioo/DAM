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
public class Sala {

    private String nombreSala;
    private boolean[][] asientos;
    private ArrayList<Reserva> listaReservas;
    private final int NUM_FILAS;
    private final int NUM_COLUMNAS;

    public Sala(String nombreSala, int NUM_FILAS, int NUM_COLUMNAS) {
        this.nombreSala = nombreSala;
        this.NUM_FILAS = NUM_FILAS;
        this.NUM_COLUMNAS = NUM_COLUMNAS;
        asientos = new boolean[NUM_FILAS][NUM_COLUMNAS];
        listaReservas = new ArrayList<>();
    }

    public boolean[][] getAsientos() {
        return asientos;
    }

    public String getNombreSala() {
        return nombreSala;
    }
    

    public Reserva buscarReservaPorId(String id) {
        for (Reserva reserva : listaReservas) {
            if (reserva.getIdReserva().equals(id)) {
                return reserva;
            }
        }
        return null;
    }

    public ArrayList<Reserva> buscarReservasPorEmail(String email) {
        ArrayList <Reserva> listaClientes = new ArrayList<>();
        for (Reserva reserva : listaReservas) {
            Cliente c = reserva.getCliente();
            if(c.getEmail().equals(email)){
                listaClientes.add(reserva);
            }
        }
        return listaClientes;
    }

    public void cancelarReserva(String id) {
        for (int i = 0; i < listaReservas.size(); i++) {
            if (listaReservas.get(i).getIdReserva().equals(id)) {
                listaReservas.remove(i);
            }
        }
    }

    public void reservarAsiento(int fila, int columna) {
        asientos[fila][columna] = true;
    }

    public void liberarAsiento(int fila, int columna) {
        asientos[fila][columna] = false;
    }

    public boolean asientoDisponible(int fila, int columna, Sala sala) {
        return asientos[fila][columna];
    }

}
