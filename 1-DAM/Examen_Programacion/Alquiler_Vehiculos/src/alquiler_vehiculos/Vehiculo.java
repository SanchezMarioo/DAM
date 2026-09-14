/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alquiler_vehiculos;

/**
 *
 * @author MARIO
 */
public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private double precioBaseDia;

    public Vehiculo(String matricula, String marca, double precioBaseDia) {
        this.matricula = matricula;
        this.marca = marca;
        this.precioBaseDia = precioBaseDia;
    }
    
    public abstract double calcularCoste();
}
