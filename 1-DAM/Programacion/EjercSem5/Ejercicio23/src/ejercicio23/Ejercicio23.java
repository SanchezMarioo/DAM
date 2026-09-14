/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        boolean[][] parking = new boolean[3][5];
        do {
            estadoPlazas(parking);
            siguentePlaza(parking);
            int opcion = mostrarMenu(sc);
            if (opcion == 4) {
                break;
            }
            switch (opcion) {
                case 1 -> {
                    aparcarCoche(sc, parking);
                }
                case 2 -> {
                    sacarCoche(sc, parking);
                }
                case 3 -> {
                    estadoParking(parking);
                }
                case 5 -> {
                    mostrarVisual(parking);
                }
                default -> {
                    System.out.println("Opcion no valida.");
                }
            }
        } while (true);
    }

    static int mostrarMenu(Scanner sc) {
        System.out.println("\n===== GESTIÓN DEL PARKING =====");
        System.out.println("1. Aparcar un coche");
        System.out.println("2. Sacar un coche");
        System.out.println("3. Mostrar estado del parking");
        System.out.println("4. Salir del programa");
        System.out.println("5. Mostrar de forma visual el estado");
        System.out.print("Selecciona una opción: ");
        int opcion = sc.nextInt();
        return opcion;
    }

    static int aparcarCoche(Scanner sc, boolean[][] parking) {
        int contadorOcupados = 0;
        System.out.print("Introduce la planta (0-2): ");
        int planta = sc.nextInt();
        System.out.print("Introduce el número de plaza (0-4): ");
        int plaza = sc.nextInt();
        int numeroPlaza = 3 * 5;
        if (contadorOcupados == numeroPlaza) {
            System.out.println("El parking está completo. No se pueden aparcar más coches.");
        }
        if ((planta < 0 || planta > 3) || (plaza < 0 || plaza > 5)) {
            System.out.println("Datos incorrectos. Planta o plaza no válida.");
        }
        if (parking[planta][plaza] == true) {
            System.out.println("No es posible aparcar: la plaza está ocupada.");
        } else {
            parking[planta][plaza] = true;
            System.out.println("Coche aparcado correctamente.");
        }
        return contadorOcupados;
    }

    static void sacarCoche(Scanner sc, boolean[][] parking) {
        System.out.print("Introduce la planta (0-2): ");
        int planta = sc.nextInt();
        System.out.print("Introduce el número de plaza (0-4): ");
        int plaza = sc.nextInt();
        if ((planta < 0 || planta > 2) || (plaza < 0 || plaza > 4)) {
            System.out.println("Datos incorrectos. Planta o plaza no válida.");
        }
        if (parking[planta][plaza]) {
            parking[planta][plaza] = false;
            System.out.println("Coche retirado correctamente.");
        } else {
            System.out.println("No hay ningún coche en esa plaza.");
        }
    }

    static void estadoParking(boolean[][] parking) {
        System.out.println("========== ESTADO DEL PARKING ==========");
        for (int i = 0; i < 3; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Planta " + i);
            System.out.println("---------------------------------------");
            for (int j = 0; j < 5; j++) {
                if (parking[i][j]) {
                    System.out.println("Planta " + i + " | Plaza " + j + " -> OCUPADA");
                } else {
                    System.out.println("Planta " + i + " | Plaza " + j + " -> LIBRE");
                }
            }
        }
        System.out.println("=======================================");

    }

    static void estadoPlazas(boolean[][] parking) {
        int plazasOcupadas = 0;
        int plazasLibres = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (parking[i][j] == true) {
                    plazasOcupadas++;
                } else {
                    plazasLibres++;
                }
            }
        }
        System.out.println("Plazas ocupadas: " + plazasOcupadas);
        System.out.println("Plazas libres: " + plazasLibres);
    }

    static void siguentePlaza(boolean[][] parking) {
        boolean noEntre = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (!noEntre) {
                    if (parking[i][j] == false) {
                        noEntre = true;
                        System.out.println("Primera plaza libre disponible en planta " + (i) + ", plaza " + (j));
                        break;
                    }
                }
            }
        }
    }

    static void mostrarVisual(boolean[][] parking) {
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                if (parking[i][j] == false) {
                    System.out.print("X" + " ");
                } else {
                    System.out.print("O" + " ");
                }
            }
        }
        System.out.println("");
    }
}
