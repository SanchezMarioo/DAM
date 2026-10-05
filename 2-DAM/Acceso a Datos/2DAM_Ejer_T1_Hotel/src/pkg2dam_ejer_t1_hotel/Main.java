package pkg2dam_ejer_t1_hotel;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static File archivo = new File("datos/hoteles.dat");

    public static void main(String[] args) {

        prepararArchivo(archivo);
        do {
            mostrarMenu();
            int opcion = pedirEntero("Escoge una opcion: ");
            funcionalidadMenu(opcion);
        } while (true);
    }

    static void mostrarMenu() {
        System.out.println("1. Añadir hotel");
        System.out.println("2. Modificar hotel");
        System.out.println("3. Borrar hotel");
        System.out.println("4. Listar hoteles");
    }

    static void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 ->
                añadirHotel();
            case 2 ->
                modificarHotel();
            case 3 ->
                eliminarHoteles();
            case 4 ->
                listarHoteles(archivo);
            default ->
                System.out.println("Escoge una opcion valida");
        }
    }

    static String pedirCadena(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    static int pedirEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int valor = sc.nextInt();
                sc.nextLine(); // Limpia el salto de línea sobrante del búfer
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número entero válido.");
                sc.nextLine(); // Descarta la entrada incorrecta para evitar un bucle infinito
            }
        }
    }

    static double pedirDecimal(String msg) {
        while (true) {
            try {
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Introduzce un numero decimal valido");
                sc.nextLine();
            }
        }

    }

    static void prepararArchivo(File archivo) {
        File directorio = archivo.getParentFile();
        // Comprobar primero que el directorio no sea null antes de invocar métodos sobre él
        if (directorio != null && !directorio.exists()) {
            directorio.mkdirs();
        }
    }

    static void escribirHoteles(Hotel hotel, File archivo) {
        // Control de cabecera: Si el archivo no existe o está vacío, usa ObjectOutputStream.
        // Si ya tiene datos previos, usa MyObjectOutputStream para no corromper el stream.
        boolean existeConDatos = archivo.exists() && archivo.length() > 0;

        try {
            if (!existeConDatos) {
                try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(archivo, true))) {
                    ous.writeObject(hotel);
                }
            } else {
                try (MyObjectOutputStream mous = new MyObjectOutputStream(new FileOutputStream(archivo, true))) {
                    mous.writeObject(hotel);
                }
            }
        } catch (IOException ex) {
            System.err.println("Error al escribir en el fichero: " + ex.getMessage());
        }
    }

    static void listarHoteles(File f) {
        if (!f.exists() || f.length() == 0) {
            System.out.println("El fichero no existe o está vacío.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            while (true) {
                try {
                    Hotel h = (Hotel) ois.readObject();
                    System.out.println(h);
                } catch (ClassCastException e) {
                    System.err.println("Error de casteo de clase: " + e.getMessage());
                }
            }
        } catch (EOFException e) {
            // Fin natural del fichero alcanzado
            System.out.println("--- Fin de lectura del fichero ---");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error durante la lectura: " + e.getMessage());
        }
    }

    private static void añadirHotel() {
        String nombre = pedirCadena("Dime el nombre del hotel: ");
        String descripcion = pedirCadena("Dime la descripcion del hotel: ");
        String ciudad = pedirCadena("Dime la ciudad del hotel: ");
        double precioNoche = pedirDecimal("Dime el precio de la noche: ");
        escribirHoteles(new Hotel(nombre, descripcion, ciudad, precioNoche), archivo);
    }

    private static void modificarHotel() {
        ArrayList<Hotel> hoteles = leerHoteles(archivo);
        String nombreHotel = pedirCadena("Dime el nombre del hotel a modificar: ");
        for (Hotel hotel : hoteles) {
            
            if (hotel.getNombre().equalsIgnoreCase(nombreHotel)) {
                String descripcion = pedirCadena("Dime la descripcion a cambiar: ");
                hotel.setDescripcion(descripcion);
                String ciudad = pedirCadena("Dime la ciudad del hotel: ");
                hotel.setCiudad(ciudad);
                double precioNoche = pedirDecimal("Dime el precio por noche: ");
                hotel.setPrecioNoche(precioNoche);
                System.out.println();
                sobreEscribirHoteles(hoteles);
                return;
            }
        }
        System.out.println("No se encontro el hotel que buscabas");
    }

    static void eliminarHoteles() {
        ArrayList<Hotel> hoteles = leerHoteles(archivo);
        String nombreHotel = pedirCadena("Dime el nombre del hotel a eliminar: ");
        for (Hotel hotel : hoteles) {
            
            if (hotel.getNombre().equalsIgnoreCase(nombreHotel)) {
                hoteles.remove(hotel);
               
                sobreEscribirHoteles(hoteles);
                System.out.println("Se ha borrado el " + nombreHotel + " con exito.");
                return;
            }
        }
        System.out.println("No se encontro el hotel.");
    }

    static void sobreEscribirHoteles(ArrayList<Hotel> lista) {
        try (ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(archivo))) {
            for (Hotel hotel : lista) {
                ous.writeObject(hotel);
            }
        } catch (IOException ex) {
            System.err.println("Error al escribir en el fichero: " + ex.getMessage());
        }
    }

    static ArrayList<Hotel> leerHoteles(File f) {
        ArrayList<Hotel> hoteles = new ArrayList<>();
        if (!f.exists() || f.length() == 0) {
            System.out.println("El fichero no existe o está vacío.");

        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
                while (true) {
                    try {
                        Hotel h = (Hotel) ois.readObject();
                        hoteles.add(h);
                        
                    } catch (ClassCastException e) {
                        System.err.println("Error de casteo de clase: " + e.getMessage());
                    }
                }
            } catch (EOFException e) {
                // Fin natural del fichero alcanzado
                System.out.println("--- Fin de lectura del fichero ---");
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error durante la lectura: " + e.getMessage());
            }
        }
        return hoteles;

    }
}
