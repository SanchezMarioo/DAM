/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public class Electronica extends Tienda implements Descuento {

    private String marca;
    private int añosGarantia;

    public Electronica(String nombre, double precioBase, String marca, int aniosGarantia) {
        super(nombre, precioBase);
        this.marca = marca;
        this.añosGarantia = aniosGarantia;
    }

    public Electronica(String nombre, int añosGarantia, double precioBase) {
        super(nombre, precioBase);
        this.añosGarantia = añosGarantia;
    }

    @Override
    public double calcularPrecioFinal(int descuento) {
        return getPrecioBase() * (1 - (descuento / 100));
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== ELECTRÓNICA ===");
        System.out.println("Nombre        : " + getNombre());
        System.out.println("Precio base   : " + getPrecioBase() + " ?");
        System.out.println("Marca         : " + marca);
        System.out.println("Años garantía : " + añosGarantia);
    }

}
