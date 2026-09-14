/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author mario.sanper.2
 */
public class Farola {
    private String codigo ;
    private double consumo;
    private Zona zona;

    public Farola(String codigo, double consumo, Zona zona) {
        this.codigo = codigo;
        this.consumo = consumo;
        this.zona = zona;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getConsumo() {
        return consumo;
    }

    public Zona getZona() {
        return zona;
    }
    
}
