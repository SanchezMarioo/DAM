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
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Dime un numero: ");
            try {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero == 0) {
                    System.out.println("La suma es: " + leerArchivo());
                    break;

                }
                escribirNumero(numero);
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                sc.nextLine();
            }
        } while (true);

    }

    static void escribirNumero(int numero) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("numeros.txt", true));
            bw.write(String.valueOf(numero));
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

    static int leerArchivo() {
        BufferedReader br = null;
        String linea = "";
        int suma = 0;
        try {
            br = new BufferedReader(new FileReader("numeros.txt"));
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    int numero = Integer.parseInt(linea);
                    suma += numero;
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());

                }
            }
        }
        return suma;
    }
}
