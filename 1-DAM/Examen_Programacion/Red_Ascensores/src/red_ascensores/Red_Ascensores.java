/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package red_ascensores;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Red_Ascensores {

    /**
     * @param args the command line arguments
     */
    public static final int PLANTA_BAJA = -2;
    public static final int PLANTA_SUPERIOR = 20;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int[][] origen;
        int[][] destino;
        int[][] personas;
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = comprobarRango(sc, 1, 5, "Opcion: ");
            switch (opcion) {
                case 1 -> {

                }
            }
        } while (true);
    }

    static void mostrarMenu() {
        System.out.println("1. Mostrar viajes de un ascensor");
        System.out.println("2. Estadísticas de un ascensor");
        System.out.println("3. Análisis global del edificio");
        System.out.println("4. Simulación de congestión");
        System.out.println("5. Salir");
    }

    static int comprobarRango(Scanner sc, int min, int max, String mensaje) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!sc.hasNextInt()) {
                System.out.println("No has introducido un numero.");
                sc.next();
            }
            numero = sc.nextInt();
            if (numero < min || numero > max) {
                System.out.println("El numero debe de estar entre " + min + " y " + max);
            } else {
                return numero;
            }
        } while (true);
    }

    static void rellenarMatrices(int[][] origen, int[][] destino, int[][] personas) {
        int origenNum;
        int destinoNum;
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen.length; j++) {
                origenNum = (int) (Math.random() * PLANTA_SUPERIOR - PLANTA_BAJA + 1) + PLANTA_BAJA;
                destinoNum = (int) (Math.random() * PLANTA_SUPERIOR - PLANTA_BAJA + 1) + PLANTA_BAJA;
                
                if (origenNum == destinoNum) {
                    i--;
                } else {
                    origen[i][j] = origenNum;
                    destino[i][j] = destinoNum;
                }
            }
        }
    }

}
