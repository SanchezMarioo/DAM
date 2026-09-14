/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_abstracto_ejemplo;

/**
 *
 * @author mario.sanper.2
 */
public abstract class Vehiculo {

    private String marca;
    private double velocidadActual;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidadActual = 0;
    }
    
    
    public void acelarar(int incremento) {
        velocidadActual += incremento;
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    public abstract void moverse();

}
