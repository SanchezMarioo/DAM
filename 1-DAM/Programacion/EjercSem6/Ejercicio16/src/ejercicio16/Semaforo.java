/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author MARIO
 */
public class Semaforo {
    private ColorSemaforo color;

    /**
     * 
     * @param color Enum ROJO,AMARILLO,VERDE 
     */
    public Semaforo(ColorSemaforo color) {
        this.color = color;
    }

    public void setColor(ColorSemaforo color) {
        this.color = color;
    }
    public void mostrarEstado(){
        System.out.println("El semaforo esta de color: " + color);
    }
}
