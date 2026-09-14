/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24b;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio24B {

    /**
     * @param args the command line arguments
     */
    static int contador = 0;
    // Cambiar a un switch para los productos y el precio
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double dinero = 0;

        String[] historial = new String[50];

        do {
            mostrarMenu();
            int opcion = sc.nextInt();

            if (opcion == 5) {
                System.out.println("Gracias por usar la máquina expendedora.");
                System.out.printf("Su cambio es %.2f ?%n", dinero);
                break;
            }

            switch (opcion) {
                case 1 ->
                    // Añadir saldo y incrementar dentro de la funcion 
                    dinero += introducirDinero(sc);

                case 2 ->
                    dinero = compraProducto(sc, historial, dinero);

                case 3 ->
                    // Hacer en una funcion 
                    System.out.printf("Saldo disponible: %.2f ?%n", dinero);

                case 4 ->
                    historialProductos(historial, contador);

                default ->
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (true);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("===== MÁQUINA EXPENDEDORA =====");
        System.out.println("1. Introducir dinero");
        System.out.println("2. Comprar un producto");
        System.out.println("3. Consultar saldo disponible");
        System.out.println("4. Ver historial de compras");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    static double introducirDinero(Scanner sc) {
        double cantidad;
        do {
            System.out.print("Introduce la cantidad de dinero (?): ");
            cantidad = sc.nextDouble();
        } while (cantidad <= 0);
        return cantidad;
    }

    static double compraProducto(Scanner sc, String[] historial, double dinero) { 
        double producto = 0;
        String codProducto = "";
        do {
            System.out.println("===== PRODUCTOS DISPONIBLES =====");
            System.out.println("1. Agua - 1,00 ?");
            System.out.println("2. Refresco - 1,50 ?");
            System.out.println("3. Zumo - 1,80 ?");
            System.out.println("4. Snack - 2,00 ?");
            System.out.println("5. Chocolate - 1,20 ?");
            System.out.println("-1. Volver al menú");
            System.out.print("Selecciona el código del producto: ");

            int idProducto = sc.nextInt();

            if (idProducto == -1) {
                break;
            }

            producto = 0;
            codProducto = "";

            switch (idProducto) {
                case 1 -> {
                    producto = 1.00;
                    codProducto = "Agua - 1,00 ?";
                }
                case 2 -> {
                    producto = 1.50;
                    codProducto = "Refresco - 1,50 ?";
                }
                case 3 -> {
                    producto = 1.80;
                    codProducto = "Zumo - 1,80 ?";
                }
                case 4 -> {
                    producto = 2.00;
                    codProducto = "Snack - 2,00 ?";
                }
                case 5 -> {
                    producto = 1.20;
                    codProducto = "Chocolate - 1,20 ?";
                }
                default -> {
                    System.out.println("Código de producto no válido.");
                    continue;
                }
            }

            if (dinero >= producto) {
                dinero -= producto;
                System.out.println("Producto entregado correctamente.");
                historial[contador] = codProducto;
                contador++;
            } else {
                System.out.println("Saldo insuficiente para realizar la compra.");
            }

        } while (true);

        return dinero;
    }

    static void historialProductos(String[] historial, int contador) {
        if (contador == 0) {
            System.out.println("No se han realizado compras.");
        } else {
            System.out.println("===== HISTORIAL DE COMPRAS =====");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + historial[i]);
            }
        }
    }

}
