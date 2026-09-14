/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mario.sanper.2
 */
public class Dron {
    private int id = 0;
    private static int contador = 0;
    private int horasVuelo = 0;
    private Estado estadoDron;

    public Dron(int horasVuelo, Estado estadoDron) {
        id = contador;
        contador++;
        this.horasVuelo = horasVuelo;
        this.estadoDron = estadoDron;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public Estado getEstadoDron() {
        return estadoDron;
    }

    @Override
    public String toString() {
        return "id: " + id + ", horasVuelo: " + horasVuelo + " ,estadoDron: " + estadoDron;
    }
    
    
    
}
