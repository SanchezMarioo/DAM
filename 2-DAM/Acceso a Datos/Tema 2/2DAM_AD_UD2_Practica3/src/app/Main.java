/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import Controlador.ControladorTorneo;
import Vista.VistaConsola;
import dao.TorneoDAO;

/**
 *
 * @author Mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConsola consola = new VistaConsola();
        TorneoDAO dao = new TorneoDAO();
        ControladorTorneo controlador = new ControladorTorneo(consola,dao);
        controlador.iniciar();
    }
    
}
