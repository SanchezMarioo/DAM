/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanchezperez_mario_2dam_ad_ud1_práctica4;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class SanchezPerez_Mario_2DAM_AD_UD1_Práctica4 {

    /**
     * @param args the command line arguments
     */
    private static final int LONGITUD_NIF = 18;
    private static final int LONGITUD_NOMBRE = 20;
    private static final int LONGITUD_APELLIDOS = 20;
    private static final int LONGITUD_SALARIO = 8;
    private static final String REGEXP_NIF = "[0-9]{8}[A-Z]";
    private static Scanner sc;
    private static File archivo = new File("usuario.dat");
    private static RandomAccessFile raf;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        raf = new RandomAccessFile(archivo);
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");
            switch (opcion) {
                case 1 ->
                    insertarEmpleado();
                case 2 ->
                    consultarEmpleado();
                case 3 ->
                    modificarSalario();
                case 4 ->
                    borrarEmpleado();
                case 5 ->
                    listarEmpleados();
                case 0 ->
                    System.out.println("Saliendo de la aplicación...");
                default ->
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("=== GESTIÓN DE EMPLEADOS - VENANCIO CORP ===");
        System.out.println("1. Inserción de empleado");
        System.out.println("2. Consulta de empleado");
        System.out.println("3. Modificación de salario");
        System.out.println("4. Borrado lógico de empleado");
        System.out.println("5. Listado general");
        System.out.println("0. Salir");
    }

    static boolean comprobarDNI(String nombre) {
        return nombre.matches(REGEXP_NIF);
    }

    private static void insertarEmpleado() {
        System.out.println("Dime el NIF: ");
        String nif = sc.nextLine();
        while (!comprobarDNI(nif)) {
            System.out.println("NIF no valido");
            System.out.println("Dime el NIF: ");
            nif = sc.nextLine();
        }
        System.out.println("Dime el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Dime los apellidos: ");
        String apellidos = sc.nextLine();
        double salario = leerDouble("Dime el salario: ");
        
    }
    private static boolean comprobarSiExiste(){
        
    }
    private static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return sc.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un valor numérico.");
            }
        }
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Ingrese un número entero.");
            }
        }
    }
}
