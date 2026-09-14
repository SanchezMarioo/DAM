/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Mario
 */
public class CosteInvalidoException extends Exception {

    /**
     * Creates a new instance of <code>CosteInvalidoException</code> without
     * detail message.
     */
    public CosteInvalidoException() {
    }

    /**
     * Constructs an instance of <code>CosteInvalidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CosteInvalidoException(String msg) {
        super(msg);
    }
}
