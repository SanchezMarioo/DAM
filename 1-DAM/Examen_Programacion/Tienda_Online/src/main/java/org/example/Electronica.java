package org.example;

public class Electronica extends Producto implements Descuento {
    private String marca;
    private int añosGarantia;

    public Electronica(String nombre, double precioBase, String marca, int añosGarantia) {
        super(nombre, precioBase);
        this.marca = marca;
        this.añosGarantia = añosGarantia;
    }

    /**
     * @param descuento
     * @return
     */
    @Override
    public double aplicarDescuento(int descuento) {
        return getPrecioBase() * descuento / 100;
    }
}
