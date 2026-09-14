/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodriver;

import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Mario
 */
public class Gestor {
    private ConexionBD bd;
    private VistaConsola vista;

    public Gestor(ConexionBD bd, VistaConsola vista) {
        this.bd = bd;
        this.vista = vista;
    }
    
    public void init(){
        try(Connection con = bd.connect()){
            bd.connect();
            vista.mostrarMensaje("OK");
        } catch(SQLException e){
            vista.mostrarMensajeError(e.getMessage());
        }
    }
}
