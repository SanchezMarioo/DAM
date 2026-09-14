package org.example;

public class Gestor {
    public void iniciar() {

        // Crear productos
        Ropa camiseta = new Ropa("Camiseta básica", 20.0, "M", "Azul");
        Electronica movil = new Electronica("Smartphone X", 500.0, "TechBrand", 2);
        LibroEscolar libro = new LibroEscolar("Matemáticas 2º ESO", 30.0, "2º ESO", "Matemáticas");

        // Mostrar información
        System.out.println("=== PRODUCTOS ===");
        System.out.println(camiseta);
        System.out.println(movil);
        System.out.println(libro);

        System.out.println("\n=== APLICACIÓN DE DESCUENTOS ===");

        // Ropa (sí permite descuento)
        double precioCamiseta = camiseta.aplicarDescuento(10); // 10% descuento
        System.out.println("Precio camiseta con descuento: " + precioCamiseta);

        // Electrónica (sí permite descuento)
        double precioMovil = movil.aplicarDescuento(15); // 15% descuento
        System.out.println("Precio móvil con descuento: " + precioMovil);

        aplicarDescuento(libro);


    }
    private void aplicarDescuento (Producto producto ){
        if(producto instanceof Descuento){
            System.out.println("Precio con descuento: " + ((Descuento) producto).aplicarDescuento(10)); // 10% descuento
        } else{
            System.out.println("No tiene descuento");
        }
    }
}
