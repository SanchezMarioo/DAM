/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Empleado;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaConsola {

    private final Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n========= GESTIÓN DE EMPRESA =========");
        System.out.println("1. Insertar nuevo empleado");
        System.out.println("2. Modificar salario de un empleado");
        System.out.println("3. Eliminar un empleado");
        System.out.println("4. Consultar empleados y su departamento");
        System.out.println("5. Cambiar de departamento a un empleado");
        System.out.println("0. Salir");
        return pedirNumero("Elige una opción: ");
    }

    public int pedirNumero(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1; // Provocará el aviso de opción no válida en el switch
        }
    }

    public double pedirNumeroDecimal(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un número decimal válido.");
            }
        }
    }

    public String pedirCadena(String msg) {
        System.out.println(msg);
        return sc.nextLine().trim();
    }

    public Empleado pedirDatosNuevoEmpleado() {
        System.out.println("\n--- DATOS DEL NUEVO EMPLEADO ---");

        String dni = pedirCadena("DNI (9 caracteres):");
        String nombre = pedirCadena("Nombre: ");
        String apellidos = pedirCadena("Apellidos: ");
        String puesto = pedirCadena("Puesto: ");
        String fechaAlta = pedirFechaAlta("Fecha de alta (AAAA-MM-DD):");
        double salario = pedirNumeroDecimal("Salario: ");

        
        System.out.print("Comisión (opcional, pulsa Enter para dejar vacío): ");
        String entradaComision = sc.nextLine().trim();
        Double comision = entradaComision.isEmpty()
                ? null
                : Double.parseDouble(entradaComision.replace(',', '.'));
        

        int idDepartamento = pedirNumero("ID del departamento: ");

        return new Empleado(dni, nombre, apellidos, puesto, fechaAlta, salario, comision, idDepartamento);
    }
    public String pedirFechaAlta(String msg) {
        String fecha = "";
        String regexp = "\\d{4}-\\d{2}-\\d{2}";
        while (true) {
            System.out.println(msg);
            fecha = sc.nextLine().trim();
            
            if (fecha.matches(regexp)) {
                return fecha;
            }
            System.out.println("Formato incorrecto. Usa AAAA-MM-DD (ej. 2026-11-20).");
        }
    }

    public <T> void mostrarEmpleado(ArrayList<T> lista) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("No hay registros para mostrar.");
            return;
        }
        for (Object object : lista) {
            System.out.println(object);
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public void mostrarError(String msg) {
        System.err.println(msg);
    }
}
