/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {

    private Scanner sc;
    private FileWriter writter;
    private BufferedWriter bf;
    private final String RUTA = "datos/prueba.txt";

    public Gestor() {
        sc = new Scanner(System.in);
        init();
    }

    public void init() {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(RUTA, true))) {
            do {
                System.out.println("Introduce la linea: ");
                String linea = sc.nextLine();
                if (linea.equalsIgnoreCase("FIN") || linea.isBlank()) {
                    break;
                }
                bf.write(linea);
                bf.newLine();
            } while (true);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
