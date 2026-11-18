/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ejer_vuelo_objetos;

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
        
        File directorio = new File("datos");
        File archivo = new File(directorio, "vuelos.dat");
        existeArchivo(directorio);

        ArrayList<Vuelo> listaVuelos = new ArrayList<>();

        // 2. Crear los 5 objetos Vuelo
        Vuelo v1 = new Vuelo("Iberia", "Madrid", "París", 120.50);
        Vuelo v2 = new Vuelo("Ryanair", "Barcelona", "Roma", 45.99);
        Vuelo v3 = new Vuelo("Air Europa", "Madrid", "Buenos Aires", 650.00);
        Vuelo v4 = new Vuelo("Vueling", "Sevilla", "Londres", 89.90);
        Vuelo v5 = new Vuelo("Lufthansa", "Valencia", "Berlín", 175.30);
        // 3. Añadirlos a la lista
        listaVuelos.add(v1);
        listaVuelos.add(v2);
        listaVuelos.add(v3);
        listaVuelos.add(v4);
        listaVuelos.add(v5);
        existeArchivo(directorio);
        escribirFichero(archivo, listaVuelos);
        leerArchivo(archivo);
    }

    static void existeArchivo(File directorio) {

        if (!directorio.exists() || !directorio.isDirectory()) {
            try {
                directorio.mkdirs();
                
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
       
    }

    static void escribirFichero(File f, ArrayList<Vuelo> vuelos) {
        
        
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f,true));
            for (Vuelo vuelo : vuelos) {
                oos.writeObject(vuelo);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());

                }
            }
        }

    }

    static void leerArchivo(File f) {
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
        } catch (IOException | ClassNotFoundException  | ClassCastException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }
}
