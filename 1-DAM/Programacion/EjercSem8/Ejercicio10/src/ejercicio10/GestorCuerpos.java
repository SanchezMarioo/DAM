/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author MARIO
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorCuerpos {

    private ArrayList<Astro> catalogo;
    private Scanner scanner;

    public GestorAgencia() {
        this.catalogo = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        inicializarDatos();
    }

    private void inicializarDatos() {
        Planeta tierra = new Planeta("Tierra", 5.97224, 12742, 1, 365.25, 149600000);
        Satelite luna = new Satelite("Luna", 7.3422, 3474, 27.3, 27.3, 384400, tierra);
        tierra.agregarSatelite(luna);

        Planeta marte = new Planeta("Marte", 6.39e23, 6779, 1.03, 687, 227900000);
        Satelite fobos = new Satelite("Fobos", 1.06e16, 22.4, 0.31, 0.31, 9376, marte);
        marte.agregarSatelite(fobos);

        // Volvemos a AGRUPAR todos los astros de prueba
        catalogo.add(tierra);
        catalogo.add(luna);
        catalogo.add(marte);
        catalogo.add(fobos);
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();

            // Lectura directa de un entero
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después del número

            switch (opcion) {
                case 1:
                    mostrarAstrosDisponibles();
                    break;
                case 2:
                    consultarDetalleAstro();
                    break;
                case 3:
                    añadirNuevoPlaneta();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Cerrando el sistema de la Agencia Espacial...");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }
    }

    private void mostrarMenu() {
        System.out.println("\n=== MENÚ AGENCIA ESPACIAL ===");
        System.out.println("1. Visualizar astros disponibles");
        System.out.println("2. Consultar detalle de un astro");
        System.out.println("3. Añadir nuevo planeta");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private void mostrarAstrosDisponibles() {
        System.out.println("\n--- LISTA DE ASTROS ---");
        for (Astro astro : catalogo) {
            String tipo = (astro instanceof Planeta) ? "Planeta" : "Satélite";
            System.out.println("- " + astro.getNombre() + " (" + tipo + ")");
        }
    }

    private void consultarDetalleAstro() {
        System.out.print("\nIntroduce el nombre del astro a consultar: ");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (Astro astro : catalogo) {
            if (astro.getNombre().equalsIgnoreCase(nombre)) {
                astro.mostrarInformacion();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Astro no encontrado en el sistema.");
        }
    }

    private void añadirNuevoPlaneta() {
        System.out.println("\n--- AÑADIR NUEVO PLANETA ---");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        // Lectura directa de decimales usando nextDouble()
        System.out.print("Masa (kg): ");
        double masa = scanner.nextDouble();

        System.out.print("Diámetro medio (km): ");
        double diametro = scanner.nextDouble();

        System.out.print("Período de rotación (días): ");
        double rotacion = scanner.nextDouble();

        System.out.print("Período de traslación (días): ");
        double traslacion = scanner.nextDouble();

        System.out.print("Distancia media al Sol (km): ");
        double distancia = scanner.nextDouble();

        // Limpiar el buffer de memoria después de leer el último número
        scanner.nextLine();

        Planeta nuevoPlaneta = new Planeta(nombre, masa, diametro, rotacion, traslacion, distancia);

        // La lógica para AGRUPAR añade el nuevo planeta al catálogo global
        catalogo.add(nuevoPlaneta);
        System.out.println("¡Planeta añadido con éxito!");
    }
}
