/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio19B {

    /**
     * @param args the command line arguments
     */
    static final int OBJETOS_TEXTOS = 5;
    static Texto[] textos = new Texto[OBJETOS_TEXTOS];

    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            // Si sale de rango
            if (opcion < 0 || opcion > OBJETOS_TEXTOS) {
                System.out.println("Opcion no valida");
            }
            // En caso de ser cero 
            if (opcion == 0) {
                break;
            }
            int indice = opcion - 1;

            do {
                crearTextoSiNoExiste(indice, sc);
                mostrarMenuTexto();
                opcion = sc.nextInt();
                if (opcion == 0) {
                    break;
                }

                switch (opcion) {
                    // Añadir caracteres 
                    case 1 -> {
                        procesarCaracter(sc, indice);
                    }
                    case 2 -> {
                        procesarTexto(sc, indice);
                    }
                    case 3 -> {
                        System.out.println("Vocales: " + textos[indice].contarVocales());
                    }
                    case 4 -> {
                        textos[indice].mostrarInformacion();
                    }
                    default -> {
                        System.out.println("No has introducido un texto.");
                    }
                }
            } while (true);

        } while (true);
    }

    static void mostrarMenu() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.print("¿Con qué texto quieres trabajar? (1-" + OBJETOS_TEXTOS + "): ");
        System.out.println("0. Salir");
        System.out.print("Elige opción: ");
    }

    static void crearTextoSiNoExiste(int indice, Scanner sc) {
        if (textos[indice] == null) {
            System.out.println("Cual es el maximo de caracteres: ");
            int max = sc.nextInt();
            textos[indice] = new Texto(max);
        }
    }

    static void procesarCaracter(Scanner sc, int indice) {
        System.out.println("1.Añadir el caracter al principio: ");
        System.out.println("2.Añadir el caracter al final: ");
        System.out.println("Opcion: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> {
                System.out.println("Dime el caracter a añadir: ");
                char caracterAñadir = sc.next().charAt(0);
                sc.nextLine();
                textos[indice].añadirCaracteresPrincipio(caracterAñadir);

            }
            case 2 -> {
                System.out.println("Dime el caracter a añadir: ");
                char caracterAñadir = sc.next().charAt(0);
                sc.nextLine();
                textos[indice].añadirCaracteresPrincipio(caracterAñadir);
            }
            default -> {
                System.out.println("Opcion no valida.");
            }
        }
    }

    static void procesarTexto(Scanner sc, int indice) {
        System.out.println("1.Añadir una cadena al principio: ");
        System.out.println("2.Añadir una cadena al final: ");
        System.out.println("Opcion: ");
        int opcion2 = sc.nextInt();
        sc.nextLine();
        switch (opcion2) {
            case 1 -> {
                System.out.println("Dime el cadena a añadir: ");
                String cadenaAñadir = sc.nextLine();
                textos[indice].añadirCaracteresPrincipio(cadenaAñadir);

            }
            case 2 -> {
                System.out.println("Dime el cadena a añadir: ");
                String cadenaAñadir = sc.nextLine();
                textos[indice].añadirCaracteresFinal(cadenaAñadir);
                procesarCaracter(sc, indice);
            }
            default -> {
                System.out.println("Opcion no valida.");
            }
        }
    }

    static void mostrarMenuTexto() {
        System.out.println("\n--- MENÚ TEXTO ---");
        System.out.println("1. Añadir carácteres");
        System.out.println("2. Añadir cadenas");
        System.out.println("3. Contar vocales");
        System.out.println("4. Mostrar información");
        System.out.println("0. Volver");
        System.out.print("Opción: ");
    }
}
