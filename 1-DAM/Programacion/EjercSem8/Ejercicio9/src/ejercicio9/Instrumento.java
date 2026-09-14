/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.Arrays;

/**
 *
 * @author MARIO
 */
public abstract class Instrumento {

    // Incializamos el array a 1 
    protected Nota[] melodia;
    private int contador;

    public void add(Nota n) {
        if (melodia == null) {
            melodia = new Nota[0];
        }

        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = n;
    }

    /**
     *
     */
    protected abstract void interpretar();
    
}
