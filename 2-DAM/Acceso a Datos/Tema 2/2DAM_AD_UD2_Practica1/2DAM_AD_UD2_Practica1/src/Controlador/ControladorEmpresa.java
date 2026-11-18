/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Empleado;
import Modelo.EmpresaDAO;
import Vista.VistaConsola;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorEmpresa {

    private VistaConsola vista = new VistaConsola();
    private EmpresaDAO dao = new EmpresaDAO();

    public void init() {
        int numero = -1;

        do {
            vista.mostrarMenu();
            numero = vista.pedirNumero("Dime un numero: ");
            funcionalidadMenu(numero);
        } while (numero != 0);

    }

    private void funcionalidadMenu(int numero) {
        switch (numero) {
            case 0 -> {
                System.out.println("Saliendo del programa....");
            }
            case 1 -> {
                ArrayList<Empleado> empleados;
                try {
                    empleados = dao.mostrarEmpleados();
                    vista.mostrarEmpleados(empleados);
                } catch (SQLException ex) {
                    vista.mostrarError(ex.getMessage());
                }

            }

            case 2 -> {
                String dni = vista.pedirCadena("Dime el DNI del empleado: ");
                ArrayList<Empleado> empleados;
                try {
                    empleados = dao.filtrarPorDni(dni);
                    vista.mostrarEmpleados(empleados);
                } catch (SQLException ex) {
                    vista.mostrarError(ex.getMessage());
                }

            }

            case 3 -> {
                double salario = vista.pedirNumeroDoble("Dime el salario: ");
                ArrayList<Empleado> empleados;
                try {
                    empleados = dao.filtrarPorSalarioSuperior(salario);
                    vista.mostrarEmpleados(empleados);

                } catch (SQLException ex) {
                    vista.mostrarError(ex.getMessage());
                }
            }

            case 4 -> {
                double salario = vista.pedirNumeroDoble("Dime el salario: ");
                ArrayList<Empleado> empleados;
                try {
                    empleados = dao.filtrarPorSalarioInferior(salario);
                    vista.mostrarEmpleados(empleados);
                } catch (SQLException ex) {
                    vista.mostrarError(ex.getMessage());
                }
            }

            default -> {
                vista.mostrarMsg("Opcion no valida.");
            }
        }
    }
}
