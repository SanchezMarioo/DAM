/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pruebainterface;

/**
 *
 * @author mario.sanper.2
 */
public interface Sonido {
    int version = 1;
    void emitirSonido();
    
    default void durmiendo(){
        System.out.println("ZZZZZZZZZZZZZZZZ");
    }
    static void bostezo(){
        System.out.println("Aaaug");
    }
}
