/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Gestion {

    private static final int CAPACIDAD = 6;

    private MisionExploracion[] exploraciones;
    private MisionSatelite[] satelites;
    private MisionTripulada[] tripuladas;
    private Scanner sc;

    private int numExploraciones;
    private int numSatelites;
    private int numTripuladas;

    public Gestion() {
        exploraciones = new MisionExploracion[CAPACIDAD];
        satelites = new MisionSatelite[CAPACIDAD];
        tripuladas = new MisionTripulada[CAPACIDAD];
        sc = new Scanner(System.in);
        numExploraciones = 0;
        numSatelites = 0;
        numTripuladas = 0;

    }

    public void iniciar() {
        System.out.println("=== HELIOS SPACE - SISTEMA DE CONTROL DE MISIONES ===");

        int opcion;
        do {
            cargarDatosEjemplo();
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            funcionalidadMenu(opcion);
            
        } while (opcion != 0);

        sc.close();
    }

    private void mostrarMenu() {
        System.out.println();
        System.out.println("1. Mostrar todas las misiones");
        System.out.println("2. Filtrar por presupuesto");
        System.out.println("3. Duracion media");
        System.out.println("4. Buscar mision por nombre");
        System.out.println("5. Conteo por tipo");
        System.out.println("6. Insertar nueva mision");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }

    private void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 ->
                mostrarTodas();
            case 2 ->
                filtrarPresupuesto();
            case 3 ->
                duracionMedia();
            case 4 ->
                misionPorNombre();
            case 5 ->
                conteoPorTipo();
            case 6 ->
                insertarNuevaMision();
            default ->
                System.out.println("Opcion no valida.");

        }
    }

    private void mostrarTodas() {
        System.out.println("--- MISIONES DE EXPLORACION (" + numExploraciones + ") ---");
        if (numExploraciones == 0) {
            System.out.println("  Sin misiones registradas.");
        }
        for (int i = 0; i < numExploraciones; i++) {
            exploraciones[i].mostrarInformacion();
            System.out.println();
        }

        System.out.println("--- MISIONES DE SATELITE (" + numSatelites + ") ---");
        if (numSatelites == 0) {
            System.out.println("  Sin misiones registradas.");
        }
        for (int i = 0; i < numSatelites; i++) {
            satelites[i].mostrarInformacion();
            System.out.println();
        }

        System.out.println("--- MISIONES TRIPULADAS (" + numTripuladas + ") ---");
        if (numTripuladas == 0) {
            System.out.println("  Sin misiones registradas.");
        }
        for (int i = 0; i < numTripuladas; i++) {
            tripuladas[i].mostrarInformacion();
            System.out.println();
        }
    }

    private void filtrarPresupuesto() {
        System.out.println("Dime el umbral a partir del presupuesto: ");
        int umbral = sc.nextInt();
        System.out.println("--- MISIONES DE EXPLORACION (" + numExploraciones + ") ---");
        if (numExploraciones == 0) {
            System.out.println("  Sin misiones registradas.");
        }
        for (int i = 0; i < numExploraciones; i++) {
            if (exploraciones[i].getPresupuestoAsignado() > umbral) {
                exploraciones[i].mostrarInformacion();
                System.out.println();
            }

        }

        System.out.println("--- MISIONES DE SATELITE (" + numSatelites + ") ---");
        if (numSatelites == 0) {
            System.out.println("  Sin misiones registradas.");
        }
        for (int i = 0; i < numSatelites; i++) {
            if (satelites[i].getPresupuestoAsignado() > umbral) {
                satelites[i].mostrarInformacion();
                System.out.println();
            }
        }

        System.out.println("--- MISIONES TRIPULADAS (" + numTripuladas + ") ---");
        if (numTripuladas == 0) {
            System.out.println("  Sin misiones registradas.");
        }
        for (int i = 0; i < numTripuladas; i++) {
            if (tripuladas[i].getPresupuestoAsignado() > umbral) {
                tripuladas[i].mostrarInformacion();
                System.out.println();
            }
        }
    }

    private void duracionMedia() {
        double suma = 0;
        for (int i = 0; i < numExploraciones; i++) {
            suma += exploraciones[i].getDuracionEstimada();
        }
        for (int i = 0; i < numSatelites; i++) {
            suma += satelites[i].getDuracionEstimada();
            System.out.println();
        }
        for (int i = 0; i < numTripuladas; i++) {
            suma += tripuladas[i].getDuracionEstimada();
            System.out.println();
        }
        System.out.printf("La media de duracion es:  %.2f %n" , suma / (numExploraciones + numSatelites + numTripuladas));
    }

    private void conteoPorTipo() {
        System.out.println("Exploracion : " + numExploraciones + " / " + CAPACIDAD
                + "  (libres: " + (CAPACIDAD - numExploraciones) + ")");
        System.out.println("Satelite    : " + numSatelites + " / " + CAPACIDAD
                + "  (libres: " + (CAPACIDAD - numSatelites) + ")");
        System.out.println("Tripulada   : " + numTripuladas + " / " + CAPACIDAD
                + "  (libres: " + (CAPACIDAD - numTripuladas) + ")");
        System.out.println("TOTAL       : "
                + (numExploraciones + numSatelites + numTripuladas)
                + " / " + (CAPACIDAD * 3));
    }

    private void misionPorNombre() {
        System.out.println("Dime el nombre de la mision: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < numExploraciones; i++) {
            if (exploraciones[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Tipo: Exploracion");
                exploraciones[i].mostrarInformacion();
                return;
            }
        }
        for (int i = 0; i < numSatelites; i++) {
            if (satelites[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Tipo: Satelite");
                satelites[i].mostrarInformacion();
                return;
            }
        }
        for (int i = 0; i < numTripuladas; i++) {
            if (tripuladas[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Tipo: Tripulada");
                tripuladas[i].mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontro ninguna mision con el nombre: " + nombre);
    }

    private void insertarNuevaMision() {
        System.out.println("Tipos: 1-Exploracion  2-Satelite  3-Tripulada");
        System.out.print("Tipo: ");
        int tipo = sc.nextInt();
        sc.nextLine();

        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo no valido.");
            return;
        }

        if (tipo == 1 && !hayEspacioExploracion()) {
            System.out.println("Capacidad maxima alcanzada para exploracion (6/6).");
            return;
        }
        if (tipo == 2 && !hayEspacioSatelite()) {
            System.out.println("Capacidad maxima alcanzada para satelite (6/6).");
            return;
        }
        if (tipo == 3 && !hayEspacioTripulada()) {
            System.out.println("Capacidad maxima alcanzada para tripuladas (6/6).");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Duracion (dias): ");
        int duracion = sc.nextInt();
        sc.nextLine();

        System.out.print("Presupuesto (M€): ");
        int presupuesto = sc.nextInt();
        sc.nextLine();

        if (tipo == 1) {
            System.out.print("Destino: ");
            String destino = sc.nextLine().trim();
            MisionExploracion mision = new MisionExploracion(destino, nombre, duracion, 450.0);
            insertarExploracion(mision);
            System.out.println("Mision de exploracion registrada.");

        } else if (tipo == 2) {
            System.out.print("Tipo de orbita: ");
            String orbita = sc.nextLine().trim();
            insertarSatelite(new MisionSatelite(orbita, nombre, duracion, presupuesto));
            System.out.println("Mision de satelite registrada.");

        } else {
            System.out.print("Numero de astronautas: ");
            int astronautas = sc.nextInt();
            sc.nextLine();
            insertarTripulada(new MisionTripulada(astronautas, nombre, duracion, presupuesto));
            System.out.println("Mision tripulada registrada.");
        }
    }

    private void cargarDatosEjemplo() {
        insertarExploracion(new MisionExploracion("Marte", "Hermes I", 730, 450.0));
        insertarExploracion(new MisionExploracion("Europa", "Europa Probe", 1825, 620.5));

        insertarSatelite(new MisionSatelite("Geoestacionaria", "Helios-Comm 1", 365, 85));
        insertarSatelite(new MisionSatelite("Polar", "HelioScan-Polar", 180, 120));

        insertarTripulada(new MisionTripulada(4, "Aurora I", 90, 310));
        insertarTripulada(new MisionTripulada(3, "Nexus Lab", 45, 275));

        System.out.println("6 misiones de ejemplo cargadas.");
    }

    private boolean insertarExploracion(MisionExploracion m) {
        if (numExploraciones >= CAPACIDAD) {
            return false;
        }
        exploraciones[numExploraciones] = m;
        numExploraciones++;
        return true;
    }

    private boolean insertarSatelite(MisionSatelite m) {
        if (numSatelites >= CAPACIDAD) {
            return false;
        }
        satelites[numSatelites] = m;
        numSatelites++;
        return true;
    }

    private boolean insertarTripulada(MisionTripulada m) {
        if (numTripuladas >= CAPACIDAD) {
            return false;
        }
        tripuladas[numTripuladas] = m;
        numTripuladas++;
        return true;
    }

    private boolean hayEspacioExploracion() {
        return numExploraciones < CAPACIDAD;
    }

    private boolean hayEspacioSatelite() {
        return numSatelites < CAPACIDAD;
    }

    private boolean hayEspacioTripulada() {
        return numTripuladas < CAPACIDAD;
    }

}
