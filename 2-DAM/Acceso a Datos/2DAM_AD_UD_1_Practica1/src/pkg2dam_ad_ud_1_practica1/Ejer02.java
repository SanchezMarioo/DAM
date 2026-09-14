/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud_1_practica1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Mario
 */
public class Ejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        crearArchivo("AD/P1.txt");
        crearArchivo("AD/UD1.txt");
        crearArchivo("AD/UD2.txt");
        crearArchivo("PSP/UD1.txt");
        crearArchivo("PSP/UD2.txt");
        crearArchivo("misNotas.txt");
    }

    static void crearArchivo(String rutaArchivo) {
        File archivo = new File("2DAM/" + rutaArchivo);
        if (archivo.exists()) {
            return;
        }
        try{
            File carpetaPadre = archivo.getParentFile();
            if(carpetaPadre != null && !carpetaPadre.exists()){
                carpetaPadre.mkdirs();
            }
            if(archivo.createNewFile()){
                System.out.println("El archivo se ha creado correctamente " + archivo.getName());
            }
            
        } catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
