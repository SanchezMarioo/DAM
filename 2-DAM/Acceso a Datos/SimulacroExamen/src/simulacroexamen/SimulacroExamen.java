/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroexamen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario.sanper.2
 */
public class SimulacroExamen {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static final String directorio = "equipos";
    static final String archivo = "equipos.dat";
    static final File archivoFile = new File(directorio, archivo);

    public static void main(String[] args) {
        // TODO code application logic here

        prepararDirectorioSimulacro(directorio, archivo);
        int opcion = -1;
        do {
            menuPrincipal();
            System.out.println("Escoge una opcion: ");

            opcion = sc.nextInt();
            
            funcionalidadMenu(opcion);

        } while (opcion != 3);
    }

    static void menuPrincipal() {
        System.out.println("1. Leer archivo");
        System.out.println("2. Escribir nuevo equipo: ");
        System.out.println("3. Salir");
    }

    static void prepararDirectorioSimulacro(String carpeta, String archivo) {

        File directorio = new File(carpeta);

        if (!directorio.exists()) {
            directorio.mkdir();
            // Con mkdirs se crea subcarpetas
        }

        File archivoFile = new File(carpeta, archivo);
        if (!archivoFile.exists() || archivoFile.length() == 0) {
            try {
                archivoFile.createNewFile();
                // Con el getPath() te devuelve la carpeta absoluta para que no de problemas
                crearDatosPorDefecto(archivoFile.getPath());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } 

        }
    }

    private static void crearDatosPorDefecto(String ruta) {
        DataOutputStream dos = null;
        Equipo equipo1 = new Equipo(5001, "Portatil", "Lenovo", "A12", 649.50);
        Equipo equipo2 = new Equipo(5002, "Sobremesa", "HP", "B03", 789.50);
        Equipo equipo3 = new Equipo(5003, "Monitor", "Samsung", "A12", 159.00);
        Equipo[] equipos = {equipo1, equipo2, equipo3};
        try {
             dos = new DataOutputStream(new FileOutputStream(ruta, true));
            for (Equipo equipo : equipos) {
                dos.writeInt(equipo.getNumeroEquipo());
                dos.writeUTF(equipo.getTipo());
                dos.writeUTF(equipo.getMarca());
                dos.writeUTF(equipo.getAula());
                dos.writeDouble(equipo.getPrecio());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally{
            try {
                dos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private static void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 -> {
                ArrayList<Equipo> equipos = leerEquipoDAT();
                for (Equipo equipo : equipos) {
                    System.out.println(equipo);
                }
            }
            case 2 -> {
                escribirExistiendo();
            }
            case 3 ->
                System.out.println("Saliendo del programa...");

            default ->
                System.out.println("Opcion no valida");
        }
    }

    private static ArrayList<Equipo> leerEquipoDAT() {
        ArrayList<Equipo> equipos = new ArrayList<>();
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(archivoFile));
            while (true) {
                int numeroInventario = dis.readInt();
                String tipo = dis.readUTF();
                String marca = dis.readUTF();
                String aula = dis.readUTF();
                double precio = dis.readDouble();
                equipos.add(new Equipo(numeroInventario, tipo, marca, aula, precio));

            }

        } catch (EOFException e) {

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

        return equipos;
    }

    private static void escribirExistiendo() {
        DataOutputStream dis = null;
        System.out.println("Dime el numero de inventario: ");
        int numeroInventario = sc.nextInt();

        if (numeroInventario <= 0) {
            System.out.println("El numero debe de ser mayor a 0");

        } else {
            if (!existeEquipo(numeroInventario)) {
                sc.nextLine();
                System.out.println("Dime el tipo de equipo: ");
                String tipo = sc.nextLine();
                System.out.println("Dime el marca de equipo: ");
                String marca = sc.nextLine();
                System.out.println("Dime el aula de equipo: ");
                String aula = sc.nextLine();
                System.out.println("Dime el precio de equipo: ");
                double precio = sc.nextDouble();
                try {
                    dis  = new DataOutputStream(new FileOutputStream(archivoFile, true));
                    dis.writeInt(numeroInventario);
                    dis.writeUTF(tipo);
                    dis.writeUTF(marca);
                    dis.writeUTF(aula);
                    dis.writeDouble(precio);
                    System.out.println("Creado equipo.");
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
            } else {
                System.out.println("Existe el equipo ");
            }

        }

    }

    private static boolean existeEquipo(int numeroInventario) {
        ArrayList<Equipo> equipos = leerEquipoDAT();
        for (Equipo equipo : equipos) {
            if (equipo.getNumeroEquipo() == numeroInventario) {
                return true;
            }
        }
        return false;
    }

}
