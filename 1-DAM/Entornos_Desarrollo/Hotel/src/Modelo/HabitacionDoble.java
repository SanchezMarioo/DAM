/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MARIO
 */
public class HabitacionDoble extends Habitacion {

    public HabitacionDoble(int numero, String tipo, double precio, boolean disponible) {
        super(numero, tipo, precio, disponible);
    }

    @Override
    public String getFoto() {
        return "fotos/habitacion_doble.jpg";
    }
    
}
