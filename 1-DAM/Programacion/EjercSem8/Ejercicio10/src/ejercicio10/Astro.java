/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author MARIO
 */
public abstract class Astro {
    private String nombre;
    private double masa;
    private double diametroMedio;
    private double periodoRotacionEje;
    private double periodoTranslacion;
    private double distanciaMedia;
    
    public abstract void mostrarInformacion();

    public Astro(String nombre, double masa, double diametroMedio, double periodoRotacionEje, double periodoTranslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.periodoRotacionEje = periodoRotacionEje;
        this.periodoTranslacion = periodoTranslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public double getPeriodoRotacionEje() {
        return periodoRotacionEje;
    }

    public double getPeriodoTranslacion() {
        return periodoTranslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }
    
    

    
    @Override
    public String toString() {
        return "nombre: " + nombre + " |  masa " + masa + " | diametroMedio" + diametroMedio + " | periodoRotacionEje " + periodoRotacionEje + " | periodoTranslacion " + periodoTranslacion + " |  distanciaMedia " + distanciaMedia;
    }
    
}
