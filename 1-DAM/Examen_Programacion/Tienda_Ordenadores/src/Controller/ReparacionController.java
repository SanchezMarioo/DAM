/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Dao.ProductoDAO;
import Model.Reparacion;
import View.VistaConsola;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mario
 */
public class ReparacionController {

    private File archivo;
    private ProductoDAO dao;
    private VistaConsola consola;

    public ReparacionController(ProductoDAO dao, VistaConsola consola) {

        archivo = new File("registro_reparaciones.txt");
        this.dao = dao;
        this.consola = consola;
    }

    private boolean existeArchivo() {
        return archivo.exists();
    }

    public void init() {
        if (existeArchivo()) {
            añadirPorDefecto();
            
        } else {
            crearProducto();
        }
    }

    private void añadirPorDefecto() {
        Reparacion reparacion = new Reparacion(1, "Portatil", "Pantalla rota", 120.50);
        Reparacion reparacion2 = new Reparacion(2, "Móvil", "Cambio batería", 45.00);

        try {
            dao.write(reparacion.toFile());
            dao.write(reparacion2.toFile());
        } catch (IOException ex) {
            consola.mostrarMsg(ex.getMessage());
        }
    }

    private void crearProducto() {
        int id = consola.pedirNumero("Dime el id");
        String nombre = consola.pedirMsg("Dime el tipo de dispositivo");
        String tipoReparacion = consola.pedirMsg("¿Que se ha roto?: ");
        double precio = consola.pedirNumeroDecimal("Dime el precio de la reparacion: ");
        try {
            dao.write(new Reparacion(id, tipoReparacion, tipoReparacion, precio).toFile());
        } catch (IOException ex) {
            consola.mostrarMsg(ex.getMessage());
        }
    }
}
