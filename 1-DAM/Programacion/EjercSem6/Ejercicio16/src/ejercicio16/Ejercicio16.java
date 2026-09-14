/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author MARIO
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Semaforo semaforo1 = new Semaforo(ColorSemaforo.ROJO);
        semaforo1.mostrarEstado();
        semaforo1.setColor(ColorSemaforo.VERDE);
        semaforo1.mostrarEstado();
    }
    
}
