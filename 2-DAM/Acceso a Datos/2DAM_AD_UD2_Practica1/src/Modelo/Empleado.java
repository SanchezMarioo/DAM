/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

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

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", puesto=" + puesto + ", fechaAlta=" + fechaAlta + ", salario=" + salario + ", comision=" + comision + ", idDepartamento=" + idDepartamento + '}';
    }
    
    
}
