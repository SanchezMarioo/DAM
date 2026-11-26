/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaConsola;
import dao.TorneoDAO;
import java.sql.SQLException;

/**
 *
 * @author Mario
 */
public class ControladorTorneo {

    private VistaConsola vista;
    private TorneoDAO dao;

    public ControladorTorneo(VistaConsola vista, TorneoDAO dao) {
        this.vista = vista;
        this.dao = dao;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    try {
                        dao.crearBaseDatos();
                        vista.mostrarMensaje("Se ha creado la base de datos correctamente.");
                    } catch (SQLException ex) {
                        vista.mostrarError(ex.getMessage());
                    }
                }

                case 2 -> {
                    try {
                        dao.crearTablas();
                        vista.mostrarMensaje("Se crearon las tablas de EQUIPOS y JUGADORES");
                    } catch (SQLException ex) {
                        vista.mostrarError(ex.getMessage());
                    }
                }

                case 3 -> {
                    try {
                        int[] filas = dao.insertDatosInciales();
                        vista.mostrarMensaje("Datos iniciales cargados correctamente. "
                                + "Equipos: " + filas[0] + " , jugadores: " + filas[1]);
                    } catch (SQLException ex) {
                        vista.mostrarError(ex.getMessage());
                    }
                }

                case 4 -> {
                    try {
                        dao.añadirTabla();
                        vista.mostrarMensaje("Se ha insertado la columna 'email' en la table de 'jugadores'");

                    } catch (SQLException ex) {
                        // Código 1060 en MySQL = Duplicate column name (columna ya existente en ALTER TABLE)
                        if (ex.getErrorCode() == 1060) {
                            vista.mostrarError("La columna 'email' ya existe en la tabla 'jugadores'.");
                        } else {
                            vista.mostrarError("Fallo SQL: " + ex.getMessage());
                        }
                    }
                }

                case 5 -> {
                    try {
                        
                        if (vista.pedirCadena("Quieres borrar las tablas (S/N)").equalsIgnoreCase("S")) {
                            dao.borrarTablas();
                            vista.mostrarMensaje("Se han borrado las tablas correctamente");
                        } else {
                            vista.mostrarMensaje("No se borraron las tablas.");

                        }

                    } catch (SQLException ex) {
                        vista.mostrarError(ex.getMessage());
                    }
                }
                case 0 ->
                    vista.mostrarMensaje("Saliendo del programa...");
                default ->
                    vista.mostrarError("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
