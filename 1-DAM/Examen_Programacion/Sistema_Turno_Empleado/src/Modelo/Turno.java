/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MARIO
 */
public class Turno {

    private int id;
    private String nombreEmpleado;
    private LocalDate fecha;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private String departamento;

    public int getId() {
        return id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Duration calcularDuracion() {
        Duration duration = Duration.between(horaEntrada, horaSalida);
        if(duration.isNegative()){
            return duration.plus(Duration.ofHours(24));
        }
        return duration;
    }
}
