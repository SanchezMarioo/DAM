/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.ContratosDAO;
import Dao.EmpleadoDAO;
import Model.Contrato;
import Model.Empleado;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class AppControladora {

    private ContratosDAO contratoDAO;
    private EmpleadoDAO empleadoDAO;
    private ArrayList<Empleado> empleados;
    private ArrayList<Contrato> contratos;

    public AppControladora(ContratosDAO contratoDAO, EmpleadoDAO empleadoDAO) {
        this.contratoDAO = contratoDAO;
        this.empleadoDAO = empleadoDAO;
    }
    
}
