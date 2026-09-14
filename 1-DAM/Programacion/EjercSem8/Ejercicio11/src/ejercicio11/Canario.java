/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public class Canario extends Aves {

    private String color;
    private boolean canta;

    public Canario(String color, boolean canta, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento, String estado) {
        super(pico, vuela, nombre, edad, fechaNacimiento, estado);
        this.color = color;
        this.canta = canta;
    }
    
    @Override
    public void volar() {
        if (isVuela()) {
            System.out.println("Vuela");
        }
    }

    @Override
    public void muestra() {
        System.out.println("Loro - Nombre: " + getNombre()
                + ", ¿Habla?: " + (canta ? "Sí" : "No"));
    }

    @Override
    public void habla() {
        if (canta) {
            System.out.println("Pio pio!!");
        } else {
            System.out.println("No canta");
        }

    }

}
