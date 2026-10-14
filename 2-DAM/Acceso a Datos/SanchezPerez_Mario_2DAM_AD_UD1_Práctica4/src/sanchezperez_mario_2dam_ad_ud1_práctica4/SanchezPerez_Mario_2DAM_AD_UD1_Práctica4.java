/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchezperez_mario_2dam_ad_ud1_práctica4;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Importaciones DOM 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author mario.sanper.2
 */
public class SanchezPerez_Mario_2DAM_AD_UD1_Práctica4 {

    /**
     * @param args the command line arguments
     */
    private static final String NOMBRE_FICHERO = "empleados.dat";
    private static final int TAM_REGISTRO = (9 * 2) + (10 * 2) + (10 * 2) + 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- GESTIÓN DE EMPLEADOS (VENANCIO CORP) ---");
            System.out.println("1. Consulta de empleado");
            System.out.println("2. Inserción de empleado");
            System.out.println("3. Modificación de salario");
            System.out.println("4. Borrado lógico");
            System.out.println("5. Listado general");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> consultarEmpleado(sc);
                case 2 -> insertarEmpleado(sc);
                case 3 -> modificarSalario(sc);
                case 4 -> borradoLogico(sc);
                case 5 -> listarEmpleados();
                case 6 -> System.out.println("Saliendo de la aplicación...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
        sc.close();
    }

    private static void consultarEmpleado(Scanner scanner) {
        System.out.print("Introduzca el NIF del empleado a consultar (9 caracteres): ");
        String nifBuscado = scanner.nextLine();

        try (RandomAccessFile raf = new RandomAccessFile(NOMBRE_FICHERO, "r")) {
            boolean encontrado = false;
            while (raf.getFilePointer() < raf.length()) {
                String nif = leerString(raf, 9);
                String nombre = leerString(raf, 10);
                String apellidos = leerString(raf, 10);
                double salario = raf.readDouble();

                if (nif.equals(nifBuscado) && !nif.equals("-1")) {
                    System.out.println("\n--- EMPLEADO ENCONTRADO ---");
                    System.out.println("NIF: " + nif);
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Apellidos: " + apellidos);
                    System.out.println("Salario: " + salario);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("El empleado solicitado no existe.");
            }
        } catch (Exception e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    private static void insertarEmpleado(Scanner scanner) {
        System.out.print("Introduzca NIF (9 caracteres): ");
        String nif = scanner.nextLine();
        System.out.print("Introduzca Nombre (máx 10 caracteres): ");
        String nombre = scanner.nextLine();
        System.out.print("Introduzca Apellidos (máx 10 caracteres): ");
        String apellidos = scanner.nextLine();
        System.out.print("Introduzca Salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        try (RandomAccessFile raf = new RandomAccessFile(NOMBRE_FICHERO, "rw")) {
            // Comprobar si el NIF ya existe
            boolean existe = false;
            while (raf.getFilePointer() < raf.length()) {
                String nifActual = leerString(raf, 9);
                raf.skipBytes(20 + 20 + 8); // Saltar nombre, apellidos y salario

                if (nifActual.equals(nif) && !nifActual.equals("-1")) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("Error: El NIF ya existe en el sistema.");
            } else {
                // Ir al final del fichero para insertar
                raf.seek(raf.length());
                escribirRegistro(raf, nif, nombre, apellidos, salario);
                System.out.println("Empleado insertado correctamente.");
            }
        } catch (Exception e) {
            System.out.println("Error al insertar el empleado: " + e.getMessage());
        }
    }

    private static void modificarSalario(Scanner scanner) {
        System.out.print("Introduzca el NIF del empleado a modificar: ");
        String nifBuscado = scanner.nextLine();
        System.out.print("Introduzca el nuevo importe del salario: ");
        double nuevoSalario = scanner.nextDouble();
        scanner.nextLine();

        try (RandomAccessFile raf = new RandomAccessFile(NOMBRE_FICHERO, "rw")) {
            boolean modificado = false;
            while (raf.getFilePointer() < raf.length()) {
                long posicionActual = raf.getFilePointer();
                String nif = leerString(raf, 9);
                raf.skipBytes(20 + 20); // Saltar nombre y apellidos

                if (nif.equals(nifBuscado) && !nif.equals("-1")) {
                    // Posicionarse exactamente donde empieza el salario del registro actual
                    raf.seek(posicionActual + 18 + 20 + 20);
                    raf.writeDouble(nuevoSalario);
                    modificado = true;
                    System.out.println("Salario modificado correctamente.");
                    break;
                }
            }
            if (!modificado) {
                System.out.println("El empleado no existe o está dado de baja.");
            }
        } catch (Exception e) {
            System.out.println("Error al modificar el empleado: " + e.getMessage());
        }
    }

    private static void borradoLogico(Scanner scanner) {
        System.out.print("Introduzca el NIF del empleado a borrar: ");
        String nifBuscado = scanner.nextLine();

        try (RandomAccessFile raf = new RandomAccessFile(NOMBRE_FICHERO, "rw")) {
            boolean borrado = false;
            while (raf.getFilePointer() < raf.length()) {
                long posicionActual = raf.getFilePointer();
                String nif = leerString(raf, 9);
                raf.skipBytes(20 + 20 + 8);

                if (nif.equals(nifBuscado) && !nif.equals("-1")) {
                    // Volver al inicio de este registro para sobrescribir el NIF a "-1"
                    raf.seek(posicionActual);
                    Empleado empBorrado = new Empleado("-1", "BORRADO", "BORRADO", 0.0);
                    escribirRegistro(raf, empBorrado.getNif(), empBorrado.getNombre(), empBorrado.getApellidos(), empBorrado.getSalario());
                    borrado = true;
                    System.out.println("Borrado lógico realizado con éxito (NIF cambiado a -1).");
                    break;
                }
            }
            if (!borrado) {
                System.out.println("No se encontró ningún empleado activo con ese NIF.");
            }
        } catch (Exception e) {
            System.out.println("Error al realizar el borrado: " + e.getMessage());
        }
    }

    private static void listarEmpleados() {
        System.out.println("\n--- LISTADO GENERAL DE EMPLEADOS ACTIVOS ---");
        try (RandomAccessFile raf = new RandomAccessFile(NOMBRE_FICHERO, "r")) {
            boolean hayEmpleados = false;
            while (raf.getFilePointer() < raf.length()) {
                String nif = leerString(raf, 9);
                String nombre = leerString(raf, 10);
                String apellidos = leerString(raf, 10);
                double salario = raf.readDouble();

                if (!nif.equals("-1")) {
                    System.out.println("NIF: " + nif + " | Nombre: " + nombre + " | Apellidos: " + apellidos + " | Salario: " + salario);
                    hayEmpleados = true;
                }
            }
            if (!hayEmpleados) {
                System.out.println("No hay empleados registrados en este momento.");
            }
        } catch (Exception e) {
            System.out.println("El fichero aún no existe o está vacío.");
        }
    }

    // Métodos auxiliares para lectura y escritura de caracteres fijos
    private static void escribirRegistro(RandomAccessFile raf, String nif, String nombre, String apellidos, double salario) throws Exception {
        Empleado emp = new Empleado(nif, nombre, apellidos, salario);
        raf.writeChars(emp.getNif());
        raf.writeChars(emp.getNombre());
        raf.writeChars(emp.getApellidos());
        raf.writeDouble(emp.getSalario());
    }

    private static String leerString(RandomAccessFile raf, int numCaracteres) throws Exception {
        char[] chars = new char[numCaracteres];
        for (int i = 0; i < numCaracteres; i++) {
            chars[i] = raf.readChar();
        }
        return new String(chars).trim();
    }
    
}
