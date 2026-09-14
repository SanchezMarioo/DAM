/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.Escritor;
import Modelo.Empleado;
import Modelo.Turno;
import Vista.VistaConsola;
import java.time.Duration;
import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class ControladorTurnos {

    private Escritor escritor;
    private VistaConsola vista;
    private String ruta = "turnos.txt";

    public ControladorTurnos(Escritor escritor, VistaConsola vista) {
        this.escritor = escritor;
        this.vista = vista;
    }

    public void init() {
        ArrayList<Empleado> empleados = escritor.escritor(ruta);
        mostrarPorConsola(empleados);
    }
    public void mostrarPorConsola(ArrayList<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println(generarTextoInforme(empleado));
        }
    }

    public String generarTextoInforme(Empleado e) {
        ArrayList<Turno> turnos = e.getTurnos();
        String departamento = turnos.getFirst().getDepartamento();
        Duration total = e.calcularTotalHoras();
        int horas = (int) total.toHours();
        int minutos = total.toMinutesPart();
        String textoTurnos = "";
        boolean turnoExcedido = e.tieneturnoExcedido();
        for (Turno turno : turnos) {
            Duration horasMins = turno.calcularDuracion();
            textoTurnos += "-" + turno.getFecha() + "|" + "Entrada: " + turno.getHoraEntrada() + " | Salida: " + turno.getHoraSalida() + "| Duracion: " + horasMins.toHours() + "h " + horasMins.toMinutesPart() + "m\n";
        }
        return "Empleado: " + e.getNombre() + "\n"
                + "Departamento: " + departamento + "\n"
                + "Número de turnos: " + turnos.size() + "\n"
                + "Total horas trabajas: " + horas + "h " + minutos + " m\n"
                + "¿Algún turno excede 9h?:" + (turnoExcedido ? "SI" : "NO") + "\n"
                + "Detalle de turnos: \n"
                + textoTurnos;
    }
}
