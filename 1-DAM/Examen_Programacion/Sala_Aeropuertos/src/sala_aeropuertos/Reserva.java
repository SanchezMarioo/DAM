/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sala_aeropuertos;

/**
 *
 * @author MARIO
 */
public class Reserva {

    private String nombreEmpleado;
    private DiaSemana dia;
    private int horaIncio;
    private int horaFin;

    public Reserva(String nombreEmpleado, DiaSemana dia, int horaIncio, int horaFin) {
        if (validarNombre(nombreEmpleado) && dia.esValidoDia(dia) && comprobarHoras(horaIncio, horaFin)) {
            this.nombreEmpleado = nombreEmpleado;
            this.dia = dia;
            this.horaIncio = horaIncio;
            this.horaFin = horaFin;
        } else {
            System.out.println("ERROR: Algo ha ido escribe todos los campos correctamente. OBJETO NO INSTACIADO CORRECTAMENTE");
        }

    }

    private boolean validarNombre(String nombre) {
        if (nombre.matches("[A-Za-z]+")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean comprobarHoras(int incio, int fin) {
        boolean rangoHoras = (incio >= 0 && incio <= 23) && (fin >= 0 && fin <= 23);
        boolean incioMenorFinal = incio < fin;
        return rangoHoras && incioMenorFinal;
    }

    public int getHoraIncio() {
        return horaIncio;
    }

    public int getHoraFin() {
        return horaFin;
    }
    

}
