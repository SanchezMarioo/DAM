/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflotarefactor;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class HundirLaFlotaRefactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constantes y configuración
        final int TAMAÑO = 8;
        final char BARCO = 'X';
        final char VACIO = '#';
        final char FALLA = 'O';

        char[][] matrizInterna = new char[TAMAÑO][TAMAÑO];
        char[][] matrizVisible = new char[TAMAÑO][TAMAÑO];
        int[] barcos = {4, 3, 2}; // Tamaños de la flota
        int metaAciertos = 9;     // Total de casillas de barco
        char repetir = 0;

        do {
            int aciertosTotales = 0;
            int intentosFallidos = 0;
            int barcoPosicion = 0;

            // 1. Inicializar tableros vacíos
            for (int i = 0; i < TAMAÑO; i++) {
                for (int j = 0; j < TAMAÑO; j++) {
                    matrizInterna[i][j] = VACIO;
                    matrizVisible[i][j] = VACIO;
                }
            }

            // 2. Colocar barcos aleatoriamente
            while (barcoPosicion < barcos.length) {
                boolean esRep = false;
                boolean esVertical = Math.random() < 0.5;
                int fila = (int) (Math.random() * TAMAÑO);
                int col = (int) (Math.random() * TAMAÑO);

                int filaTemp = fila;
                int colTemp = col;

                // Validar posición y perímetros
                for (int i = 0; i < barcos[barcoPosicion]; i++) {
                    // Verificar límites del tablero
                    if (filaTemp < 0 || filaTemp >= TAMAÑO || colTemp < 0 || colTemp >= TAMAÑO) {
                        esRep = true;
                        break;
                    }
                    // Verificar si ya está ocupado
                    if (matrizInterna[filaTemp][colTemp] == BARCO) {
                        esRep = true;
                        break;
                    }
                    // Verificar si toca otros barcos (arriba, abajo, lados)
                    if (filaTemp > 0 && matrizInterna[filaTemp - 1][colTemp] == BARCO) {
                        esRep = true;
                    }
                    if (filaTemp < TAMAÑO - 1 && matrizInterna[filaTemp + 1][colTemp] == BARCO) {
                        esRep = true;
                    }
                    if (colTemp > 0 && matrizInterna[filaTemp][colTemp - 1] == BARCO) {
                        esRep = true;
                    }
                    if (colTemp < TAMAÑO - 1 && matrizInterna[filaTemp][colTemp + 1] == BARCO) {
                        esRep = true;
                    }

                    if (esRep) {
                        break;
                    }
                    if (esVertical) {
                        filaTemp++;
                    } else {
                        colTemp++;
                    }
                }

                // Si la posición es válida, fijar barco
                if (!esRep) {
                    for (int i = 0; i < barcos[barcoPosicion]; i++) {
                        matrizInterna[fila][col] = BARCO;
                        if (esVertical) {
                            fila++;
                        } else {
                            col++;
                        }
                    }
                    barcoPosicion++;
                }
            }

            // 3. Inicio del Juego
            boolean partidaTerminada = false;
            while (!partidaTerminada) {

                // Mostrar tablero visible
                System.out.print("  ");
                for (int j = 1; j <= TAMAÑO; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();

                for (int i = 0; i < TAMAÑO; i++) {
                    System.out.print((char) ('A' + i) + " ");
                    for (int j = 0; j < TAMAÑO; j++) {
                        System.out.print(matrizVisible[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.print("Introduce las coordenadas (ejemplo A1) o FIN: ");
                String coordenadas = sc.nextLine();

                if (coordenadas.equalsIgnoreCase("FIN")) {
                    partidaTerminada = true;
                    break;
                }

                if (coordenadas.length() != 2) {
                    System.out.println("Formato incorrecto");
                    continue;
                }

                char colChar = coordenadas.charAt(0);
                int col = Integer.parseInt(coordenadas.substring(1)) - 1;
                int fila = -1;
                if (col < 0 || col >= TAMAÑO) {
                    System.out.println("Columna fuera de rango.");
                    continue;
                }
                switch (colChar) {
                    case 'A' ->
                        fila = 0;
                    case 'B' ->
                        fila = 1;
                    case 'C' ->
                        fila = 2;
                    case 'D' ->
                        fila = 3;
                    case 'E' ->
                        fila = 4;
                    case 'F' ->
                        fila = 5;
                    case 'G' ->
                        fila = 6;
                    case 'H' ->
                        fila = 7;
                    default -> {
                        System.out.println("Columna no válida");
                        continue;
                    }
                }

                // Verificar disparo
                if (matrizVisible[fila][col] != VACIO) {
                    System.out.println("Ya has disparado ahí.");
                    continue;
                }

                if (matrizInterna[fila][col] == BARCO) {
                    matrizVisible[fila][col] = BARCO;
                    aciertosTotales++;
                    System.out.println("¡Tocado!");
                } else {
                    matrizVisible[fila][col] = FALLA;
                    intentosFallidos++;
                    System.out.println("Agua.");
                }

                // Comprobar victoria
                if (aciertosTotales == metaAciertos) {
                    System.out.println("\n? ¡ENHORABUENA! Has hundido toda la flota enemiga.");
                    System.out.println("Tablero Final:");
                    System.out.print("  ");
                    for (int j = 1; j <= TAMAÑO; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                    for (int i = 0; i < TAMAÑO; i++) {
                        char letra = (char) ('A' + i);
                        System.out.print(letra + " ");
                        for (int j = 0; j < TAMAÑO; j++) {
                            System.out.print(matrizVisible[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("Intentos fallidos: " + intentosFallidos);
                    if (intentosFallidos < 8) {
                        System.out.println("Rango: ? Comandante de Élite");
                    } else if (intentosFallidos < 15) {
                        System.out.println("Rango: ? Capitán");
                    } else {
                        System.out.println("Rango: ? Cadete en prácticas");
                    }

                    partidaTerminada = true;
                }
            } // Preguntar si repetir
            System.out.print("¿Jugar otra vez? (S/N): ");
            repetir = sc.nextLine().toUpperCase().charAt(0);
        } while (repetir == 'S');

        System.out.println("Fin del juego.");
    }
}
