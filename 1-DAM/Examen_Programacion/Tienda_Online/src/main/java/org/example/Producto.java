package org.example;

public abstract class Producto {
    private String nombre;
    private double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return
                nombre + " | " + precioBase
                ;
    }
}
