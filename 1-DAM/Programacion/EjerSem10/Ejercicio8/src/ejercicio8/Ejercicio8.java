/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import Controlador.ControladorApp;
import Dao.EmailDAO;
import Dao.FicheroDAO;
import Vista.VistaConsola;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FicheroDAO dao = new FicheroDAO();
        EmailDAO email = new EmailDAO();
        VistaConsola vista = new VistaConsola();
        ControladorApp app = new ControladorApp(email, dao, vista);
        app.init();
    }
}
