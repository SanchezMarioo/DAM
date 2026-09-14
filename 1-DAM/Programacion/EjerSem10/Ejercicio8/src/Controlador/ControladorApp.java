/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.EmailDAO;
import Dao.FicheroDAO;
import Modelo.EmailModel;
import Vista.VistaConsola;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class ControladorApp {

    private EmailDAO email;
    private FicheroDAO fichero;
    private VistaConsola vista;

    public ControladorApp(EmailDAO email, FicheroDAO fichero, VistaConsola vista) {
        this.email = email;
        this.fichero = fichero;
        this.vista = vista;
    }

    public void init() {
        // Insertar correos en la BD 
        insertarMensajesDesdeFichero();
        int opcion = 0;
        do {
            vista.mostrarMenu();
            vista.mostrarMensaje("Dime una opcion: ");
            opcion = vista.pedirNumero();
            funcionalidadMenu(opcion);
        } while (true);

    }

    private void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 ->
                eliminarCorreo();
            case 2 ->
                mostrarCorreos();
            case 3 ->
                vista.mostrarMensaje("Saliendo del programa....");
            default ->
                vista.mostrarMensaje("Opcion no valida");
        }
    }

    private void insertarMensajesDesdeFichero() {
        // Insertar correos en la BD 
        int correosInsertados = 0;
        try {
            ArrayList<String> correos = fichero.leer();
            for (String correo : correos) {
                String nombreCorreo = correo;
                LocalDateTime fechaHora = LocalDateTime.now();
                if (!email.existeCorreo(correo)) {
                    if (email.insert(new EmailModel(correo, fechaHora))) {
                        correosInsertados++;
                    }

                }
            }
            if (correosInsertados == 0) {
                vista.mostrarMensaje("==============================================");
                vista.mostrarMensaje("No se han podido insertar correos electronicos nuevos.");
                vista.mostrarMensaje("==============================================");
            } else {
                vista.mostrarMensaje("==============================================");
                vista.mostrarMensaje("Se han insertado " + correosInsertados + " correos electronicos");
                vista.mostrarMensaje("==============================================");
            }
        } catch (IOException | SQLException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }

    }

    private void eliminarCorreo() {
        vista.mostrarMensaje("Dime el correo a eliminar: ");
        String correo = vista.pedirEmail();
        int correoEliminado;
        try {
            correoEliminado = email.delete(correo);
            if (correoEliminado == 0) {
                vista.mostrarMensaje("No existe ese correo en la base de datos.");
            } else {
                vista.mostrarMensaje("El correo se ha eliminado correctamente. ");
            }
        } catch (SQLException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }

    }

    private void mostrarCorreos() {
        try {
            ArrayList<String> correos = email.selectCorreos();
            vista.mostrarCorreos(correos);
        } catch (SQLException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }

    }
}
