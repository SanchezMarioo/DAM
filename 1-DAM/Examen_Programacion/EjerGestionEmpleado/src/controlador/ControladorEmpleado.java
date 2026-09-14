/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import dao.EmpleadoDAO;
import dao.FicheroDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Empleado;
import modelo.Turno;
import vista.VistaConsola;

/**
 *
 * @author Mario
 */
public class ControladorEmpleado {
    
    private EmpleadoDAO dao;
    private VistaConsola consola;
    private FicheroDAO fichero;
    
    public ControladorEmpleado(EmpleadoDAO dao, VistaConsola consola, FicheroDAO fichero) {
        this.dao = dao;
        this.consola = consola;
        this.fichero = fichero;
    }
    
    public void init() {
        // Primero mostramos el mensaje por consola
        mostrarMensajeUltimoEmpleado();
        // Segundo contamos los registros invalidos
        int registrosInvalidos = contarRegistrosInvalidos();
        try {
            // Tercero calculamos el sueldo del empleado
            //para ello debemos de coger los turnos y filtrar
            ArrayList<Empleado> empleados = dao.select();
        } catch (SQLException ex) {
            consola.mostrarMensajeError(ex.getMessage());
        }
    }
    
    public void mostrarMensajeUltimoEmpleado() {
        try {
            Empleado e = dao.selectLastEmpleado();
            consola.mostrarMensajeEmpleado(e);
        } catch (SQLException ex) {
            consola.mostrarMensajeError(ex.getMessage());
        }
    }
    
    public int contarRegistrosInvalidos() {
        int registros = 0;
        try {
            ArrayList<Turno> turnos = fichero.leerFichero();
            for (Turno turno : turnos) {
                if (!comprobarTurno(turno)) {
                    
                    registros++;
                }
            }
            
        } catch (IOException ex) {
            consola.mostrarMensajeError(ex.getMessage());
        }
        return registros;
    }
    
    public boolean comprobarTurno(Turno t) {
        String codigoTurno = t.getCodEmpleado();
        try {
            ArrayList<Empleado> empleados = dao.select();
            for (Empleado empleado : empleados) {
                if (codigoTurno.equals(empleado.getCodigo())) {
                    return true;
                }
            }
            return false;
            
        } catch (SQLException ex) {
            consola.mostrarMensajeError(ex.getMessage());
            return false;
        }
    }
    
    public double asignarSalarioEmpleado(ArrayList<Turno> turnos, Empleado e) {
        double salario = 0;
        for (Turno turno : turnos) {
            if (turno.getCodEmpleado().equals(e.getCodigo())) {
                salario += (turno.getHoras() * e.getSalarioHora());
            }
        }
        return salario;
    }
    
    public int calcularHorasEmpleado(ArrayList<Turno> turnos, Empleado e) {
        int horas = 0;
        for (Turno turno : turnos) {
            if (turno.getCodEmpleado().equals(e.getCodigo())) {
                horas += (turno.getHoras());
            }
        }
        return horas;
    }
}
