/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisis_sensores;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Analisis_Sensores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        do {
            mostrarMenu();
            int numSensores = mostrarMensaje(sc, 1, "Numero de sensores: ");
            int HORAS = 24;
            int[][] sensores = new int[numSensores][HORAS];
            int opcion = mostrarMensaje(sc, 1, 4, "Opcion: ");
            switch (opcion) {
                case 1 -> {

                }
            }
        } while (true);

    }

    static void mostrarMenu() {
        System.out.println("1. Mostrar lecturas de un sensor");
        System.out.println("2. Calcular estadísticas de un sensor");
        System.out.println("3. Analizar el edificio completo");
        System.out.println("4. Salir");
    }
    static int mostrarLecturasSensor()
    static int mostrarMensaje(Scanner sc, int min, int maximo, String mensaje) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("No has introducido un numero");
                sc.next();
            }
            numero = sc.nextInt();
            if (numero < min || numero > maximo) {
                System.out.println("El numero debe de estar entre " + min + " y " + maximo);
            } else {
                return numero;
            }
        } while (true);
    }

    static int mostrarMensaje(Scanner sc, int min, String mensaje) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("No has introducido un numero");
                sc.next();
            }
            
            numero = sc.nextInt();
            if (numero < min) {
                System.out.println("El numero debe de ser mayor a " + min);
            } else {
                return numero;
            }
        } while (true);

    }

}
