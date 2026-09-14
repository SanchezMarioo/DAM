/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones_regulares;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Gestion {

    private Expr_Regulares texto = new Expr_Regulares();
    private Scanner sc = new Scanner(System.in);

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
                System.out.println(texto.getTexto());
            }
            case 2 -> {
                texto.accesoBasico();
            }
            case 3 -> {
                texto.accesoPrivilegiado();
            }
            case 4 -> {
                texto.identificadoresDelSistema();
            }
            case 5 -> {
                texto.palabrasSospechosas();
            }

            case 6 -> {
                System.out.println("--- ACCESO NIVEL BÁSICO ---");
                texto.accesoBasico();
                System.out.println("--- ACCESO PRIVILEGIADO ---");
                texto.accesoPrivilegiado();
                System.out.println("--- IDENTIFICADORES INTERNOS ---");
                texto.identificadoresDelSistema();
                System.out.println("--- PALABRAS CLAVE SOSPECHOSAS ---");
                texto.palabrasSospechosas();
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
    }
}
