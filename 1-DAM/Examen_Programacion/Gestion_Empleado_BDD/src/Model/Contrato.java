/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author Mario
 */
public class Contrato {
    private int idContrato;
    private int idEmpleado;
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Contrato(int idContrato, int idEmpleado, String tipo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.idContrato = idContrato;
        this.idEmpleado = idEmpleado;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getTipo() {
        return tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    
    @Override
    public String toString() {
        return "Contrato" + idContrato + " | " + idEmpleado + " | " + tipo + " | " + fechaInicio + " | " + fechaFin;
    }
    
    
}
