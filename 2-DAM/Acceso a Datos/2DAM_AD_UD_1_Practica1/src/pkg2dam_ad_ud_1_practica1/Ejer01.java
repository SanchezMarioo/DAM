/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud_1_practica1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Ejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo = new File("src/file001.txt");

        System.out.println("Nombre:" + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
        System.out.println("Directorio padre: " + archivo.getParent());
        if (archivo.exists()) {
            System.out.println("El archivo existe.");
        } else {
            System.out.println("El archivo no existe.");
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Permisos=(rwx) => " + archivo.canRead() + archivo.canWrite() + archivo.canExecute());
        System.out.println("Longitud del fichero " + archivo.length() + " bytes");
    }
}

