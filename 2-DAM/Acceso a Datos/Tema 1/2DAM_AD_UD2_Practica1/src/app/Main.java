/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import Controlador.ControladorEmpresa;
import Vista.VistaConsola;

/**
 *
 * @author mario.sanper.2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControladorEmpresa controlador = new ControladorEmpresa();
        controlador.init();
    }
    
}
