package Controlador;

import Modelo.Empleado;
import Modelo.EmpleadoDepartamento;
import Vista.VistaConsola;
import dao.EmpleadoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorEmpresa {

    private final VistaConsola vista;
    private final EmpleadoDAO dao;

    public ControladorEmpresa(VistaConsola vista, EmpleadoDAO empleadoDAO) {
        this.vista = vista;
        this.dao = empleadoDAO;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            try {
                switch (opcion) {
                    case 1 -> {
                        Empleado e = vista.pedirDatosNuevoEmpleado();
                        if (!dao.existeDepartamento(e.getIdDepartamento())) {
                            vista.mostrarMensaje("No se pudo insertar: el departamento no existe.");
                        } else {
                            boolean hayFilas = dao.insertarEmpleado(e);
                            vista.mostrarMensaje(hayFilas
                                    ? "Empleado insertado correctamente."
                                    : "No se pudo insertar el empleado");
                        }
                    }
                    case 2 -> {
                        String dni = vista.pedirCadena("Dame el DNI: ");
                        double salario = vista.pedirNumeroDecimal("Dime el nuevo salario del empleado: ");
                        boolean hayFilas = dao.modificarSueldo(dni, salario);
                        vista.mostrarMensaje(hayFilas
                                ? "Salario actualizado correctamente."
                                : "El empleado no existe. No se actualizo");
                    }
                    case 3 -> {
                        String dni = vista.pedirCadena("Dame el DNI: ");
                        Empleado emp = dao.filtrarPorDNI(dni);
                        if (emp == null) {
                            vista.mostrarMensaje("No existe ningún empleado con ese DNI.");
                        } else {
                            vista.mostrarMensaje("Datos del empleado: " + emp);
                            String confirmacion = vista.pedirCadena("¿Seguro que deseas eliminarlo? (S/N): ");
                            if (confirmacion.equalsIgnoreCase("S")) {
                                boolean hayFilas = dao.eliminarEmpleado(dni);
                                vista.mostrarMensaje("Empleado eliminado");
                            } else {
                                vista.mostrarMensaje("No se borro el empleado.");
                            }
                        }
                    }
                    case 4 -> {
                        ArrayList<EmpleadoDepartamento> empleados = dao.consultarEmpleadoDepartamento();
                        vista.mostrarEmpleado(empleados);
                    }
                    case 5 -> {
                        String dni = vista.pedirCadena("Dime el DNI: ");
                        int idDept = vista.pedirNumero("Dime el ID del departamento: ");
                        if (!dao.existeDepartamento(idDept)) {
                            vista.mostrarMensaje("El departamento " + idDept + " no existe. No se realizó la modificación.");
                        } else {
                            boolean hayFilas = dao.actualizarEmpleadoDepartamento(dni, idDept);
                            vista.mostrarMensaje(hayFilas
                                    ? "El empleado fue cambiado al departamento correctamente. "
                                    : "No se encontró ningún empleado con ese DNI");
                        }
                    }
                    case 0 ->
                        vista.mostrarMensaje("Saliendo de la aplicación...");
                    default ->
                        vista.mostrarMensaje("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (SQLException e) {
                vista.mostrarError(e.getMessage());
            }
        } while (opcion != 0);
    }
}
