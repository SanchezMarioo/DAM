package sanchez_perez_2dam_ad_ud1_practica03;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    // Nombres de los ficheros binarios
    private static final String FICHERO_VUELOS = "vuelos.dat";
    private static final String FICHERO_HOTELES = "hoteles.dat";
    private static final String FICHERO_PAQUETES = "paquetes.dat";

    // Listas en memoria
    private static ArrayList<Vuelo> vuelos;
    private static ArrayList<Hotel> hoteles;
    private static ArrayList<PaqueteViaje> paquetes;

    public static void main(String[] args) {
        // Cargar datos existentes desde los ficheros binarios
        vuelos = leerTodos(FICHERO_VUELOS);
        hoteles = leerTodos(FICHERO_HOTELES);
        paquetes = leerTodos(FICHERO_PAQUETES);

        int opcion;
        do {
            System.out.println("\n=== MILVIAJES SALAMANCA ===");
            System.out.println("1. Gestionar Vuelos");
            System.out.println("2. Gestionar Hoteles");
            System.out.println("3. Gestionar Paquetes de Viajes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = leerEntero();

            switch (opcion) {
                case 1 -> menuVuelos();
                case 2 -> menuHoteles();
                case 3 -> menuPaquetes();
                case 0 -> System.out.println("¡Hasta pronto!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    // ==========================================
    // 1. GESTIÓN DE VUELOS
    // ==========================================
    private static void menuVuelos() {
        int op;
        do {
            System.out.println("\n--- GESTIÓN DE VUELOS ---");
            System.out.println("1. Listar vuelos");
            System.out.println("2. Introducir vuelo");
            System.out.println("3. Modificar vuelo");
            System.out.println("4. Borrar vuelo");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = leerEntero();

            switch (op) {
                case 1 -> listarVuelos();
                case 2 -> crearVuelo();
                case 3 -> modificarVuelo();
                case 4 -> borrarVuelo();
            }
        } while (op != 0);
    }

    private static void listarVuelos() {
        if (vuelos.isEmpty()) {
            System.out.println("No hay vuelos registrados.");
            return;
        }
        for (int i = 0; i < vuelos.size(); i++) {
            System.out.println("[" + i + "] " + vuelos.get(i));
        }
    }

    private static void crearVuelo() {
        System.out.print("Numero de vuelo: ");
        String paqueteVuelo = sc.nextLine();
        System.out.print("Compañía aérea: ");
        String comp = sc.nextLine();
        System.out.print("Origen: ");
        String orig = sc.nextLine();
        System.out.print("Destino: ");
        String dest = sc.nextLine();
        System.out.print("Precio: ");
        double precio = leerDouble();

        vuelos.add(new Vuelo(paqueteVuelo, comp, orig, dest, precio));
        escribirSobreescribiendo(FICHERO_VUELOS, vuelos);
        System.out.println("Vuelo guardado correctamente.");
    }

    private static void modificarVuelo() {
        listarVuelos();
        if (vuelos.isEmpty()) {
            return;
        }
        System.out.print("Índice del vuelo a modificar: ");
        int idx = leerEntero();
        if (idx < 0 || idx >= vuelos.size()) {
            System.out.println("Índice incorrecto.");
            return;
        }
        System.out.print("Nueva compañía: ");
        String comp = sc.nextLine();
        System.out.print("Nuevo origen: ");
        String orig = sc.nextLine();
        System.out.print("Nuevo destino: ");
        String dest = sc.nextLine();
        System.out.print("Nuevo precio: ");
        double precio = leerDouble();

        Vuelo v = vuelos.get(idx);
        v.setCompañiaAerea(comp);
        v.setOrigenVuelo(orig);
        v.setDestinoVuelo(dest);
        v.setPrecio(precio);

        escribirSobreescribiendo(FICHERO_VUELOS, vuelos);
        System.out.println("Vuelo actualizado.");
    }

    private static void borrarVuelo() {
        listarVuelos();
        if (vuelos.isEmpty()) {
            return;
        }
        System.out.print("Índice del vuelo a borrar: ");
        int idx = leerEntero();
        if (idx >= 0 && idx < vuelos.size()) {
            vuelos.remove(idx);
            escribirSobreescribiendo(FICHERO_VUELOS, vuelos);
            System.out.println("Vuelo eliminado.");
        } else {
            System.out.println("Índice no válido.");
        }
    }
    private static void menuHoteles() {
        int op;
        do {
            System.out.println("\n--- GESTIÓN DE HOTELES ---");
            System.out.println("1. Listar hoteles");
            System.out.println("2. Introducir hotel");
            System.out.println("3. Modificar hotel");
            System.out.println("4. Borrar hotel");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = leerEntero();

            switch (op) {
                case 1 -> listarHoteles();
                case 2 -> crearHotel();
                case 3 -> modificarHotel();
                case 4 -> borrarHotel();
            }
        } while (op != 0);
    }

    private static void listarHoteles() {
        if (hoteles.isEmpty()) {
            System.out.println("No hay hoteles registrados.");
            return;
        }
        for (int i = 0; i < hoteles.size(); i++) {
            System.out.println("[" + i + "] " + hoteles.get(i));
        }
    }

    private static void crearHotel() {
        System.out.println("ID del hotel: ");
        String id = sc.nextLine();
        System.out.print("Nombre del hotel: ");
        String nom = sc.nextLine();
        System.out.print("Descripción: ");
        String desc = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciu = sc.nextLine();
        System.out.print("Precio por noche: ");
        double precio = leerDouble();

        hoteles.add(new Hotel(id, nom, desc, ciu, precio));
        escribirSobreescribiendo(FICHERO_HOTELES, hoteles);
        System.out.println("Hotel guardado correctamente.");
    }

    private static void modificarHotel() {
        listarHoteles();
        if (hoteles.isEmpty()) {
            return;
        }
        System.out.print("Índice del hotel a modificar: ");
        int idx = leerEntero();
        if (idx < 0 || idx >= hoteles.size()) {
            System.out.println("Índice incorrecto.");
            return;
        }
        System.out.print("Nuevo nombre: ");
        String nom = sc.nextLine();
        System.out.print("Nueva descripción: ");
        String desc = sc.nextLine();
        System.out.print("Nueva ciudad: ");
        String ciu = sc.nextLine();
        System.out.print("Nuevo precio por noche: ");
        double precio = leerDouble();

        Hotel h = hoteles.get(idx);
        h.setNombre(nom);
        h.setDescripcion(desc);
        h.setCiudad(ciu);
        h.setPrecioNoche(precio);

        escribirSobreescribiendo(FICHERO_HOTELES, hoteles);
        System.out.println("Hotel actualizado.");
    }

    private static void borrarHotel() {
        listarHoteles();
        if (hoteles.isEmpty()) {
            return;
        }
        System.out.print("Índice del hotel a borrar: ");
        int idx = leerEntero();
        if (idx >= 0 && idx < hoteles.size()) {
            hoteles.remove(idx);
            escribirSobreescribiendo(FICHERO_HOTELES, hoteles);
            System.out.println("Hotel eliminado.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    private static void menuPaquetes() {
        int op;
        do {
            System.out.println("\n--- GESTIÓN DE PAQUETES DE VIAJES ---");
            System.out.println("1. Listar paquetes (con días y precio total)");
            System.out.println("2. Introducir paquete");
            System.out.println("3. Modificar paquete");
            System.out.println("4. Borrar paquete");
            System.out.println("0. Volver");
            System.out.print("Opción: ");
            op = leerEntero();

            switch (op) {
                case 1 -> listarPaquetes();
                case 2 -> crearPaquete();
                case 3 -> modificarPaquete();
                case 4 -> borrarPaquete();
            }
        } while (op != 0);
    }

    private static void listarPaquetes() {
        if (paquetes.isEmpty()) {
            System.out.println("No hay paquetes creados.");
            return;
        }
        for (int i = 0; i < paquetes.size(); i++) {
            System.out.println("[" + i + "]\n" + paquetes.get(i));
        }
    }

    private static void crearPaquete() {
        if (vuelos.size() < 2 || hoteles.isEmpty()) {
            System.out.println("Error: Necesitas tener al menos 2 vuelos y 1 hotel registrados.");
            return;
        }
        System.out.println("Dime el ID: ");
        int id = sc.nextInt();
        System.out.print("Nombre del paquete: ");
        String nom = sc.nextLine();

        LocalDate inicio, fin;
        while (true) {
            try {
                System.out.print("Fecha de inicio (dd/MM/yyyy): ");
                inicio = LocalDate.parse(sc.nextLine(), PaqueteViaje.getFORMATO());
                System.out.print("Fecha de fin (dd/MM/yyyy): ");
                fin = LocalDate.parse(sc.nextLine(), PaqueteViaje.getFORMATO());

                if (inicio.isBefore(fin)) {
                    break;
                }
                System.out.println("Error: La fecha de inicio debe ser estrictamente anterior a la de fin.");
            } catch (Exception e) {
                System.out.println("Formato de fecha inválido. Usa dd/MM/yyyy.");
            }
        }

        System.out.println("\nSelecciona vuelo de IDA:");
        listarVuelos();
        Vuelo ida = vuelos.get(leerIndiceValido(vuelos.size()));

        System.out.println("\nSelecciona vuelo de VUELTA:");
        listarVuelos();
        Vuelo vuelta = vuelos.get(leerIndiceValido(vuelos.size()));

        System.out.println("\nSelecciona HOTEL:");
        listarHoteles();
        Hotel hotel = hoteles.get(leerIndiceValido(hoteles.size()));
        paquetes.add(new PaqueteViaje(id,nom, inicio, fin, ida, vuelta, hotel));
        escribirSobreescribiendo(FICHERO_PAQUETES, paquetes);
        System.out.println("Paquete guardado con éxito.");
    }

    private static void modificarPaquete() {
        listarPaquetes();
        if (paquetes.isEmpty()) {
            return;
        }
        System.out.print("Índice del paquete a modificar: ");
        int idx = leerEntero();
        if (idx < 0 || idx >= paquetes.size()) {
            System.out.println("Índice incorrecto.");
            return;
        }

        System.out.print("Nuevo nombre del paquete: ");
        String nom = sc.nextLine();

        LocalDate inicio, fin;
        while (true) {
            try {
                System.out.print("Nueva fecha de inicio (dd/MM/yyyy): ");
                inicio = LocalDate.parse(sc.nextLine(), PaqueteViaje.getFORMATO());
                System.out.print("Nueva fecha de fin (dd/MM/yyyy): ");
                fin = LocalDate.parse(sc.nextLine(), PaqueteViaje.getFORMATO());

                if (inicio.isBefore(fin)) {
                    break;
                }
                System.out.println("Error: La fecha de inicio debe ser anterior a la de fin.");
            } catch (Exception e) {
                System.out.println("Formato inválido. Usa dd/MM/yyyy.");
            }
        }

        System.out.println("\nSelecciona nuevo vuelo de IDA:");
        listarVuelos();
        Vuelo ida = vuelos.get(leerIndiceValido(vuelos.size()));

        System.out.println("\nSelecciona nuevo vuelo de VUELTA:");
        listarVuelos();
        Vuelo vuelta = vuelos.get(leerIndiceValido(vuelos.size()));

        System.out.println("\nSelecciona nuevo HOTEL:");
        listarHoteles();
        Hotel hotel = hoteles.get(leerIndiceValido(hoteles.size()));

        PaqueteViaje p = paquetes.get(idx);
        p.setNombre(nom);
        p.setFechaInicio(inicio);
        p.setFechaFinal(fin);
        p.setVueloIda(ida);
        p.setVueloVuelta(vuelta);
        p.setHotel(hotel);

        escribirSobreescribiendo(FICHERO_PAQUETES, paquetes);
        System.out.println("Paquete actualizado.");
    }

    private static void borrarPaquete() {
        listarPaquetes();
        if (paquetes.isEmpty()) {
            return;
        }
        System.out.print("Índice del paquete a borrar: ");
        int idx = leerEntero();
        if (idx >= 0 && idx < paquetes.size()) {
            paquetes.remove(idx);
            escribirSobreescribiendo(FICHERO_PAQUETES, paquetes);
            System.out.println("Paquete eliminado.");
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public static <T> void escribirSobreescribiendo(String ruta, ArrayList<T> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta, false))) {
            for (T obj : lista) {
                oos.writeObject(obj);
            }
        } catch (IOException e) {
            System.out.println("Error al sobreescribir " + ruta + ": " + e.getMessage());
        }
    }

    public static void aniadirObjeto(String ruta, Object objeto) {
        File file = new File(ruta);
        boolean existe = file.exists() && file.length() > 0;

        try {
            if (!existe) {
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, true))) {
                    oos.writeObject(objeto);
                }
            } else {
                try (MyObjectOutputStream moos = new MyObjectOutputStream(new FileOutputStream(file, true))) {
                    moos.writeObject(objeto);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al añadir en " + ruta + ": " + e.getMessage());
        }
    }

   
    public static <T> ArrayList<T> leerTodos(String ruta) {
        ArrayList<T> lista = new ArrayList<>();
        File file = new File(ruta);

        if (!file.exists()) {
            return lista;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    T obj = (T) ois.readObject();
                    lista.add(obj);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Aviso al leer " + ruta + ": " + e.getMessage());
        }

        return lista;
    }

    private static int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Introduce un número entero válido: ");
            }
        }
    }

    private static double leerDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.print("Introduce un número decimal válido: ");
            }
        }
    }

    private static int leerIndiceValido(int max) {
        while (true) {
            System.out.print("Elige índice (0 a " + (max - 1) + "): ");
            int idx = leerEntero();
            if (idx >= 0 && idx < max) {
                return idx;
            }
            System.out.println("Índice fuera de rango.");
        }
    }
}