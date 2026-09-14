/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apuesta_dados;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Apuesta_Dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int monedas = 100;
        do {
            // Salimos del bucle antes de que se muestre el menu
            if (monedas <= 0) {
                System.out.println("¡Te has quedado sin monedas!");
                break;
            }
            mostrarMenu();
            int opcion = comprobacionNumMensaje(sc, 1, 3, "Opcion: ");
            if (opcion == 3) {
                break;
            }

            switch (opcion) {
                case 1 -> {
                    monedas = apostar(sc, monedas);
                }
                case 2 -> {
                    mostrarEstado(monedas);
                }
                case 3 -> {
                    System.out.println("¡Gracias por jugar!");
                }
            }
        } while (true);
    }

    static void mostrarMenu() {
        System.out.println("1. Apostar");
        System.out.println("2. Mostrar estado");
        System.out.println("3. Salir");
    }

    static int apostar(Scanner sc, int monedas) {
        int apuesta = comprobacionNumMensaje(sc, 1, monedas, "Cantidad a apostar: ");
        int[] dados = tirarDados();
        System.out.println("Dados lanzados: [" + dados[0] + "," + dados[1] + "]");
        int resultadoApuesta = evaluarResultado(dados, apuesta);
        // En caso de que sea doble
        monedas += resultadoApuesta;
        return monedas;
    }

    static void mostrarEstado(int monedas) {
        System.out.println("¡Te quedan " + monedas + " restantes.");
    }

    static int[] tirarDados() {
        final int NUMERO_MINIMO = 1;
        final int NUMERO_MAXIMO = 6;
        final int DADOS_TIRADOS = 2;
        int[] dados = new int[DADOS_TIRADOS];
        for (int i = 0; i < DADOS_TIRADOS; i++) {
            int numeroRandom = (int) (Math.random() * NUMERO_MAXIMO) + NUMERO_MINIMO;
            dados[i] = numeroRandom;
        }
        return dados;
    }

    static int evaluarResultado(int[] dados, int apuesta) {
        int sumaTotal = 0;
        for (int i = 0; i < dados.length; i++) {
            sumaTotal += dados[i];
        }
        if (dados[0] == dados[1]) {
            System.out.println("¡Dobles! Ganas " + apuesta * 2 + " monedas.");
            return apuesta * 2;
        } else if (sumaTotal == 7) {
            System.out.println("Suma = 7 ? pierdes " + apuesta + " monedas.");
            return -apuesta;
        } else if (sumaTotal == 11) {
            System.out.println("Suma -> " + sumaTotal + " Has ganado la apuesta!");
            return apuesta;
        } else {
            int mitad = apuesta / 2;
            System.out.println("Otro resultado ? pierdes la mitad: " + mitad);
            return -mitad ;
        }
    }

    static int comprobacionNumMensaje(Scanner sc, int minimo, int maximo, String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("No has introducido un numero");
            sc.next();
        }
        int numero;
        do {
            numero = sc.nextInt();
            if (numero < minimo || numero > maximo) {
                System.out.println("No has introducido un numero entre " + minimo + " y " + maximo);
            }
        } while (numero < minimo || numero > maximo);
        return numero;
    }
}
