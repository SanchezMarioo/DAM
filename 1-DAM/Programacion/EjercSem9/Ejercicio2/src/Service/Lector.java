/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

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
public class Lector {

    private FileReader file = null;
    private BufferedReader in = null;
    private String linea = "";
    private double suma = 0;
    private double mediaAritmetica = 0;
    private final String ruta = "datos/datos.txt";
    private int contadorTotal = 0;

    public Lector() {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            this.in = br;
            if (in != null || !linea.isEmpty()) {
                extraerTexto();
                transformarNumeros();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void extraerTexto() {
        try {
            while (linea  != null) {
                linea = in.readLine();
                if(linea != null){
                   transformarNumeros(); 
                }
                
            }
        } catch (IOException e) {
            System.out.println("Error lectura");
        }
    }

    private void transformarNumeros() {
        if ( linea.trim().isEmpty()) {
            return;
        }
        String[] numerosCadena = linea.split(" ");
        try {
            for (int i = 0; i < numerosCadena.length; i++) {
                if (numerosCadena[i] != "") {
                    double numero = Double.parseDouble(numerosCadena[i]);
                    suma += numero;

                }
            }
            contadorTotal++;
        } catch (NumberFormatException e) {
            System.out.println("No es un numero");
        }
        if (numerosCadena.length > 0 || numerosCadena != null) {
            System.out.println("----- LINEA " + contadorTotal + " ----------");
            System.out.println("Suma: " + suma);
            System.out.println("Media aritmetica: " + suma / (numerosCadena.length));
        }

    }

}
