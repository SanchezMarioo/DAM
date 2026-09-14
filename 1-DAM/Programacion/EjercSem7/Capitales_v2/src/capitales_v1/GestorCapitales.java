/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitales_v1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class GestorCapitales {

    private Scanner sc;
    private ArrayList<Capital> listaCapitales;

    public GestorCapitales() {
        sc = new Scanner(System.in);
        listaCapitales = new ArrayList<>();
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("======================");
            System.out.println("1. Añadir ciudad");
            System.out.println("2. Ver las ciudades añadidas");
            System.out.println("3. Salir");
            System.out.println("======================");
            opcion = leerEntero("Opcion: ", 1, 3);
            if (opcion == 3) {
                break;
            }
            funcionalidadMenu(opcion);
        } while (opcion != 3);
        sc.close();

    }

    private void ordenarLista() {
        listaCapitales.sort((c1, c2) -> {
            if (c1.getNumeroHabitantes() > c2.getNumeroHabitantes()) {
                return 1;
            }
            if (c2.getNumeroHabitantes() > c1.getNumeroHabitantes()) {
                return -1;
            }
            return c1.getNombre().compareTo(c2.getNombre());
        });
    }

    private void listarCiudades() {
        if (listaCapitales.isEmpty()) {
            System.out.println("El array esta vacio");
            return;
        }

        for (Capital capital : listaCapitales) {
            System.out.println();
            System.out.println("============================");
            System.out.println("Nombre de la capital: " + capital.getNombre());
            System.out.println("Poblacion de " + capital.getNombre() + " : " + capital.getNumeroHabitantes());
            System.out.println("Nombre del pais: " + capital.getPais());
            System.out.println("============================");
        }
    }

    private void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 -> {
                añadirCiudad();
            }
            case 2 -> {
                listarCiudades();
            }
            case 3 -> {
                System.out.println("Saliendo del programa");
            }

        }
    }

    private void añadirCiudad() {
        System.out.println("Nombre de la capital: ");
        String nombre = sc.nextLine();
        double numeroHabitantes = leerDouble("Poblacion de " + nombre + " : ");
        sc.nextLine();
        System.out.println("Nombre del pais: ");
        String pais = sc.nextLine();
        listaCapitales.add(new Capital(nombre, pais, numeroHabitantes));
        ordenarLista();

    }

    private int leerEntero(String mensaje, int minimo, int maximo) {
        while (true) {
            System.out.print(mensaje);
            if (!sc.hasNextInt()) {
                System.out.println("No es un número válido.");
                sc.next(); // limpiar entrada incorrecta
                continue;
            }
            int numero = sc.nextInt();
            sc.nextLine();
            if (numero >= minimo && numero <= maximo) {
                return numero;
            } else {
                System.out.println("El numero debe de estar entre " + minimo + " y " + maximo);
            }
        }
    }

    private double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (!sc.hasNextDouble()) {
                System.out.println("No es un número válido.");
                sc.next(); // limpiar entrada incorrecta
                continue;
            }
            double numero = sc.nextDouble();
            return numero;
        }
    }
}
