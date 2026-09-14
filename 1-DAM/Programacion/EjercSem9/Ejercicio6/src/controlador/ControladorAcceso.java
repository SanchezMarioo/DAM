/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Acceso;
import Modelo.AccesoDAO;
import Vista.VistaAcceso;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorAcceso {

    private VistaAcceso vista;
    private AccesoDAO accesoDAO;

    public ControladorAcceso(VistaAcceso vista, AccesoDAO accesoDAO) {
        this.vista = vista;
        this.accesoDAO = accesoDAO;
        init();
    }

    public void init() {
        int opcion = -1;
        do {
            opcion = vista.pedirOpcion();
            switch (opcion) {
                case 1 ->
                    comprobarAcceso();
                case 2 ->
                    mostrarRegistros();
                case 3 ->
                    mostrarRegistrosValidos();
                case 4 ->
                    mostrarRegistrosInvalidos();
                case 5 -> {
                    String msg = vista.pedirMensaje("Dime el nombre del usuario a buscar: ");
                    contarRegistrosUsuario(msg);
                }
                case 6 ->
                    vista.mostrarMensaje("Saliendo del programa");

            }
        } while (opcion != 6);
    }

    private void comprobarAcceso() {
        try {
            String usuario = vista.pedirMensaje("Dime el usuario");
            String contraseña = vista.pedirMensaje("Dime la contraseña: ");
            Acceso acceso = new Acceso(usuario, contraseña);
            vista.mostrarMensaje(acceso.isEsValido() ? "Acceso valido" : "Acceso no valido");
            accesoDAO.escribir(acceso.toFile());
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    private void mostrarRegistros() {
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }

    }

    private void mostrarRegistrosValidos() {
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                if (linea.contains("VALIDO") && !linea.contains("INVALIDO")) {
                    vista.mostrarMensaje(linea);
                }
            }
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    private void mostrarRegistrosInvalidos() {
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                if (linea.contains("INVALIDO")) {
                    vista.mostrarMensaje(linea);
                }
            }
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

    private void contarRegistrosUsuario(String msg) {
        int contador = 0;
        ArrayList<String> lineas;
        try {
            lineas = accesoDAO.leer();
            for (String linea : lineas) {
                if (linea.contains(msg)) {
                    contador++;
                }
            }
            vista.mostrarMensaje("El usuario ha realizado " + contador + " intentos");
        } catch (IOException ex) {
            vista.mostrarMensaje(ex.getMessage());
        }
    }

}
