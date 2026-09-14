/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor_videojuegos;

/**
 *
 * @author Mario
 */
public class Videojuego {
    private String nombre;
    private double cantidad;

    public Videojuego(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters necesarios para que las búsquedas e impresiones funcionen
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }
}
