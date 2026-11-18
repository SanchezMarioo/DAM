/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaConsola {

    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("");

        System.out.println("====== MENU ===========");
        System.out.println("0. Salir");
        System.out.println("1. Mostrar libro");
        System.out.println("2. Filtrar entre años");
        System.out.println("======================");
        System.out.println("");
    }

    public int pedirNumero(String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            System.out.println("No es numero");
            sc.nextLine();
            System.out.print(msg);
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public int pedirAño(String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            System.out.println("No es numero");
            sc.nextLine();
            System.out.print(msg);
        }
        int numero = sc.nextInt();
        while (numero < 0) {
            System.out.println("No puede ser el aÃ±o negativo");
            System.out.println(msg);
            numero = sc.nextInt();
        }
        sc.nextLine();
        return numero;
    }

    public void mostrarLibros(ArrayList<Libro> libros) {
        if (libros == null || libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarLibrosConFiltro(ArrayList<Libro> libros) {
        if (libros == null || libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }
        for (Libro libro : libros) {
            System.out.println("");
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("AÃ±o: " + libro.getAnio());
            System.out.println("");
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
