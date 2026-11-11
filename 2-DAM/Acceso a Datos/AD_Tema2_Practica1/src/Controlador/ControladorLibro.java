/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.LibroDAO;
import Modelo.Libro;
import Vista.VistaConsola;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorLibro {

    private VistaConsola vista = new VistaConsola();
    private LibroDAO sql = new LibroDAO();

    public void init() {
        int numero = -1;
        while (numero != 0) {
            vista.mostrarMenu();
            numero = vista.pedirNumero("Escoge una opcion: ");
            funcionalidadMenu(numero);
        }
    }

    private void funcionalidadMenu(int numero) {
        switch (numero) {
            case 1 -> {
                ArrayList<Libro> libros = sql.selectTodosLibros();
                vista.mostrarLibros(libros);
            }
            case 2 -> {
                int añoIncio = vista.pedirAño("Dime el año de incio: ");
                int añoFinal = vista.pedirAño("Dime el año de fin: ");
                ArrayList<Libro> libros = sql.filtrarEntreAños(añoIncio, añoFinal);
                vista.mostrarLibrosConFiltro(libros);
            }
            case 0 -> {
                vista.mostrarMensaje("Saliendo del programa...");
            }
            default -> {
                vista.mostrarMensaje("Opcion no valida");
            }
        }
    }
}
