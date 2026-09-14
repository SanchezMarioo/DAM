/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Empleado;

/**
 *
 * @author Mario
 */
public class VistaConsola {
    public void mostrarMensajeEmpleado(Empleado e ){
        System.out.println("[SISTEMA] Último empleado registrado en BD: " + e.getCodigo() + " -" + e.getNombre() + " " + e.getApellidos() );
    }
    public void mostrarMensajeError(String msg){
        System.err.println("[ERROR] " + msg);
    }
}
