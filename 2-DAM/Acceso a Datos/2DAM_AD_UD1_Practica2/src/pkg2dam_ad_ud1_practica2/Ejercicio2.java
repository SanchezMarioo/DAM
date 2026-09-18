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
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc;
    public static final String FICHERO_NUMEROS = "numeros.txt";
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        do {
            numero = pedirEntero(sc, "Dime un numero: ");

            if (numero == 0) {
                int total = sumarNumerosFichero();
                System.out.println("La suma es: " + total);
            } else {
                escribirNumero(numero);
            }
        } while (numero != 0);
    }

    private static int pedirEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = sc.nextInt();
                sc.nextLine(); // Limpia el salto de línea sobrante
                return valor;
            } catch (InputMismatchException ex) {
                System.err.println("Error: Introduce un número entero válido.");
                sc.nextLine(); // Limpia el valor erróneo del buffer
            }
        }
    }

    private static void escribirNumero(int numero) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(FICHERO_NUMEROS, true));
            bw.write(String.valueOf(numero));
            bw.newLine();
        } catch (IOException ex) {
            System.err.println("Error al escribir en el fichero: " + ex.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                    System.err.println("Error al cerrar el escritor: " + ex.getMessage());
                }
            }
        }
    }

    private static int sumarNumerosFichero() {
        BufferedReader br = null;
        int suma = 0;

        try {
            br = new BufferedReader(new FileReader(FICHERO_NUMEROS));
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    try {
                        suma += Integer.parseInt(linea);
                    } catch (NumberFormatException ex) {
                        System.err.println("Línea ignorada (no es un entero): '" + linea + "'");
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("El fichero no existe todavía: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("Error al leer el fichero: " + ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.err.println("Error al cerrar el lector: " + ex.getMessage());
                }
            }
        }
        return suma;
    }
}
