package org.example;

public class Ropa extends Producto implements Descuento {
    private String talla;
    private String tipoPrenda;
    private String color;

    public Ropa(String nombre, double precioBase, String talla, String tipoPrenda) {
        super(nombre, precioBase);
        this.talla = talla;
        this.tipoPrenda = tipoPrenda;
        this.color = color;
    }

    /**
     * @param descuento
     * @return
     */
    @Override
    public double aplicarDescuento(int descuento) {
        return getPrecioBase() * descuento / 100;
    }

    @Override
    public String toString() {
        return talla + " | " +
                tipoPrenda + " |" +
                color + " | " +
                super.toString();
    }
}
