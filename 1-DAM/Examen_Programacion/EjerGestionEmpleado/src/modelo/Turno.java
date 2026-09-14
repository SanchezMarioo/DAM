/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Mario
 */
public class Turno {
    private String codEmpleado;
    private LocalDate fecha;
    private int horas;

    public Turno(String codEmpleado, LocalDate fecha, int horas) {
        this.codEmpleado = codEmpleado;
        this.fecha = fecha;
        this.horas = horas;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHoras() {
        return horas;
    }
    
}
