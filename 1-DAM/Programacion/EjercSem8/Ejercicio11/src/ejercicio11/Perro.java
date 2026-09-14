/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public class Perro extends Mascota {

    private String raza;
    private boolean pulgas;

    public Perro(String nombre, int edad, String fechaNacimiento, String estado, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento, estado);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    @Override
    public void muestra() {
        System.out.println("Perro - Nombre: " + getNombre()
                + ", Edad: " + getEdad() + ", Estado: " + getEstado()
                + ", Raza: " + raza + ", ¿Tiene pulgas?: " + (pulgas ? "Sí" : "No"));
    }

    @Override
    public void habla() {
        System.out.println("Guau guau!!! ");
    }

}
