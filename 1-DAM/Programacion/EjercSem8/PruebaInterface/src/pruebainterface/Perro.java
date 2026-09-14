/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterface;

/**
 *
 * @author mario.sanper.2
 */
public class Perro extends Animal implements Sonido{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Guau gua ");
    }

    @Override
    public void durmiendo() {
        System.out.println("GrrrrZzzzzzzzzzzzzzz");
    }
    
    
}
