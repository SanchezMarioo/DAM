/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebainterface;

/**
 *
 * @author mario.sanper.2
 */
public class PruebaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gato gato = new Gato("Gato");
        gato.emitirSonido();
        Perro perro = new Perro("Perro");
        perro.emitirSonido();
        Caracol caracol = new Caracol("Caracol");
        Piano piano = new Piano();
        piano.emitirSonido();
        perro.durmiendo();
        gato.durmiendo();
    }
    
}
