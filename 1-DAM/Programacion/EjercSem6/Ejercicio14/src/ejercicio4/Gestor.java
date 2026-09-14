/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Mario
 */
public class Gestor {

    public String nombre;
    public final int telefono;
    double maximoAutorizado;

    public Gestor(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        maximoAutorizado = 1000;
    }

    public Gestor(String nombre, int telefono, double maximoAutorizado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.maximoAutorizado = maximoAutorizado;
    }

    public int getTelefono() {
        return telefono;
    }

}
