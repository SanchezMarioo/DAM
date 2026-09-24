/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ejer_t1_hotel;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
    }

    static void leerHoteles(File archivo) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(archivo));
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (EOFException e) {
            try {
                ois.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void prepararArchivo(File archivo) {
        File directorio = archivo.getParentFile();
        if (!directorio.exists() || !directorio.isDirectory() || directorio != null) {
            directorio.mkdirs();
        }
        if (!archivo.isFile()) {
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    static void escribirHoteles(ArrayList<Hotel> hoteles, File archivo) {
        ObjectOutputStream ous = null;
        try {
            ous = new MyObjectOutputStream(new FileOutputStream(archivo, true));

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static void leerHoteles(File f) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            while (true) {
                System.out.println(ois.readObject());
            }
        } catch (EOFException e) {
            try {
                ois.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            // Añadir ClassCastException IMPORTANTE
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println(e.getMessage());
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
