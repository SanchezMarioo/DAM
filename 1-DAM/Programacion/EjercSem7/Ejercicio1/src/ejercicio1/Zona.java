/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author mario.sanper.2
 */
public enum Zona {
    NORTE(0),
    SUR(1),
    ESTE(2),
    OESTE(3);
    private int numZona;

    Zona(int numZona) {
        this.numZona = numZona;
    }

    public int getNumZona() {
        return numZona;
    }

}
