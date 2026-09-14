/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;


/**
 *
 * @author mario.sanper.2
 */
public class Caja<T> {
    private T contenido;

    public void añadirElemento(T contenido) {
        this.contenido = contenido;
    }

    public boolean estaVacio() {
        if (contenido == null) {
            return true;
        } else {
            return false;
        }
    }

    public T recuperarObjeto() {
        return contenido;
    }
}
