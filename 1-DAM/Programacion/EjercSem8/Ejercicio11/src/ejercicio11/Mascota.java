/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public abstract class Mascota {

    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private String estado;

    public Mascota(String nombre, int edad, String fechaNacimiento, String estado) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }
    
    public abstract void muestra();

    public abstract void habla();

    public void morir() {
        estado = "Muerto";
    }
    public void cumpleaños(){
        edad++;
    }
}
