/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controlador.ControladoraLibros;
import Dao.LibroDAO;
import Vista.VistaConsola;

/**
 *
 * @author Mario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConsola vista = new VistaConsola();
        LibroDAO dao = new LibroDAO();
        ControladoraLibros controlador = new ControladoraLibros(dao, vista);
        controlador.init();
    }
    
}
