/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebainterface;

/**
 *
 * @author mario.sanper.2
 */
public class Piano implements Sonido{

    @Override
    public void emitirSonido() {
        System.out.println("Toca toca...");
    }
    
}
