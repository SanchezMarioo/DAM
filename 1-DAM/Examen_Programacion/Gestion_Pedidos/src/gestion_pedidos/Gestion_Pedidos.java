/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_pedidos;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Gestion_Pedidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int codPedidos[][] = new int[20][2];
        double importePedidos[] = new double[20];
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        do {
            mostrarMenu();
            int opcion = mostrarMensaje("Selecciona una opcion", 1, 5, sc);
            switch (opcion) {
                case 1 -> {
                    contador = añadirPedido(codPedidos, importePedidos, contador, sc);
                }
                case 2 -> {
                    estadoPedido(codPedidos, sc);
                }
                case 3 -> {
                    mostrarPedidos(contador, codPedidos, importePedidos);
                }
                case 4 -> {
                    resumenEconomico(codPedidos, importePedidos);
                }
            }
        } while (true);

    }

    static void mostrarMenu() {
        System.out.println("");
        System.out.println("=============================");
        System.out.println("1.Crear nuevo pedido");
        System.out.println("2.Cambiar estado de un pedido");
        System.out.println("3.Mostrar todos los pedidos");
        System.out.println("4.Mostrar resumen económico");
        System.out.println("5.Salir");
        System.out.println("=============================");
    }

    static int añadirPedido(int[][] codPedidos, double[] importePedidos, int contador, Scanner sc) {
        int codProducto = mostrarMensaje("Dime el codigo del envio", 0, sc);

        boolean existePedido = existeCodProducto(codPedidos, codProducto, contador);
        if (!existePedido) {
            codPedidos[contador][0] = codProducto;
        } else {
            while (existePedido) {
                System.out.println("Este codigo de producto ya existe. Introduzce otro codigo: ");
                codProducto = sc.nextInt();
                existePedido = existeCodProducto(codPedidos, codProducto, contador);
            }
        }
        double importe = mostrarMensajeReal("Dime el importe del pedido", 0, sc);
        importePedidos[contador] = importe;
        contador++;
        return contador;

    }

    static void estadoPedido(int[][] codPedidos, Scanner sc) {
        int estadoCambiar = 0;
        int posPedido = 0;
        int pedido = mostrarMensaje("Dime el codigo del producto: ", 0, sc);
        String estado = "";
        for (int i = 0; i < codPedidos.length; i++) {
            if (codPedidos[i][0] == pedido) {
                posPedido = i;
            }
        }
        if (codPedidos[posPedido][0] == 0) {
            System.out.println("El pedido no existe.");
        } else {
            System.out.println("Pedido " + codPedidos[posPedido][0] + " " + estado);
            mostrarMenuEstado();
            if (codPedidos[posPedido][1] == 1 || codPedidos[posPedido][1] == 2) {
                System.out.println("El pedido esta cancelado. No se puede cambiar el estado ");
            } else {
                estadoCambiar = mostrarMensaje("¿A que estado desea cambiarlo: ", 0, 2, sc);
                codPedidos[posPedido][1] = estadoCambiar;
            }
        }

    }

    static void mostrarMenuEstado() {
        System.out.println("0. Pendiente");
        System.out.println("1. Cancelado ");
        System.out.println("2. Enviado");
        System.out.println("-1. Salir");
    }

    static String pedidoString(int numeroPedido, int codPedidos[][]) {
        String estado = "";
        switch (codPedidos[numeroPedido][1]) {
            case 0:
                estado = "Pendiente";
                break;
            case 1:
                estado = "Cancelado";
                break;
            case 2:
                estado = "Enviado";
                break;
            default:
                estado = "No hay estado";
                break;
        }
        return estado;
    }

    static void mostrarPedidos(int contador, int codPedidos[][], double importePedidos[]) {
        System.out.println("==================================================================");
        System.out.print("Codigo pedidos" + "\t");
        System.out.print("Importe pedido" + "\t");
        System.out.println("Estado Pedido " + "\t");
        System.out.println("==================================================================");
        for (int i = 0; i < contador; i++) {
            System.out.println("");
            System.out.print(codPedidos[i][0] + "\t");
            System.out.printf("%.2f\t", importePedidos[i]);
            System.out.print(pedidoString(i, codPedidos));

        }
        System.out.println("");
    }

    static void resumenEconomico(int pedidos[][], double[] importe) {
        System.out.printf("Total facturado: %.2f%n", totalPorEstado(2, pedidos, importe));
        System.out.printf("Total perdido: %.2f%n", totalPorEstado(1, pedidos, importe));
        System.out.printf("Importe pendiente de facturar: %.2f%n", totalPorEstado(0, pedidos, importe));
        System.out.printf("Pedido enviado de mayor importe: %.2f%n", ordenarImporte(pedidos, importe));
    }

    static double totalPorEstado(int numero, int pedidos[][], double[] importe) {
        double total = 0;
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i][1] == numero) {
                total += importe[i];
            }
        }
        return total;
    }

    static double ordenarImporte(int pedidos[][], double[] importe) {
        double importeMayor = 0;
        for (int i = 0; i < importe.length; i++) {
            if (importe[i] > importeMayor) {
                importeMayor = importe[i];
            }
        }
        return importeMayor;
    }

    static int mostrarMensaje(String mensaje, int minimo, int maximo, Scanner sc) {
        int numero;

        do {
            System.out.println(mensaje);

            while (!sc.hasNextInt()) {
                System.out.println("¡No has introducido un número!");
                sc.next();
            }

            numero = sc.nextInt();

            if (numero < minimo || numero > maximo) {
                System.out.println("El número debe estar entre " + minimo + " y " + maximo);
            }

        } while (numero < minimo || numero > maximo);

        return numero;
    }

    static double mostrarMensajeReal(String mensaje, double minimo, Scanner sc) {
        double numero;

        do {
            System.out.println(mensaje);

            while (!sc.hasNextDouble()) {
                System.out.println("¡No has introducido un número!");
                sc.next();
            }

            numero = sc.nextDouble();

            if (numero < minimo) {
                System.out.println("El número debe estar entre " + minimo);
            }

        } while (numero < minimo);

        return numero;
    }

    static int mostrarMensaje(String mensaje, int minimo, Scanner sc) {
        int numero;

        do {
            System.out.println(mensaje);

            while (!sc.hasNextInt()) {
                System.out.println("¡No has introducido un número!");
                sc.next();
            }

            numero = sc.nextInt();

            if (numero < minimo) {
                System.out.println("El número debe estar entre " + minimo);
            }

        } while (numero < minimo);

        return numero;
    }

    static boolean existeCodProducto(int[][] pedidos, int codigoPedido, int contador) {
        // Bucle externo recorre 0 a contador para comprobar si hay un codigo igual  
        for (int i = 0; i < contador; i++) {
            if (pedidos[i][0] == codigoPedido) {
                System.out.println(pedidos[i]);
                return true;
            }
        }
        return false;
    }
}
