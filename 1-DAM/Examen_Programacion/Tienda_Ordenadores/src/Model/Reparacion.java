/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Mario
 */
public class Reparacion {

    private int id;
    private String tipoDispositivo;
    private String descripcionBateria;
    private double costeEstimado;

    public Reparacion(int id, String tipoDispositivo, String descripcionBateria, double costeEstimado) {
        this.id = id;
        this.tipoDispositivo = tipoDispositivo;
        this.descripcionBateria = descripcionBateria;
        this.costeEstimado = costeEstimado;
    }
    
    
    public String toFile() {
        return id + ";" + tipoDispositivo + ";" + descripcionBateria + ";" + costeEstimado;

    }
}
