/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public class Loro extends Aves {

    private String origen;
    private boolean habla;

    public Loro(String origen, boolean habla, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento, String estado) {
        super(pico, vuela, nombre, edad, fechaNacimiento, estado);
        this.origen = origen;
        this.habla = habla;
    }

    

    public String getOrigen() {
        return origen;
    }

    public boolean isHabla() {
        return habla;
    }
    @Override
    public void volar() {
        if (isVuela()) {
            System.out.println("Vuela");
        } else{
            System.out.println("No habla");
        }
    }

    @Override
    public void muestra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void habla() {
        if(isHabla()){
            System.out.println("Si habla");
        } else{
            System.out.println("NO habla");
        }
    }

}
