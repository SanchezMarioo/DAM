/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_inventario;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Gestion_Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroProductos = sc.nextInt();
        int numeroRegistros = sc.nextInt();
        int precio[] = new int[numeroProductos];
        int stock[] = new int[numeroProductos];
        int registros[][] = new int[numeroProductos][numeroRegistros];
        int totalPrecio[] = new int[numeroProductos];
        int indice[] = {1, 2, 3};
        for (int i = 0; i < precio.length; i++) {
            int numeroAñadir = sc.nextInt();
            precio[i] = numeroAñadir;
        }
        for (int i = 0; i < stock.length; i++) {
            int numeroAñadir = sc.nextInt();
            stock[i] = numeroAñadir;
        }
        for (int i = 0; i < numeroProductos; i++) {
            for (int j = 0; j < numeroRegistros; j++) {
                int numeroAñadir = sc.nextInt();
                registros[i][j] = numeroAñadir;
            }
        }
        for (int i = 0; i < numeroProductos; i++) {
            int sumaRegistros = 0;
            int devoluciones = 0;
            int ventas = 0;
            int totalIngresado = 0;
            int productoSinStock = 0;

            int productoStock10[] = new int[numeroProductos];
            for (int j = 0; j < numeroRegistros; j++) {
                sumaRegistros += registros[i][j];
                if (registros[i][j] > 0) {
                    ventas += precio[i] * registros[i][j];
                } else {
                    devoluciones -= precio[i] * registros[i][j];
                }
            }
            int stockTotal = stock[i] - sumaRegistros;
            totalIngresado = ventas - devoluciones;
            for (int j = 0; j < totalPrecio.length; j++) {
                totalPrecio[i] = totalIngresado;
            }
            if (stockTotal == 0) {
                productoSinStock++;
            }
            if (stockTotal > 10) {
                productoStock10[i] = i;
            }

            System.out.println("Producto" + (i + 1) + " : " + stockTotal);
            System.out.println("Stock" + (i + 1) + " : " + totalIngresado);
        }
        for (int i = 0; i < totalPrecio.length; i++) {
            for (int j = 0; j < totalPrecio.length - 1; j++) {
                if (totalPrecio[j] > totalPrecio[j + 1]) {
                    int aux = totalPrecio[j + 1];
                    totalPrecio[j + 1] = totalPrecio[j];
                    totalPrecio[j] = aux;
                    int auxIndice = indice[j + 1];
                    indice[j + 1] = indice[j];
                    indice[j] = aux;
                }
            }
        }
        for (int i = 0; i < totalPrecio.length; i++) {
            System.out.println("Producto" + indice[i] + ": Stock =" + ", Ingreso = " + (totalPrecio[i] + 1));
        }
    }

}
