/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Servicio {

    private ArrayList<EstacionMeteorologica> estaciones;

    public Servicio(ArrayList<EstacionMeteorologica> estaciones) {
        this.estaciones = estaciones;
    }

    public ArrayList<EstacionMeteorologica> estacionesAlturaMayorde(double altura) {
        ArrayList<EstacionMeteorologica> estacionesAltitud = new ArrayList<>();
        for (EstacionMeteorologica estacion : estaciones) {
            if (estacion.getAltitud() > altura) {
                estacionesAltitud.add(estacion);
            }
        }
        return estacionesAltitud;
    }

    public double velocidadMediaEstaciones() {
        double suma = 0;
        for (EstacionMeteorologica estacion : estaciones) {
            suma += estacion.getVelocidadMaxViento();
        }
        return suma / estaciones.size();
    }

    public EstacionMeteorologica estacionMayorPrecipitacion() {
        EstacionMeteorologica mayorEstacion = estaciones.get(0);
        for (EstacionMeteorologica estacion : estaciones) {
            if ( estacion.getPrecipitacion() > mayorEstacion.getPrecipitacion() ) {
                mayorEstacion = estacion;
            }
        }
        return mayorEstacion;
    }

    public boolean estacionesPeligrosas() {
        for (EstacionMeteorologica estacion : estaciones) {
            if (estacion.getVelocidadMaxViento() > 100) {
                return true;
            }
        }
        return false;
    }

}
