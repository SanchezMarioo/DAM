/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterface;

/**
 *
 * @author mario.sanper.2
 */
public class Lobo extends Animal implements Sonido {

    public Lobo(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Auh auh!! ");
    }
}
