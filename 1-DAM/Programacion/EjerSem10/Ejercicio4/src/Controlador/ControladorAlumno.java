/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.AlumnoDAO;
import Exceptions.AlumnoNotValid;
import Modelo.Alumno;
import Vista.VistaConsola;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */

public class ControladorAlumno {

    private AlumnoDAO dao;
    private VistaConsola vista;

    public ControladorAlumno(AlumnoDAO dao, VistaConsola vista) {
        this.dao = dao;
        this.vista = vista;
    }

    public void init() {
        do {
            vista.mostrarMenu();
            int numero = vista.pedirNumero("Escoge una opcion: ");
            menuLogica(numero);
        } while (true);

    }

    private void menuLogica(int opcion) {
        switch (opcion) {
            case 1 ->
                mostrarAlumnos();
            case 2 ->
                insertarAlumno();
            case 3 ->
                borrarAlumnoPorID();
            case 4 -> {
                mostrarAlumnosAlReves();
            }
            default ->
                vista.mostrarMensaje("No has elegido una opcion valida");
        }
    }

    private void mostrarAlumnos() {
        try {
            ArrayList<Alumno> alumnos = dao.select();
            vista.mostrarAlumnos(alumnos);
        } catch (SQLException ex) {
            vista.mostrarMensajeError(ex.getMessage());
        }
    }

    private void mostrarAlumnosAlReves() {
        try {
            ArrayList<Alumno> alumnos = dao.selectReverse();
            vista.mostrarAlumnos(alumnos);
        } catch (SQLException ex) {
            vista.mostrarMensajeError(ex.getMessage());
        }
    }

    private void insertarAlumno() {
        try {
            int id = vista.pedirNumero("Dime el ID del usuario: ");
            String nombre = vista.pedirMensaje("Dime el nombre del alumno: ");
            String dni = vista.pedirMensaje("Dime el DNI del alumno: ");
            dao.insert(new Alumno(id, nombre, dni));

        } catch (SQLException ex) {
            vista.mostrarMensajeError(ex.getMessage());
        } catch (AlumnoNotValid ex) {
            vista.mostrarMensajeError(ex.getMessage());
        }
    }

    private void borrarAlumnoPorID() {
        try {
            int id = vista.pedirNumero("Dime el ID del usuario: ");
            dao.deleteFromID(id);
        } catch (SQLException ex) {
            vista.mostrarMensajeError(ex.getMessage());
        } catch (AlumnoNotValid ex) {
            vista.mostrarMensajeError(ex.getMessage());
        }
    }

}
