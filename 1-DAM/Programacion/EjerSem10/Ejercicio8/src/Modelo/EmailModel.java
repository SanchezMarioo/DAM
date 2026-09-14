/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;

/**
 *
 * @author mario.sanper.2
 */
public class EmailModel {

    private String nombre;
    private LocalDateTime fecha;

    public EmailModel(String nombre, LocalDateTime fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    
    @Override
    public String toString() {
        return "Email: " + nombre + " | " + fecha;
    }

}
