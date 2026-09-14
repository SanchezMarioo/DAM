/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author mario.sanper.2
 */
public class ValidarTexto {

    public static boolean comprobarTexto(String texto) {
        if (texto.matches("[A-Z]{2,4}[0-9]{2,3}")) {
            return true;
        } else {
            return false;
        }
    }
}
