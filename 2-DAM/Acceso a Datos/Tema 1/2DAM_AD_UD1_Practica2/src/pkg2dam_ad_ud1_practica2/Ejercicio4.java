/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud1_practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio4 {

    private static final String RUTA_FICHERO = "datos.txt";
    private static Scanner sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            sc = new Scanner(System.in);
            do {
                mostrarMenu();
                int opcion = pedirEntero(sc, "Dime una opcion: ");
                if (opcion == 5) {
                    break;
                }
                funcionalidadMenu(opcion);
            } while (true);

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public static void mostrarMenu() {
        // 
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("1. Mostrar todos los usuarios");
        System.out.println("2. Solo N primeros");
        System.out.println("3. Buscar por DNI");
        System.out.println("4. Registrar una persona");
        System.out.println("5. Salir");
        System.out.println("=========================================");
        System.out.println("");
    }

    public static void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 -> {
                mostrarTodoContenidoFichero();
            }
            case 2 -> {
                int numero = pedirEntero(sc, "Dime cuantas personas vas a ver: ");
                mostrarDatosPorNumero(numero);
            }
            case 3 -> {
                String dni = pedirCadena(sc, "Dime el DNI de la persona a buscar: ");
                mostrarDatosPorNumero(dni);
            }
            case 4 -> {
                registrarDatosUsuario(sc);
            }
            case 5 -> {
                System.out.println("Cerrando el programa... ");
            }
        }
    }

    public static boolean existeDNI(String dni) {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(dni)) {
                    return true;
                }
            }

        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el lector: " + e.getMessage());
                }
            }
        }
        return false;
    }

    private static void registrarDatosUsuario(Scanner sc) {
        String dni = "";
        do {

            dni = pedirCadena(sc, "Dime el DNI: ");
            if (existeDNI(dni)) {
                System.out.println("El DNI esta repetido.");
            }

        } while (existeDNI(dni));

        String nombre = pedirCadena(sc, "Dime el nombre: ");
        String apellidos = pedirCadena(sc, "Dime los apellidos: ");
        String fechaNacimiento = pedirCadena(sc, "Dime la fecha de nacimiento: ");
        int telefono = pedirEntero(sc, "Dime el teléfono: ");

        Persona persona = new Persona(dni, nombre, apellidos, fechaNacimiento, telefono);

        escribirFichero(persona);

    }

    public static void mostrarDatosPorNumero(int numeroPersonas) {
        System.out.println("\n--- Contenido del fichero de  " + numeroPersonas + " personas ---");
        int contadorPersonas = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                // Si igual el numero de personas y el contador de lineas se para el while
                if (numeroPersonas == contadorPersonas) {
                    break;
                }
                // Se aumenta en uno por cada linea 
                contadorPersonas++;
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el lector: " + e.getMessage());
                }
            }
        }
    }

    public static void mostrarDatosPorNumero(String dni) {
        System.out.println("\n--- Contenido del fichero con el DNI  " + dni + " personas ---");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                // Si en la linea contiene el dni se ve  
                if (linea.contains(dni)) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el lector: " + e.getMessage());
                }
            }
        }
    }

    private static String pedirCadena(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }

    private static int pedirEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer tras nextInt
                return valor;
            } catch (InputMismatchException e) {
                System.err.println("Error: Introduce un número entero válido.");
                sc.nextLine(); // Limpiar la entrada incorrecta
            }
        }
    }

    public static void escribirFichero(Persona persona) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(RUTA_FICHERO, true));
            bw.write(persona.toLineaFichero());
            bw.newLine();

        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el escritor: " + e.getMessage());
                }
            }
        }
    }

    public static void mostrarTodoContenidoFichero() {
        System.out.println("\n--- Contenido del fichero ---");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                System.out.println("");
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el lector: " + e.getMessage());
                }
            }
        }
    }

}

class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private int telefono;

    public Persona(String dni, String nombre, String apellidos, String fechaNacimiento, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public String toLineaFichero() {
        return String.format("DNI: %s | Nombre: %s | Apellidos: %s | Fecha Nacimiento: %s | Tel: %d",
                dni, nombre, apellidos, fechaNacimiento, telefono);
    }
}
