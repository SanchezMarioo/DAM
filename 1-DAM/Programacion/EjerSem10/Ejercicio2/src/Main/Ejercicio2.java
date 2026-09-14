/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controlador.ControladorApp;
import dao.AlumnoDAO;
import Vista.VistaConsola;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConsola vista = new VistaConsola();
        AlumnoDAO dao = new AlumnoDAO();
        ControladorApp app = new ControladorApp(dao, vista);
        app.init();
    }
    
}
