/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Gestor {

    private Servicio servicio;
    private ArrayList<EstacionMeteorologica> estaciones;
    private Random random = new Random();
    private Scanner sc;

    // Atributos para generar las estaciones random
    private final int MIN_ALTURA = 200;
    private final int MAX_ALTURA = 1000;
    private final int MIN_VIENTO = 20;
    private final int MAX_VIENTO = 180;
    private final int MIN_PRECIPITACION = 0;
    private final int MAX_PRECIPITACION = 45;
    private final int MAX_ESTACIONES_INCIALES = 6;

    public Gestor() {
        estaciones = new ArrayList<>();
        sc = new Scanner(System.in);
        crearEstaciones();
        servicio = new Servicio(estaciones);
    }

    public void init() {
        int opcion = -1;
        
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            funcionalidadMenu(opcion);
        } while (opcion != 5);
        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Mostrar estaciones por encima de una altitud");
        System.out.println("2. Calcular velocidad media del viento");
        System.out.println("3. Estación con mayor precipitación");
        System.out.println("4. Comprobar vientos superiores a 100 km/h");
        System.out.println("5. Salir");
        System.out.println("Opcion: ");
    }

    private void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1:
                System.out.print("Introduce la altitud mínima (m): ");
                int umbral = sc.nextInt();
                sc.nextLine();
                ArrayList<EstacionMeteorologica> filtradas = servicio.estacionesAlturaMayorde(umbral);
                if (filtradas.isEmpty()) {
                    System.out.println("No hay estaciones por encima de " + umbral + " m.");
                } else {
                    System.out.println("\nEstaciones por encima de " + umbral + " m:");
                    for (EstacionMeteorologica e : filtradas) {
                        System.out.println("  " + e);
                    }
                }
                break;

            case 2:
                double media = servicio.velocidadMediaEstaciones();
                System.out.printf("Velocidad media del viento: %.2f km/h%n", media);
                break;

            case 3:
                EstacionMeteorologica mayorPrecip = servicio.estacionMayorPrecipitacion();
                if (mayorPrecip == null) {
                    System.out.println("No hay estaciones registradas.");
                } else {
                    System.out.println("Estación con mayor precipitación:");
                    System.out.println("  " + mayorPrecip);
                }
                break;

            case 4:
                boolean extremas = servicio.estacionesPeligrosas();
                if (!extremas) {
                    System.out.println("Ninguna estación ha superado los 100 km/h.");
                } else {
                    System.out.println("Hay alguan estacion que ha superado los 100km/h");
                }
                break;

            case 5:

                System.out.println("Saliendo del sistema. ¡Hasta pronto!");
                break;

            default:
                System.out.println("Opción no reconocida. Introduce un número del 1 al 5.");
        }
        sc.close();
    }

    private void crearEstaciones() {
        for (int i = 0; i < MAX_ESTACIONES_INCIALES; i++) {
            estaciones.add(new EstacionMeteorologica("EST" + i, altura(), velocidadMaximaViento(), precipitacion()));
        }

    }

    private int altura() {
        return random.nextInt(MIN_ALTURA, MAX_ALTURA);
    }

    private int velocidadMaximaViento() {
        return random.nextInt(MIN_VIENTO, MAX_VIENTO);
    }

    private int precipitacion() {
        return random.nextInt(MIN_PRECIPITACION, MAX_PRECIPITACION);
    }

}
