/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class EmpleadoDepartamento {
    private String dni;
    private String nombre;
    private String apellidos;
    private String puesto;
    private String nombreDepartamento;
    private String localidad;

    public EmpleadoDepartamento(String dni, String nombre, String apellidos, String puesto, String nombreDepartamento, String localidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.nombreDepartamento = nombreDepartamento;
        this.localidad = localidad;
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

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "EmpleadoDepartamento{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", puesto=" + puesto + ", nombreDepartamento=" + nombreDepartamento + ", localidad=" + localidad + '}';
    }
    
}
