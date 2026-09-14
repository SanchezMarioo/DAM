/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_paquetes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Gestor {

    private Scanner sc = new Scanner(System.in);
    private Contenedor contenedor = new Contenedor();

    public void registrarPaquete() {
        String codigo = "";
        // Validar codigo
        do {
            System.out.println("Introduce el codigo del paquete: ");
            codigo = sc.nextLine();
            if (!validarCodEnvio(codigo)) {
                System.err.println("ERROR: Codigo no valido.");
            }
        } while (!validarCodEnvio(codigo));
        String nombreRemitente;
        do {
            System.out.println("Introduce el nombre del remitente: ");
            nombreRemitente = sc.nextLine();
            if (!validarNombre(nombreRemitente)) {
                System.err.println("ERROR: Nombre no valido.");
            }
        } while (!validarNombre(nombreRemitente));
        int peso;
        do {
            System.out.println("Dime el peso: ");
            peso = sc.nextInt();
            if (peso < 0) {
                System.err.println("El peso debe de ser mayor a 0 ");
            }
        } while (peso < 0);
        String prioridad;
        do {
            System.out.println("Dime el estado del paquete (NORMAL | URGENTE | EXPRESS): ");
            prioridad = sc.nextLine();
            if (prioridad.equals("NORMAL") || prioridad.equals("URGENTE") || prioridad.equals("EXPRESS")) {
                break;
            }
        } while (true);
        Paquete paquete = new Paquete(codigo, nombreRemitente, nombreRemitente, peso, prioridad);
        contenedor.añadir(paquete);
    }

    public boolean validarCodEnvio(String codigo) {
        if (codigo.matches("[A-Z]{3}-\\d{4}")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNombre(String nombre) {
        if (nombre.matches("^[A-Za-z ]+$")) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
