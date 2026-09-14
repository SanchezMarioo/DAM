package ejercicio6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Mario
 */
public class GestionSatelital {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Satelite> satelites;
    private final int NUM_SATELITES_DEFECTO = 7;

    public GestionSatelital() {
        satelites = new ArrayList<>();
        generarSatelitesAleatorios();

    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- GESTION SATELITES ---");
            System.out.println("1. Mostrar satelites activos");
            System.out.println("2. Mostrar satelites por debajo de un porcentaje");
            System.out.println("3. Media de la velocidad orbital");
            System.out.println("4. Minimo de energia restante");
            System.out.println("5. Ver si existe un satelite cuya orbita esta por debajo de 300 km");
            System.out.println("6. Añadir satelite");
            System.out.println("7. Eliminar satelite");
            System.out.println("8. Buscar satelite");
            System.out.println("9. Informe global");
            System.out.println("10. Ver todos los satelites");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 ->
                    mostrarSatelitesActivos();

                case 2 ->
                    mostrarSatelitesPorDebajo();

                case 3 ->
                    mostrarVelocidadMedia();

                case 4 ->
                    System.out.println("Mínimo de energía restante: "
                            + sateliteMenosEnergia().getPorcentajeEnergia() + "%");

                case 5 ->
                    System.out.println("Existe un satelite por debajo de 300km: "
                            + comprobarOrbitaBaja());

                case 6 ->
                    añadirNuevoSatelite();

                case 7 ->
                    eliminarSateliteId();

                case 8 ->
                    buscarSateliteConcreto();

                case 9 ->
                    informeGlobal();
                case 10 -> 
                    verSatelites();

                case 0 ->
                    System.out.println("Saliendo del módulo de gestión...");

                default ->
                    System.out.println("Error: Opción no válida.");
            }
        } while (opcion != 0);
    }

    private void generarSatelitesAleatorios() {
        Random random = new Random();
        String[] prefijos = {"SAT", "ORB", "GEO", "LEO", "MEO", "POL", "SUN"};

        for (int i = 0; i < NUM_SATELITES_DEFECTO; i++) {
            String id = prefijos[i] + "-" + randomEntre(100, 999);
            int altura = random.nextInt(300, 35000);
            double velocidad = randomEntre(1000, 30000);
            boolean activo = random.nextBoolean();
            int bateria = randomEntre(0, 100);

            satelites.add(new Satelite(id, altura, velocidad, activo, bateria));
        }
    }

    private int randomEntre(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private void mostrarSatelitesActivos() {
        for (Satelite satelite : satelites) {
            if (satelite.isEstaActivo()) {
                System.out.println(satelite);
            }
        }

    }

    private void mostrarSatelitesPorDebajo() {
        int bateria = sc.nextInt();
        for (Satelite satelite : satelites) {
            if (satelite.getPorcentajeEnergia() < bateria) {
                System.out.println(satelite);
            }
        }
    }

    private int calcularvelocidadMediaSatelites() {
        int suma = 0;
        for (Satelite satelite : satelites) {
            suma += satelite.getVelocidadOrbital();
        }
        return suma / satelites.size();
    }

    private Satelite sateliteMenosEnergia() {
        Satelite menosEnergia = satelites.get(0);
        for (Satelite satelite : satelites) {
            if (satelite.getPorcentajeEnergia() < menosEnergia.getPorcentajeEnergia()) {
                menosEnergia = satelite;
            }
        }
        return menosEnergia;
    }

    private void mostrarVelocidadMedia() {
        System.out.println("La velocidad media de los satelites es: " + calcularvelocidadMediaSatelites());
    }

    private void añadirNuevoSatelite() {
        System.out.println("ID: ");
        String id = sc.nextLine();
        System.out.println("Altura: ");
        int altura = sc.nextInt();
        System.out.println("Velocidad orbital (m/s): ");
        int velocidad = sc.nextInt();
        System.out.println("Esta activo?? (true/false): ");
        boolean estaActivo = sc.nextBoolean();
        System.out.println("Porcentaje de bateria: ");
        int porcentajeBateria = sc.nextInt();
        satelites.add(new Satelite(id, altura, velocidad, estaActivo, porcentajeBateria));
    }

    private void eliminarSateliteId() {
        String id = sc.nextLine();
        boolean encontrado = false;
        for (int i = 0; i < satelites.size(); i++) {
            if (satelites.get(i).getId().equalsIgnoreCase(id)) {
                satelites.remove(i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se ha encontrado ningun satelite con la " + id);
        } else {
            System.out.println("Se ha borrado correctamente.");
        }
        
    }

    private void buscarSateliteConcreto() {
        String id = sc.nextLine();
        for (Satelite satelite : satelites) {
            if (satelite.getId().equals(id)) {
                System.out.println(satelite);
            }
        }
    }

    private void informeGlobal() {
        System.out.println("=======INFORME GLOBAL==============");
        System.out.println("Numero total de satelites: " + satelites.size());
        System.out.println("Numero de satelites activos: " + contarSatelitesActivos());
        System.out.println("Energia media disponible: " + calcularEnergiaMedia());
        System.out.println("Satelite mas rapido: " + sateliteMasRapido().getVelocidadOrbital());
        System.out.println("Satelite mas cercano a la Tierra: " + sateliteMenosOrbita().getAltura());
    }

    private int contarSatelitesActivos() {
        int contador = 0;
        for (Satelite satelite : satelites) {
            if (satelite.isEstaActivo()) {
                contador++;
            }
        }
        return contador;
    }

    private int calcularEnergiaMedia() {
        int suma = 0;
        for (Satelite satelite : satelites) {
            suma += satelite.getPorcentajeEnergia();
        }
        return suma / satelites.size();
    }

    private Satelite sateliteMasRapido() {
        Satelite masRapido = satelites.get(0);

        for (Satelite satelite : satelites) {
            if (satelite.getVelocidadOrbital() > masRapido.getVelocidadOrbital()) {
                masRapido = satelite;
            }
        }
        return masRapido;
    }

    private Satelite sateliteMenosOrbita() {
        Satelite menosOrbita = satelites.get(0);

        for (Satelite satelite : satelites) {
            if (menosOrbita.getAltura() > satelite.getAltura()) {
                menosOrbita = satelite;
            }
        }
        return menosOrbita;
    }

    private boolean comprobarOrbitaBaja() {
        boolean estaPorDebajo = false;
        for (Satelite satelite : satelites) {
            if (satelite.getAltura() < 300) {
                estaPorDebajo = true;
            }
        }
        return estaPorDebajo;
    }

    private void verSatelites() {
        for (Satelite satelite : satelites) {
            System.out.println(satelite);
        }
    }

}
