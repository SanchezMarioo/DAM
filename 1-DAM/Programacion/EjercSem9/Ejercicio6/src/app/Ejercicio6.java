/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import Modelo.AccesoDAO;
import Vista.VistaAcceso;
import controlador.ControladorAcceso;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaAcceso vista = new VistaAcceso();
        AccesoDAO acceso = new AccesoDAO();
        ControladorAcceso controlador = new ControladorAcceso(vista, acceso);
    }
    
}
