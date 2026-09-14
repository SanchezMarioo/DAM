/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud_1_practica1;

import java.io.File;

/**
 *
 * @author Mario
 */
public class Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String RUTA = "2DAM";
        File file = new File(RUTA);
        String[] archivos = file.list();
        for (String archivo : archivos) {
            System.out.println(archivo);
        }
    }
    
}
