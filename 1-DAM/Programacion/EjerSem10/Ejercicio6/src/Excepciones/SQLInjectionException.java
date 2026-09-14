/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Excepciones;

/**
 *
 * @author mario.sanper.2
 */
public class SQLInjectionException extends Exception {

    /**
     * Creates a new instance of <code>SQLInjectionException</code> without
     * detail message.
     */
    public SQLInjectionException() {
    }

    /**
     * Constructs an instance of <code>SQLInjectionException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SQLInjectionException(String msg) {
        super(msg);
    }
}
