/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public class Ropa extends Tienda implements Descuento {

    private String talla;
    private String tipoPrenda;
    private String color;

    public Ropa(String nombre, double precioBase, String talla, String tipoPrenda, String color) {
        super(nombre, precioBase);
        this.talla = talla;
        this.tipoPrenda = tipoPrenda;
        this.color = color;
    }

    public Ropa(String nombre, String talla, double precioBase, String color) {
        super(nombre, precioBase);
        this.talla = talla;
        this.tipoPrenda = tipoPrenda;
    }

    @Override
    public double calcularPrecioFinal(int descuento) {
        return getPrecioBase() * (1 - (descuento / 100));
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio base: " + getPrecioBase());
        System.out.println("Tipo prenda: " + tipoPrenda);
        System.out.println("Talla: " + talla);
        System.out.println("Color : " + color);
    }

}
