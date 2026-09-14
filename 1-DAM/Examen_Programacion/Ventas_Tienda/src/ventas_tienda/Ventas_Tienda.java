/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas_tienda;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ventas_Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        final int MAX_VENTAS = 100;
        int opcion = 0;
        int[] codProductos = new int[MAX_VENTAS];
        int[] unidadesVendidas = new int[MAX_VENTAS];
        double[] precioUnidad = new double[MAX_VENTAS];
        int[] diaVenta = new int[MAX_VENTAS];
        int contadorVentas = 0;
        do {
            menu();

            if (contadorVentas >= MAX_VENTAS) {
                break;
            }
            opcion = validarDatos("Opcion: ", 0, 6, sc);

            switch (opcion) {
                case 0 -> {
                    System.out.println("Gracias por usar el programa!!");
                }
                case 1 -> {
                    contadorVentas = registarVenta(sc, codProductos, unidadesVendidas, precioUnidad, diaVenta, contadorVentas);
                }
                case 2 -> {
                    mostrarVentas(codProductos, unidadesVendidas, precioUnidad, diaVenta, contadorVentas);
                }
                case 3 -> {
                    totalIngresos(unidadesVendidas, precioUnidad, contadorVentas);
                }
                default -> {
                    System.out.println("");
                }

            }
            if (opcion == 0) {
                break;
            }
        } while (opcion != 0);
    }

    static void menu() {
        System.out.println("");
        System.out.println("1. Registrar una nueva venta");
        System.out.println("2. Mostrar todas las ventas registradas");
        System.out.println("3. Calcular el total de ingresos");
        System.out.println("4. Mostrar el día con mayor facturación");
        System.out.println("5. Mostrar el producto más vendido (en unidades)");
        System.out.println("6. Mostrar estadísticas por día");
        System.out.println("0. Salir del programa");
    }

    static int registarVenta(Scanner sc, int[] codProductos, int[] unidadesVendidas, double[] precioUnidad, int[] diaVenta, int contadorVentas) {
        int contador;
        int codProducto = validarDatos("Dime el codigo del producto: ", 0, sc);
        codProductos[contadorVentas] = codProducto;
        int udVendida = validarDatos("Dime las unidades vendidas: ", 0, sc);
        unidadesVendidas[contadorVentas] = udVendida;
        double precioUd = validarDatos("Dime el precio por unidad: ", 0.00, sc);
        precioUnidad[contadorVentas] = precioUd;
        int venta = validarDatos("Dime el dia que las has vendido vendidas: ", 0, 31, sc);
        diaVenta[contadorVentas] = venta;
        contadorVentas++;
        return contadorVentas;
    }

    /**
     *
     * @param codProductos
     * @param unidadesVendidas
     * @param precioUnidad
     * @param diaVenta
     * @param contadorVentas
     */
    static void mostrarVentas(int[] codProductos, int[] unidadesVendidas, double[] precioUnidad, int[] diaVenta, int contadorVentas) {
        System.out.println("=====================================================================================================================");
        System.out.printf("%-25s %-25s %-25s %-25s %-15s %n", "Codigo producto", "Unidades Vendidas", "Precio (?/ud)", "Dia", "Importe total");
        System.out.println("=====================================================================================================================");
        for (int i = 0; i < contadorVentas; i++) {
            System.out.printf("%-25d %-25d %-25.2f  %-25d %-15.2f %n",
                    codProductos[i],
                    unidadesVendidas[i],
                    precioUnidad[i],
                    diaVenta[i],
                    (precioUnidad[i] * unidadesVendidas[i]));
        }
    }

    static void totalIngresos(int[] unidadesVendidas, double[] precioUnidad, int contadorVentas) {
        double totalIngresos = 0;
        for (int i = 0; i < contadorVentas; i++) {
            totalIngresos += unidadesVendidas[i] * precioUnidad[i];
        }
        System.out.printf("Total: %.2f%n", totalIngresos);
    }

    static int validarDatos(String mensaje, int min, int max, Scanner sc) {
        do {
            System.out.print(mensaje);

            if (!sc.hasNextInt()) {
                System.out.println("No has introducido un numero.");
                sc.next();
                continue;
            }
            int numero = sc.nextInt();
            if (numero >= min && numero <= max) {
                return numero;
            } else {
                System.out.println("El numero debe de estar entre " + min + " y " + max);
                continue;
            }
        } while (true);
    }

    static double validarDatos(String mensaje, double min, Scanner sc) {
        do {
            System.out.println(mensaje);

            if (!sc.hasNextDouble()) {
                System.out.println("No has introducido un número válido.");
                sc.next();
                continue;
            }

            double numero = sc.nextDouble();

            if (numero > min) {
                return numero;
            } else {
                System.out.println("El número debe ser mayor que " + min);
            }

        } while (true);
    }

    static int validarDatos(String mensaje, int min, Scanner sc) {
        do {
            System.out.println(mensaje);

            if (!sc.hasNextInt()) {
                System.out.println("No has introducido un numero.");
                sc.next();
                continue;
            }
            int numero = sc.nextInt();
            if (numero > min) {
                return numero;
            } else {
                System.out.println("El número debe ser mayor que " + min);
                continue;
            }
        } while (true);
    }
}
