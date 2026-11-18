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
public class Ejer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String RUTA = "2DAM";
        File file = new File(RUTA);
        File[] archivos = file.listFiles();
        for (File archivo : archivos) {
            System.out.println("[" + archivo.getName() + "]:");
            if (archivo.isDirectory()) {
                String archivosRuta[] = archivo.list();
                for (String archivoDirectorio : archivosRuta) {
                    if (archivoDirectorio.endsWith(".txt")) {
                        System.out.println(archivoDirectorio);
                    }
                }

            } else {
                System.out.println("- " + archivo.getName());
            }
        }

    }
}
