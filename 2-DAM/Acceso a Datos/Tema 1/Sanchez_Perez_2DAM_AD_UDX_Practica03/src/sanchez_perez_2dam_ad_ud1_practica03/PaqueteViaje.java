/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_perez_2dam_ad_ud1_practica03;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Mario
 */
public class PaqueteViaje implements Serializable {

    private int id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Vuelo vueloIda;
    private Vuelo vueloVuelta;
    private Hotel hotel;

    public PaqueteViaje(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFinal, Vuelo vueloIda, Vuelo vueloVuelta, Hotel hotel) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.vueloIda = vueloIda;
        this.vueloVuelta = vueloVuelta;
        this.hotel = hotel;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static DateTimeFormatter getFORMATO() {
        return FORMATO;
    }

    
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Vuelo getVueloIda() {
        return vueloIda;
    }

    public void setVueloIda(Vuelo vueloIda) {
        this.vueloIda = vueloIda;
    }

    public Vuelo getVueloVuelta() {
        return vueloVuelta;
    }

    public void setVueloVuelta(Vuelo vueloVuelta) {
        this.vueloVuelta = vueloVuelta;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public long getDuracionDias() {
        return fechaInicio.until(fechaFinal, ChronoUnit.DAYS);
    }

    public double getPrecioTotal() {
        long dias = getDuracionDias();
        return vueloIda.getPrecio() + vueloVuelta.getPrecio() + (hotel.getPrecioNoche()* dias);
    }

    @Override
    public String toString() {
        long dias = fechaInicio.until(fechaFinal, java.time.temporal.ChronoUnit.DAYS);
        double total = vueloIda.getPrecio() + vueloVuelta.getPrecio() + (hotel.getPrecioNoche() * dias);

        return nombre + " (" + fechaInicio.format(FORMATO) + " a " + fechaFinal.format(FORMATO) + ") - "
                + dias + " días - Total: " + total + "€";
    }

}
