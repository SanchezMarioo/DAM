/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public class Gato extends Mascota {

    private String color;
    private boolean peloLargo;

 public Gato(String nombre, int edad, String fechaNacimiento, String estado, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento, estado);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    @Override
    public void muestra() {
        System.out.println("Gato - Nombre: " + getNombre() + ", Edad: " + getEdad()
                + ", Estado: " + getEstado() + ", Color: " + color
                + ", ¿Pelo largo?: " + (peloLargo ? "Sí" : "No"));
    }

    @Override
    public void habla() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }
}
