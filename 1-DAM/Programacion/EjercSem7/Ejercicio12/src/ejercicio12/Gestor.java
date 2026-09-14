/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Gestor {

    private Scanner sc;
    private AnalisisTexto texto;

    public Gestor() {
        sc = new Scanner(System.in);
        texto = new AnalisisTexto();
    }

    public void init() {
        int opcion = 0;
        do {
            mostrarMenu();
            System.out.println("Opcion: ");
            opcion = sc.nextInt();
            if (opcion == 7) {
                break;
            }
            funcionalidadMenu(opcion);
        } while (opcion != 7);
        sc.close();
    }

    private void mostrarMenu() {
        System.out.println("1. Mostrar el texto completo analizado");
        System.out.println("2. Buscar códigos de acceso de nivel básico");
        System.out.println("3. Buscar códigos de acceso privilegiado");
        System.out.println("4. Buscar identificadores internos del sistema");
        System.out.println("5. Buscar palabras clave sospechosas");
        System.out.println("6. Mostrar todas las coincidencias encontradas de todos los tipos");
        System.out.println("7. Salir");
    }

    private void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 -> {
                System.out.println(texto.getTextoAnalizar());
            }
            case 2 -> {
                texto.accesoNivelBasico();
            }
            case 3 -> {
                texto.accesoPriviligeado();
            }
            case 4 -> {
                texto.identificadoresInternos();
            }
            case 5 -> {
                texto.palabrasClaves();
            }

            case 6 -> {
                System.out.println("--- ACCESO NIVEL BÁSICO ---");
                texto.accesoNivelBasico();
                System.out.println("--- ACCESO PRIVILEGIADO ---");
                texto.accesoPriviligeado();
                System.out.println("--- IDENTIFICADORES INTERNOS ---");
                texto.identificadoresInternos();
                System.out.println("--- PALABRAS CLAVE SOSPECHOSAS ---");
                texto.palabrasClaves();
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
    }
}
