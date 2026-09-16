/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud1_practica2;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio1 {

    static BufferedReader br = null;
    static BufferedWriter bw = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = null;
        BufferedReader br = null;
        try {
            bw = new BufferedWriter(new FileWriter("datos.txt", true));
            br = new BufferedReader(new FileReader("datos.txt"));

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                bw.close();
                br.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
        System.out.println("Dime el DNI: ");
        String dni = sc.nextLine();
        escribirFicheros("DNI: " + dni);
        System.out.println("Dime el nombre: ");
        String nombre = sc.nextLine();
        escribirFicheros("Nombre: " + nombre);
        System.out.println("Dime el apellidos: ");
        String apellidos = sc.nextLine();
        escribirFicheros("Apellidos: " + apellidos);
        System.out.println("Dime la fecha de nacimiento: ");
        String fechaNacimiento = sc.nextLine();
        escribirFicheros("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Dime el telefono: ");
        int telefono = sc.nextInt();
        escribirFicheros("Telefono: " + telefono);
        leerFicheros();
        sc.close();
    }

    static void escribirFicheros(String texto) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("datos.txt", true));
            bw.write(texto);
            bw.newLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }

    static void leerFicheros() {
        try {
            br = new BufferedReader(new FileReader("datos.txt"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                System.out.println("");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
