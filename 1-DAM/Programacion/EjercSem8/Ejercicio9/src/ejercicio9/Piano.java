/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author MARIO
 */
public class Piano extends Instrumento {

    @Override
    protected void interpretar() {
        for (Nota nota : melodia) {
            System.out.print(nota.name() + " * ");
        }
    }
    
    
    
    
}
