/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author MARIO
 */
public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private LocalDate fechaCompra;
    private double precio;

    public Libro(int id, String titulo, String autor, LocalDate fechaCompra, double precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }


    public String mostrarInformacion(int dias) {
        return "[" + id + "]" + " | " + titulo + " - " + autor + " | " + "Comprado: " + fechaCompra + " | " + "Precio: " + precio + "Días en biblioteca: " + dias;
    }
    

}
