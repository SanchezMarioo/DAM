/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class GestorSensores {

    private ArrayList<Sensor> sensores;
    private final double MIN_CO2 = 100.0;
    private final double MAX_CO2 = 2000.0;
    private final double MIN_TEMP = 10.0;
    private final double MAX_TEMP = 60.0;
    private final int SENSORES_DEFECTO = 7;
    private Random random = new Random();
    private Scanner sc;

    public GestorSensores() {
        sensores = new ArrayList<>();
        crearPorDefecto();
    }

    private void crearPorDefecto() {
        for (int i = 0; i < SENSORES_DEFECTO; i++) {
            sensores.add(new Sensor("S" + i, generarNivelPorDefecto(), generarTemperatura(), generarCiudad()));
        }
    }

    private double generarNivelPorDefecto() {
        return random.nextDouble(MIN_CO2, MAX_CO2);
    }

    private double generarTemperatura() {
        return random.nextDouble(MIN_TEMP, MAX_TEMP);
    }

    public Ciudad generarCiudad() {
        Ciudad ciudades[] = Ciudad.values();
        int numero = random.nextInt(ciudades.length);
        return ciudades[numero];
    }

    public void getSensoresMayoresCO2(double num) {
        for (Sensor sensor : sensores) {
            if (sensor.getNivelCO2() > num) {
                System.out.println(sensor);
            }

        }
    }

    public double calcularTemperaturaMedia() {
        int sumaTemp = 0;
        for (Sensor sensor : sensores) {
            sumaTemp += sensor.getTemperatura();
        }
        return sumaTemp / sensores.size();
    }

    public Sensor getMayorCO2() {
        Sensor mayorCO2 = sensores.get(0);
        for (Sensor sensor : sensores) {
            if (mayorCO2.getNivelCO2() > sensor.getNivelCO2()) {
                mayorCO2 = sensor;
            }
        }
        return mayorCO2;
    }

    public void getSensoresUbicacion(Ciudad ubicacion) {
        boolean encontrado = false;
        for (Sensor sensor : sensores) {
            if (sensor.getUbicacion() == ubicacion) {
                System.out.println(sensor);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se han encontrado sensores en la ubicación: " + ubicacion);
        }
    }

    public void mostrarMenu() {
        int opcion = -1;
        do {
            sc = new Scanner(System.in);
            System.out.println("1. Mostrar sensores mayores al CO2 indicado");
            System.out.println("2. Calcular temperatura media");
            System.out.println("3. Obtener sensor con mayor C02");
            System.out.println("4. Verificar sensores en una ubicacion concreta");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            funcionalidadMenu(opcion, sc);
        } while (opcion != 0);

    }

    private void mostrarCiudades() {
        Ciudad ciudades[] = Ciudad.values();
        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad.toString());
        }
    }

    private void funcionalidadMenu(int opcion, Scanner sc) {
        switch (opcion) {
            case 1 -> {
                System.out.println("Dime los sensores con mayor CO2");
                double CO2 = sc.nextDouble();
                sc.nextLine();
                getSensoresMayoresCO2(CO2);
            }
            case 2 -> {
                System.out.println("La temperatura media de los sensores es: " + calcularTemperaturaMedia());
            }
            case 3 -> {
                System.out.println(getMayorCO2());
            }
            case 4 -> {
                System.out.println("Dime la ubicación donde se encuentra el sensor: ");
                String ubicacionInput = sc.nextLine().toUpperCase().trim();
                Ciudad ciudadEncontrada = null;

                for (Ciudad c : Ciudad.values()) {
                    if (c.name().equals(ubicacionInput)) {
                        ciudadEncontrada = c;
                        break;
                    }
                }
                if (ciudadEncontrada != null) {
                    getSensoresUbicacion(ciudadEncontrada);
                } else {
                    System.out.println("La ciudad '" + ubicacionInput + "' no es válida o no existe.");
                }
            }
        }
    }
}
