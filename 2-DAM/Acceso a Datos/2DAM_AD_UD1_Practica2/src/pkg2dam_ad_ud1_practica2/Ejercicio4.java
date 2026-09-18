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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            registrarDatosUsuario(sc);
            mostrarContenidoFichero();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
    private static vo
    private static void registrarDatosUsuario(Scanner sc) {
        String dni = pedirCadena(sc, "Dime el DNI: ");
        escribirFichero("DNI: " + dni);

        String nombre = pedirCadena(sc, "Dime el nombre: ");
        escribirFichero("Nombre: " + nombre);

        String apellidos = pedirCadena(sc, "Dime los apellidos: ");
        escribirFichero("Apellidos: " + apellidos);

        String fechaNacimiento = pedirCadena(sc, "Dime la fecha de nacimiento: ");
        escribirFichero("Fecha de nacimiento: " + fechaNacimiento);

        int telefono = pedirEntero(sc, "Dime el teléfono: ");
        escribirFichero("Teléfono: " + telefono);
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

    public static void escribirFichero(String texto) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(RUTA_FICHERO, true));
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        } finally {
            cerrarRecurso(bw);
        }
    }

    public static void mostrarContenidoFichero() {
        System.out.println("\n--- Contenido del fichero ---");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA_FICHERO));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        } finally {
            cerrarRecurso(br);
        }
    }

    private static void cerrarRecurso(AutoCloseable recurso) {
        if (recurso != null) {
            try {
                recurso.close();
            } catch (Exception e) {
                System.err.println("Error al cerrar el flujo: " + e.getMessage());
            }
        }
    }
}
