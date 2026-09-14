/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_ejercicio;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class String_Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String datos
                = "ENV1001|Madrid|Barcelona|ENVIADO#"
                + "ENV1002|Sevilla|Madrid|PENDIENTE#"
                + "ENV1003|Valencia|Bilbao|CANCELADO#"
                + "ENV1004|Madrid|Valencia|ENVIADO#"
                + "ENV1005|Bilbao|Madrid|PENDIENTE";
        do {
            mostrarMenu();
            int opcion = comprobarRango(sc, 1, 5, "Opcion: ");
            switch (opcion) {
                case 1 -> {
                    mostrarEnvios(datos);
                }
            }
        } while (true);

    }

    static void mostrarEnvios(String datos) {
        String separar[] = datos.split("#");
        for (int i = 0; i < separar.length; i++) {
            String[] campos = separar[i].split("\\|");
            for (int j = 0; j < campos.length; j++) {
                System.out.print(campos[j] + " ");
            }
            System.out.println("");
        }
    }

    static void mostrarMenu() {
        System.out.println("1. Mostrar todos los envíos");
        System.out.println("2. Mostrar envíos por estado");
        System.out.println("3. Contar envíos por ciudad destino");
        System.out.println("4. Mostrar ciudad con más envíos recibidos");
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

}
