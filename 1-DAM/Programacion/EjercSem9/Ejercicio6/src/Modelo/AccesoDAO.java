/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class AccesoDAO {

    private final String ruta = "acceso.txt";
    private BufferedWriter escritor;
    private BufferedReader lector;

    public void escribir(String cadena) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta, true))) {
            escritor.write(cadena);
            escritor.newLine(); 
            escritor.write("-----------------------"); 
            escritor.newLine();

        }
    }

    public ArrayList<String> leer() throws FileNotFoundException, IOException {
        ArrayList<String> contenido = new ArrayList<>();
        String linea;
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            while ((linea = lector.readLine()) != null) {
                contenido.add(linea);
            }
        }
        return contenido;
    }
}
