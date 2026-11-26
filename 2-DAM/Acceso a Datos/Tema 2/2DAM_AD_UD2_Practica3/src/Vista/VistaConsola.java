/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

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
        System.out.println("\n========= TORNEO DE ESPORTS =========");
        System.out.println("1. Crear la base de datos");
        System.out.println("2. Crear las tablas");
        System.out.println("3. Cargar los datos iniciales");
        System.out.println("4. Modificar la estructura");
        System.out.println("5. Borrar las tablas");
        System.out.println("0. Salir");
        return pedirNumero("Elige una opcion: ");
    }

    public int pedirNumero(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    public double pedirNumeroDecimal(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un numero decimal.");
            }
        }
    }

    public String pedirCadena(String msg) {
        System.out.println(msg);
        return sc.nextLine().trim();
    }


    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public void mostrarError(String msg) {
        System.err.println(msg);
    }
}
