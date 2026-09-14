/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Escritura {
    private String texto;
    private BufferedWriter bf;
    private final String rutaEscrita;

    public Escritura(String rutaEscritura) {
        this.rutaEscrita = rutaEscritura;
    }


    public String getRutaEscrita() {
        return rutaEscrita;
    }
    public void escribirArchivo(String texto) throws IOException{
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(rutaEscrita))){
            bf.write(texto);
        }
    }
    
    
}
