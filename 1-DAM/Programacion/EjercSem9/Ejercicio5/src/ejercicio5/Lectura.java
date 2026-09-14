/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario.sanper.2
 */
public class Lectura {

    private FileReader fr;
    private BufferedReader br;
    private String texto = "";
    private String ruta;

    public Lectura(String ruta) {
        this.ruta = ruta;
    }

    public String leerArchivo() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = "";
            while ((linea = br.readLine()) != null) {
                texto += linea + "\n";
            }
            return texto;
        }

    }

}
