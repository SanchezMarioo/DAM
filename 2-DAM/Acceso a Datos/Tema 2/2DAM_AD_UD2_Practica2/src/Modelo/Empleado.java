/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author mario.sanper.2
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private String puesto;
    private String fechaAlta;
    private double salario;
    private double comision;
    private int idDepartamento;

    public Empleado(String dni, String nombre, String apellidos, String puesto, String fechaAlta, double salario, double comision, int idDepartamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.fechaAlta = fechaAlta;
        this.salario = salario;
        this.comision = comision;
        this.idDepartamento = idDepartamento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", puesto=" + puesto + ", fechaAlta=" + fechaAlta + ", salario=" + salario + ", comision=" + comision + ", idDepartamento=" + idDepartamento + '}';
    }
    

}
