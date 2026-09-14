/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Lector {

    private FileReader file = null;
    private BufferedReader in = null;
    private String texto = "";

    public Lector() {
        try {
            in = new BufferedReader(new FileReader("datos/datos.txt"));
            if (in != null) {
                extraerTexto();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } finally { //pase lo que pase cerramos el flujo
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el fichero");
                }
            }
        }
    }

    public void extraerTexto() {
        String linea = "";
        try {
            while (linea != null) {
                texto += linea + "\n";
                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error lectura");
        }
        System.out.println(texto);
    }

    private void transformarNumeros() {
        String[] numerosCadena = texto.split(" ");
        int[] numeros = new int[numerosCadena.length];
        try {
            for (int i = 0; i < numeros.length; i++) {
                int numero = Integer.parseInt(numerosCadena[i]);
                numeros[i] = numero;
            }
        } catch (NumberFormatException e) {
            System.out.println("No es un numero");
        }
      
    }

}
