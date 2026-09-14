/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author mario.sanper.2
 */
public enum Estado {
    EN_REVISION(0),
    ACTIVO(1);
    private int numEstado;

    private Estado(int numEstado) {
        this.numEstado = numEstado;
    }
    
    
}
