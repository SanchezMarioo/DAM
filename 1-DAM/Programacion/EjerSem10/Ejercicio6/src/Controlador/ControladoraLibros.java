/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.LibroDAO;
import Excepciones.SQLInjectionException;
import Modelo.Libro;
import Vista.VistaConsola;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class ControladoraLibros {

    private LibroDAO dao;
    private VistaConsola vista;

    public ControladoraLibros(LibroDAO dao, VistaConsola vista) {
        this.dao = dao;
        this.vista = vista;
    }

    public void init() {
        try {
            ArrayList<Libro> libros = dao.getFirstLast();
            vista.mostrarAlumnos(libros);
            String tituloVulnerable = vista.pedirMsg("Dime el titulo del libro: ");
            ArrayList<Libro> librosBuscadosVulnerables = dao.buscarPorTituloVulnerable(tituloVulnerable);
            vista.mostrarAlumnos(librosBuscadosVulnerables);
            String titulo = vista.pedirMsg("Dime el titulo del libro: ");
            ArrayList<Libro> librosBuscados = dao.buscarPorTituloNoVulnerable(titulo);
            vista.mostrarAlumnos(librosBuscados);
        } catch (SQLException e) {
            vista.mostrarMensaje(e.getMessage());
        } catch (SQLInjectionException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }
}
