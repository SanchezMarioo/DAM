/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controller.ReparacionController;
import Dao.ProductoDAO;
import View.VistaConsola;

/**
 *
 * @author Mario
 */
public class Tienda_Ordenadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConsola vista = new VistaConsola();
        ProductoDAO dao = new ProductoDAO();
        ReparacionController reparacion = new ReparacionController(dao,vista);
        reparacion.init();
    }
    
}
