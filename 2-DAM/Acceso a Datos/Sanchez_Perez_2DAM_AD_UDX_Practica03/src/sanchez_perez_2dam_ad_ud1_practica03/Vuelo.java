/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchez_perez_2dam_ad_ud1_practica03;

import java.io.Serializable;

/**
 *
 * @author Mario
 */
public class Vuelo implements Serializable {
    private String numeroVuelo;
    private String compañiaAerea;
    private String origenVuelo;
    private String destinoVuelo;
    private double precio;

    public Vuelo(String numeroVuelo, String compañiaAerea, String origenVuelo, String destinoVuelo, double precio) {
        this.numeroVuelo = numeroVuelo;
        this.compañiaAerea = compañiaAerea;
        this.origenVuelo = origenVuelo;
        this.destinoVuelo = destinoVuelo;
        this.precio = precio;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getCompañiaAerea() {
        return compañiaAerea;
    }

    public void setCompañiaAerea(String compañiaAerea) {
        this.compañiaAerea = compañiaAerea;
    }

    public String getOrigenVuelo() {
        return origenVuelo;
    }

    public void setOrigenVuelo(String origenVuelo) {
        this.origenVuelo = origenVuelo;
    }

    public String getDestinoVuelo() {
        return destinoVuelo;
    }

    public void setDestinoVuelo(String destinoVuelo) {
        this.destinoVuelo = destinoVuelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
 

    @Override
    public String toString() {
        return String.format("[ID: %02d] %-12s | %-12s -> %-12s | %7.2f €",
                numeroVuelo, compañiaAerea, origenVuelo, destinoVuelo, precio);
    }
}
