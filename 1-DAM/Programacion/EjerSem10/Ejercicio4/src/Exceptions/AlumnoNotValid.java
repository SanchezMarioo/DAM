/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Mario
 */
public class AlumnoNotValid extends Exception {

    /**
     * Creates a new instance of <code>AlumnoNotValid</code> without detail
     * message.
     */
    public AlumnoNotValid() {
    }

    /**
     * Constructs an instance of <code>AlumnoNotValid</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AlumnoNotValid(String msg) {
        super(msg);
    }
}
