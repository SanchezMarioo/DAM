package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int contador = 0;
        final int NUM_PRODUCTOS = 25;
        int[] codProductos = new int[NUM_PRODUCTOS];
        int[] stock = new int[NUM_PRODUCTOS];
        double[] precioUnitario = new double[NUM_PRODUCTOS];
        do {
            mostrarMenu();
            int opcion = mostrarMensaje(sc, "Escoge una opcion", 1, 6);
            switch (opcion) {
                case 1 -> {
                    contador = añadirProducto(sc, contador, codProductos, stock, precioUnitario);
                }
                case 2 -> {
                    añadirStock(sc, codProductos, stock);
                }
                case 3 -> {
                    retirarStock(sc, codProductos, stock);
                }
                case 4 -> {
                    mostrarInventario(contador, codProductos, stock, precioUnitario);
                }
                case 5 -> {
                    informeAlmacen(contador, codProductos, stock, precioUnitario);
                }
                case 6 -> {
                    System.out.println("FIN DEL PROGRAMA");
                }
            }
            if (opcion == 6) {
                break;
            }
        } while (true);
    }

    static int añadirProducto(Scanner sc, int contador, int[] codProductos, int[] stock, double[] precioUnitario) {
        int codProducto = mostrarMensaje(sc, "Dime el codigo del producto: ", 0);
        boolean existeProducto = existeProducto(codProductos, codProducto);
        if (!existeProducto) {
            codProductos[contador] = codProducto;
        } else {
            while (existeProducto) {
                System.out.println("El producto ya existe.");
                codProducto = mostrarMensaje(sc, "Dime el codigo del producto: ", 0);
                existeProducto = existeProducto(codProductos, codProducto);
            }
        }
        int stockProducto = mostrarMensaje(sc, "Dime el stock  del producto: ", 0);
        stock[contador] = stockProducto;
        double precioUnitarioProducto = mostrarMensajeReal(sc, "Dime el precio unitario del producto: ", 0.0);
        precioUnitario[contador] = precioUnitarioProducto;
        contador++;
        return contador;
    }

    static boolean existeProducto(int[] codProductos, int numero) {
        for (int i = 0; i < codProductos.length; i++) {
            if (codProductos[i] == numero) {
                return true;
            }
        }
        return false;
    }

    static void añadirStock(Scanner sc, int[] codProducto, int[] stock) {
        int codProductoArticulo = mostrarMensaje(sc, "Dime el codigo del producto: ", 0);
        boolean existeProducto = existeProducto(codProducto, codProductoArticulo);
        if (!existeProducto) {
            while (!existeProducto) {
                System.out.println("El producto NO existe.");
                codProductoArticulo = mostrarMensaje(sc, "Dime el codigo del producto: ", 0);
                existeProducto = existeProducto(codProducto, codProductoArticulo);
            }
        }
        int posProducto = encontraProducto(codProducto, codProductoArticulo);
        int stockAñadir = mostrarMensaje(sc, "Dime el stock a añadir: ", 0);
        stock[posProducto] += stockAñadir;
        System.out.println("Se ha añadido el stock correctamente hay " + stock[posProducto] + " unidades. ");

    }

    static void retirarStock(Scanner sc, int[] codProducto, int[] stock) {
        int codProductoArticulo = mostrarMensaje(sc, "Dime el codigo del producto: ", 0);
        boolean existeProducto = existeProducto(codProducto, codProductoArticulo);
        if (!existeProducto) {
            while (!existeProducto) {
                System.out.println("El producto NO existe.");
                codProductoArticulo = mostrarMensaje(sc, "Dime el codigo del producto: ", 0);
                existeProducto = existeProducto(codProducto, codProductoArticulo);
            }
        }
        int posProducto = encontraProducto(codProducto, codProductoArticulo);
        int stockRetirar;
        boolean stockMayor = false;
        do {

            stockRetirar = mostrarMensaje(sc, "Dime el stock a retirar: ", 0);
            stockMayor = stockRetirar > stock[posProducto] ? true : false;
            if (stockMayor) {
                System.out.println("No hay suficiente stock actualmente hay " + stock[posProducto] + " unidades");
            }
        } while (stockMayor);
        stock[posProducto] -= stockRetirar;
        System.out.println("Se ha retirado el stock correctamente hay " + stock[posProducto] + " unidades. ");

    }

    static int encontraProducto(int[] codProducto, int codProductoArticulo) {
        for (int i = 0; i < codProducto.length; i++) {
            if (codProducto[i] == codProductoArticulo) {
                return i;
            }
        }
        return 0;
    }

    static void mostrarInventario(int contador, int[] codProductos, int[] stock, double[] precioUnitario) {
        System.out.println("============================================================");
        System.out.printf("%-20s %-10s %-20s %-10s\n", "Codigo producto", "Stock", "Precio unitario", "Total");
        System.out.println("============================================================");

        for (int i = 0; i < contador; i++) {
            System.out.printf("%-20d %-10d %-20.2f %-10.2f\n", codProductos[i], stock[i], precioUnitario[i], (stock[i] * precioUnitario[i]));
            System.out.println();
        }
        System.out.println();
    }

    static void informeAlmacen(int contador, int[] codProductos, int[] stock, double[] precioUnitario) {
        double totalSuma = 0;
        double producto = 0;
        double sumaMayor = 0;
        int productoSinStock = 0;
        int sumaStock = 0;
        for (int i = 0; i < contador; i++) {
            producto = (stock[i] * precioUnitario[i]);
            totalSuma += producto;
            sumaStock += precioUnitario[i];
            if (stock[i] == 0) {
                productoSinStock++;
            }
            if (producto > sumaMayor) {
                sumaMayor = producto;
            }
        }
        System.out.println("Valor total del almacén: " + totalSuma);
        System.out.println("Producto con mayor valor: " + sumaMayor);
        System.out.println("Productos sin stock: " + productoSinStock);
        System.out.println("Precio medio con stock: " + (sumaStock / contador));
    }

    static void mostrarMenu() {
        System.out.println("1. Añadir Producto");
        System.out.println("2. Entrada de stock");
        System.out.println("3. Salida de stock");
        System.out.println("4. Mostrar inventario");
        System.out.println("5. Informe de almacén");
        System.out.println("6. Salir");
    }

    static int mostrarMensaje(Scanner sc, String mensaje, int minimo, int maximo) {
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("No has introducido un numero");
            sc.next();
        }
        int numero;
        do {
            numero = sc.nextInt();
            if ((numero < minimo) || (numero > maximo)) {
                System.out.println("El numero debe de estar entre " + minimo + " y " + maximo);
            }
        } while ((numero < minimo) || (numero > maximo));
        return numero;
    }

    static int mostrarMensaje(Scanner sc, String mensaje, int minimo) {
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("No has introducido un numero");
            sc.next();
        }
        int numero;
        do {
            numero = sc.nextInt();
            if ((numero < minimo)) {
                System.out.println("El numero debe de estar mayor a  " + minimo);
            }
        } while ((numero < minimo));
        return numero;
    }

    static double mostrarMensajeReal(Scanner sc, String mensaje, double minimo) {
        System.out.println(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println("No has introducido un numero");
            sc.next();
        }
        double numero;
        do {
            numero = sc.nextDouble();
            if ((numero < minimo)) {
                System.out.println("El numero debe de estar mayor a  " + minimo);
            }
        } while ((numero < minimo));
        return numero;
    }
}
