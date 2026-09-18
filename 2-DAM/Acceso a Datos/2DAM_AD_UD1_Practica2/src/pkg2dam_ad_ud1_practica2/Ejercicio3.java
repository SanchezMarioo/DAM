/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud1_practica2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String destinatario = pedirDatos("Dime el destinatario: ");
        String asunto = pedirDatos("Cual es el asunto del correo: ");
        String cuerpoCorreo = pedirDatos("Cual es el contenido del correo: ");
        String fecha = sacarFechaActual();
        escribirArchivo(destinatario, asunto, cuerpoCorreo, fecha);
        leerArchivo();
    }

    static String pedirDatos(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);

        try {
            return sc.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    static void leerArchivo() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("correos.txt"));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

    }

    static void escribirArchivo(String destinatario, String asunto, String cuerpoCorreo, String fecha) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("correos.txt", true));
            
            
            bw.write("Destinario: " + destinatario);
            bw.newLine();
            bw.write("Asunto: " + destinatario);
            bw.newLine();
            bw.write("Cuerpo del correo:  " + cuerpoCorreo);
            bw.newLine();
            bw.write("Fecha de nacimiento: " + fecha);
            bw.newLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    static String sacarFechaActual() {
        LocalDate fecha = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formato);
    }
}
