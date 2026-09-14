/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public abstract class Aves extends Mascota {

    private String pico;
    private boolean vuela;

    public Aves(String pico, boolean vuela, String nombre, int edad, String fechaNacimiento, String estado) {
        super(nombre, edad, fechaNacimiento, estado);
        this.pico = pico;
        this.vuela = vuela;
    }

    public boolean isVuela() {
        return vuela;
    }

    

    public abstract void volar();
}
