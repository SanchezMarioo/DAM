/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class GestorApp {

    private ArrayList<Tienda> productos = new ArrayList<>();
    private final int DESCUENTO_PRODUCTOS = 10;

    private void cargarDatos() {
        productos.add(new Ropa("Camiseta de algodón", 29.99, "M", "Camiseta", "Blanco"));
        productos.add(new Ropa("Chaqueta de cuero", 149.95, "L", "Chaqueta", "Negro"));
        productos.add(new Electronica("Smartphone X200", 699.00, "Samsung", 2));
        productos.add(new Electronica("Auriculares Pro", 199.99, "Sony", 1));
        productos.add(new LibroEscolar("Matemáticas 3º ESO", 24.50, "3º ESO", "Matemáticas"));
        productos.add(new LibroEscolar("Historia del Mundo", 21.00, "4º ESO", "Historia"));
    }

    public void init() {
        cargarDatos();
        mostrarProductos();
        aplicarDescuento();
    }

    public void mostrarProductos() {
        for (Tienda producto : productos) {
            producto.mostrarInfo();
            System.out.println("");
        }
    }

    private void aplicarDescuento() {
        for (Tienda producto : productos) {
            if (producto instanceof Descuento) {
                System.out.println();
                System.out.println(producto.getNombre() + ": " + ((Descuento) producto).calcularPrecioFinal(DESCUENTO_PRODUCTOS));

            } else{
                System.out.println(producto.getNombre() + ": " + "NO TIENE DESCUENTO");
            }
        } 
    }
}
