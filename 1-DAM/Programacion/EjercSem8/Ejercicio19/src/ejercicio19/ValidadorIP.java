/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author mario.sanper.2
 */
public class ValidadorIP {

    private String validarIP = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";

    public void esValida(String direccion) throws ExceptionInvalidIP {
        if (direccion.matches(direccion)) {
            try {
                String[] obtetos = direccion.split("\\.");
                for (String obteto : obtetos) {
                    int obtetoIP = Integer.parseInt(obteto);
                    if (obtetoIP < 0 || obtetoIP > 255) {
                        throw new ExceptionInvalidIP();
                    }
                }
            } catch (NumberFormatException e) {
                throw new ExceptionInvalidIP();
            }
        } else {
            throw new ExceptionInvalidIP();
        }

    }
}
