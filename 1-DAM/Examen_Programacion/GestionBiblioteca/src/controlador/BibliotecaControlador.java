/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import VistaConsola.VistaConsola;
import dao.BibliotecaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Libro;

/**
 *
 * @author MARIO
 */
public class BibliotecaControlador {
    private VistaConsola vista;
    private BibliotecaDAO dao;

    public BibliotecaControlador(VistaConsola vista, BibliotecaDAO dao) {
        this.vista = vista;
        this.dao = dao;
    }
    
    public void init(){
        vista.mostrarMsg("========= BIBLIOTECA LIBROS ===========");
        mostrarBiblioteca();
    }
    
    private void mostrarBiblioteca(){
        try {
            ArrayList <Libro> libros = dao.select();
            
        } catch (SQLException ex) {
            vista.mostrarMsg(ex.getMessage());
        }
        
    }
    
}
