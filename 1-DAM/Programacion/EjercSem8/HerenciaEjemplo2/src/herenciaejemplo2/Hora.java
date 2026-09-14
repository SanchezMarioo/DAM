/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejemplo2;

/**
 *
 * @author mario.sanper.2
 */
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    @Override
    public boolean equals(Object obj) {
        Hora hora = (Hora) obj;
        return ((this.hora == hora.hora) && this.minutos == hora.minutos && this.segundos == hora.segundos);
    }

    @Override
    public String toString() {
        return hora + " horas" + " - " + minutos + " minutos" + " - " + segundos + " segundos";
    }

}
