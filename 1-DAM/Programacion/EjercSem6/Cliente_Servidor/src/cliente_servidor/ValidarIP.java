/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente_servidor;

/**
 *
 * @author Mario
 */
public class ValidarIP {

    /**
     * Comprueba si es una IP es valida
     *
     * @param ip ip que va a comprobar
     * @return true si es correcta, false si es contraria
     */
    public static boolean comprobarIP(String ip) {
        if (ip.trim().isEmpty() || ip == null) {
            return false;
        }
        String[] octetos = ip.split("\\.");
        // Se comprueba si hay 4 . 
        if (octetos.length != 4) {
            return false;
        }
        for (int i = 0; i < octetos.length; i++) {
            String octeto = octetos[i];
            if(octeto.isEmpty()){
                return false;
            }
            for (int j = 0; j < octeto.length(); j++) {
                if (!Character.isDigit(octeto.charAt(j))) {
                    return false;
                }
            }
        }

        int obtetosNumeros[] = new int[octetos.length];
        for (int i = 0; i < octetos.length; i++) {
            obtetosNumeros[i] = Integer.parseInt(octetos[i]);
        }
        for (int i = 0; i < obtetosNumeros.length; i++) {
            if (obtetosNumeros[i] < 0 || obtetosNumeros[i] > 255) {
                return false;
            }
        }
        // IP valida
        return true;
    }
}
