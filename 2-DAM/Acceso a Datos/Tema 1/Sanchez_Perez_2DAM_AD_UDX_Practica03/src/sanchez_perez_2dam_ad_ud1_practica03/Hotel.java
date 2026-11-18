/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_perez_2dam_ad_ud1_practica03;

/**
 *
 * @author Mario
 */
public class Hotel {
    private String id;
    private String nombre;
    private String descripcion;
    private String ciudad;
    private double precioNoche;

    public Hotel(String id, String nombre, String descripcion, String ciudad, double precioNoche) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.precioNoche = precioNoche;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    

    @Override
    public String toString() {
        return String.format("[ID: %02d] %-20s | %-15s | %7.2f €/noche | %s",
                id, nombre, ciudad, precioNoche, descripcion);
    }
}
