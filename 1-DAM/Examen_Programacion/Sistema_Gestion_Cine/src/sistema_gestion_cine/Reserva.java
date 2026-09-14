/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_cine;

/**
 *
 * @author MARIO
 */
public class Reserva {
    private Cliente Cliente;
    private int fila;
    private int columna;
    private String idReserva;

    public Reserva(Cliente Cliente, int fila, int columna, String idReserva) {
        this.Cliente = Cliente;
        this.fila = fila;
        this.columna = columna;
        this.idReserva = idReserva;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return Cliente;
    }
    
    
}
