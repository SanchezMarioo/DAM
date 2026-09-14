/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Mario
 */
public class Libro {

    private int id;
    private String titulo;
    private String autor;
    private Date fechaPublicacion;
    private boolean disponible;

    public Libro(int id, String titulo, String autor, Date fechaPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro " + id + " | " + titulo + " | " + autor + " | " + fechaPublicacion + " | " + (disponible ? "Si" : "No");
    }

}
