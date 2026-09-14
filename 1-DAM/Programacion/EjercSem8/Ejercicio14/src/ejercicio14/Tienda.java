/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public abstract class Tienda {

    private String nombre;
    private double precioBase;

    public Tienda(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarInfo();

}
