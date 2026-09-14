/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.LibroDAO;
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
        } catch (SQLException e) {
            vista.mostrarMensaje(e.getMessage());
        }
    }
}
