/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ejer_fichero_binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rutaArchivo = "matricula.dat";

        File file = new File(rutaArchivo);
        // Datos a guardar
        int numMatricula = 102;
        int edad = 20;
        double notaMedia = 8.5;
        int numModulos = 5;
        boolean matriculaCompleta = true;
        char grupo = 'A';

        // 1. Llamada al método de escritura
        escribirMatricula(file, numMatricula, edad, notaMedia, numModulos, matriculaCompleta, grupo);

        // 2. Llamada al método de lectura y muestra de datos
        leerMatricula(file);

    }

    private static void escribirMatricula(File file, int numMatricula, int edad, double notaMedia, int numModulos, boolean matriculaCompleta, char grupo) {
        DataOutputStream dos = null;
        try {

            dos = new DataOutputStream(new FileOutputStream(file));
            dos.writeInt(numMatricula);
            dos.writeInt(edad);
            dos.writeDouble(notaMedia);
            dos.writeInt(numModulos);
            dos.writeBoolean(matriculaCompleta);
            dos.writeChar(grupo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }

    private static void leerMatricula(File file) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(file));
            System.out.println("Matricula nº: " + dis.readInt());
            System.out.println("Edad: " + dis.readInt());
            System.out.println("Nota Media: " + dis.readDouble());
            System.out.println("Numero de modulos: " + dis.readInt());
            System.out.println("Matricula completa (true/false): " + dis.readBoolean());
            System.out.println("Grupo: " + dis.readChar());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }

}
