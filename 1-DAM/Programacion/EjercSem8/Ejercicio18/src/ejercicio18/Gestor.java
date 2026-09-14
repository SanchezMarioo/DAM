/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {

    private Scanner sc;
    private final int MAX_PRODUCTOS = 5;
    private Producto productos[] = new Producto[MAX_PRODUCTOS];
    private int contador = 0;

    public Gestor() {
        sc = new Scanner(System.in);
        cargarDatos();
    }

    private void añadirProducto(Producto producto) {
        productos[contador] = producto;
        contador++;
    }

    private void cargarDatos() {
        añadirProducto(new Producto("Camiseta"));
        añadirProducto(new Producto("Pantalon"));
        añadirProducto(new Producto("Zapatillas"));
        añadirProducto(new Producto("Chaqueta"));
    }

    public void init() {
        try {
            System.out.println("Dime la posicion del array: ");
            int posicion = sc.nextInt();

            Producto p = consultarProducto(posicion);

            if (p != null) {
                System.out.println("Producto encontrado: " + p);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: La entrada debe ser un número entero.");
        }
    }

    private Producto consultarProducto(int posicion) {
        try {
            return productos[posicion];
        } catch (ArrayIndexOutOfBoundsException | ArrayStoreException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
