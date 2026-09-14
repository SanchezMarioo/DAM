/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Lector {

    private Scanner in = null;
    private String texto = "";
    private double suma = 0;
    private double mediaAritmetica = 0;
    private int contador;

    public Lector() {
        try {
            in = new Scanner(new File("datos/datos.txt"));
            extraerTexto();
            

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } finally { //pase lo que pase cerramos el flujo
            if (contador > 0) {
                System.out.println("Media aritmetica es : " + suma / contador);
                System.out.println("Suma: " + suma);
            }
            if (in != null) {
                in.close();
            }
        }
    }

    public void extraerTexto() {
        double numero = 0;
        while (in.hasNext()) {
            if (in.hasNextDouble()) {
                numero = in.nextDouble();
                suma += numero;
                contador++;
            } else {
                in.next();
            }

        }
    }

}
