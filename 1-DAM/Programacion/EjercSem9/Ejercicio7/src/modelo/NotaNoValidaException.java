/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package modelo;

/**
 *
 * @author MARIO
 */
public class NotaNoValidaException extends Exception {

    /**
     * Creates a new instance of <code>NotaNoValidaException</code> without
     * detail message.
     */
    public NotaNoValidaException() {
    }

    /**
     * Constructs an instance of <code>NotaNoValidaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotaNoValidaException(String msg) {
        super(msg);
    }
}
