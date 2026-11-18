/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2dam_ejer_vuelo_objetos;

import java.io.Serializable;

/**
 *
 * @author mario.sanper.2
 */
public class Vuelo implements Serializable {
    private String compania;
    private String origen;
    private String destino;
    private double precio;

    public Vuelo(String compania, String origen, String destino, double precio) {
        this.compania = compania;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "compania=" + compania + ", origen=" + origen + ", destino=" + destino + ", precio=" + precio + '}';
    }
    
    
    
}
