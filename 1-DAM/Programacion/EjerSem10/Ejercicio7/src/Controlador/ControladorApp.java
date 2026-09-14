/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.EmailDAO;
import Dao.FicheroDAO;
import Vista.VistaConsola;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorApp {

    private FicheroDAO fichero;
    private VistaConsola vista;
    private EmailDAO email;
    
    public ControladorApp(FicheroDAO fichero, VistaConsola vista, EmailDAO email) {
        this.fichero = fichero;
        this.vista = vista;
        this.email = email;
    }
    
    public void verCorreos() {
        ArrayList<String> correos;
        try {
            correos = fichero.read();
            email.insert(correos);
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        } catch (SQLException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
        
    }
    
}
