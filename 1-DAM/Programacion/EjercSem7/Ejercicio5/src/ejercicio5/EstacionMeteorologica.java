/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author Mario
 */
public class EstacionMeteorologica {

    private String id;
    private double altitud;           // metros sobre el nivel del mar
    private double velocidadMaxViento;
    private double precipitacion;

    /**
     *
     * @param id
     * @param altitud metros sobre el nivel del mar
     * @param velocidadMaxViento
     * @param precipitacion
     */
    public EstacionMeteorologica(String id, double altitud, double velocidadMaxViento, double precipitacion) {
        this.id = id;
        this.altitud = altitud;
        this.velocidadMaxViento = velocidadMaxViento;
        this.precipitacion = precipitacion;
    }

    public String getId() {
        return id;
    }

    public double getAltitud() {
        return altitud;
    }

    public double getVelocidadMaxViento() {
        return velocidadMaxViento;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    @Override
    public String toString() {
        return String.format(
                "Estación [%s] | Altitud: %.0f m | Viento máx: %.2f km/h | Precipitación: %.2f mm",
                id, altitud, velocidadMaxViento, precipitacion
        );

    }
}
