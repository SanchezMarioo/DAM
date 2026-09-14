/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author mario.sanper.2
 */
public class Sensor {

    private String codigo;
    private double nivelCO2;
    private double temperatura;
    private Ciudad ubicacion;

    public Sensor(String codigo, double nivelCO2, double temperatura, Ciudad ubicacion) {
        this.codigo = codigo;
        this.nivelCO2 = nivelCO2;
        this.temperatura = temperatura;
        this.ubicacion = ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getNivelCO2() {
        return nivelCO2;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public Ciudad getUbicacion() {
        return ubicacion;
    }

    @Override
    public String toString() {
        return String.format("Sensor [Código=%s, CO2=%,.2f, Temp=%.2f°C, Ubicación=%s]",
                codigo, nivelCO2, temperatura, ubicacion);
    }

}
