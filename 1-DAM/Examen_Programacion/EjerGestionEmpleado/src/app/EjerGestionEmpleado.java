/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import controlador.ControladorEmpleado;
import dao.EmpleadoDAO;
import dao.FicheroDAO;
import vista.VistaConsola;

/**
 *
 * @author Mario
 */
public class EjerGestionEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoDAO dao = new EmpleadoDAO();
        FicheroDAO fichero = new FicheroDAO();
        VistaConsola vista = new VistaConsola();
        ControladorEmpleado controlador = new ControladorEmpleado(dao, vista, fichero);
        controlador.init();
    }
    
}
