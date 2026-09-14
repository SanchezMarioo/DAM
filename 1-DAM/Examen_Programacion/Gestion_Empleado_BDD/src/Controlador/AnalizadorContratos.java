/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Contrato;
import Model.Empleado;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Mario
 */
public class AnalizadorContratos {

    public int calcularEdad(Empleado e) {
        LocalDate fechaNacimiento = e.getFechaNacimiento();
        int edadActual = Period.between(fechaNacimiento, LocalDate.now()).getYears();

        return edadActual;
    }

    public int antiguedadAnios(Empleado e) {
        return Period.between(e.getFechaIncorporacion(), LocalDate.now()).getYears();
    }

    public int antiguedadMeses(Empleado e) {
        return Period.between(e.getFechaIncorporacion(), LocalDate.now()).getMonths();
    }

    public Contrato buscarContratoActivo(Empleado e, ArrayList<Contrato> contratos) {
        Contrato c = null;
        for (Contrato contrato : contratos) {
            if (e.getId() == contrato.getIdEmpleado()) {
                if (contrato.getFechaFin() == null || !contrato.getFechaFin().isBefore(LocalDate.now())) {
                    if (contrato == null || contrato.getFechaInicio().isAfter(contrato.getFechaInicio())) {
                        c = contrato;
                    }

                }
            }
        }
        return c;
    }

    public ArrayList<Empleado> filtrarPorAntiguedad(ArrayList<Empleado> empleados, int aniosMinimos) {
        ArrayList<Empleado> empleadosAntiguos = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (antiguedadAnios(empleado) > aniosMinimos) {
                empleadosAntiguos.add(empleado);
            }
        }
        return empleadosAntiguos;
    }

    public long calcularDiasContratoActivo(Contrato contrato) {
        return ChronoUnit.DAYS.between(contrato.getFechaInicio(), LocalDate.now());
    }

}
