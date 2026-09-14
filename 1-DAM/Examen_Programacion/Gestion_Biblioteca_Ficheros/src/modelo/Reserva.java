/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MARIO
 */
public class Reserva {

    private int id;
    private String nombreUsuario;
    private String tituloLibro;
    private int diasReserva;

    public Reserva(int id, String nombreUsuario, String tituloLibro, int diasReserva) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.tituloLibro = tituloLibro;
        this.diasReserva = diasReserva;
    }

    public String getTipoReserva() {
        if (diasReserva < 8) {
            return "CORTA";
        } else if (diasReserva < 20) {
            return "MEDIA";
        } else {
            return "LARGA";
        }
    }

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public int getDiasReserva() {
        return diasReserva;
    }

    @Override
    public String toString() {
        return "ID: " + id + "|" + "Usuario: " + nombreUsuario + "|" + "Libro: " + tituloLibro + "Dias: " + diasReserva + "TIPO: " + getTipoReserva();
    }

}
