/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_cine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Gestor {

    private Cine c = new Cine();
    private Scanner sc = new Scanner(System.in);

    public void crearSala() {
        System.out.println("Dime el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Numero de filas: ");
        int filas = sc.nextInt();
        System.out.println("Numero de columnas: ");
        int columnas = sc.nextInt();
        c.añadirSala(new Sala(nombre, filas, columnas));
    }

    public Sala filtrarSalaPorNombre(String nombre) {
        ArrayList<Sala> salas = c.getSalas();
        for (Sala sala : salas) {
            if (sala.getNombreSala().equals(nombre)) {
                return sala;
            }
        }
        return null;
    }

    public void mostrarEstadoSala() {
        System.out.println("Dime el nombre de la sala: ");
        String nombre = sc.nextLine();
        Sala sala = filtrarSalaPorNombre(nombre);
        if (sala != null) {
            c.mostrarSala(sala);

        } else {
            System.out.println("La sala no existe.");
        }
    }

    public void realizarReserva() {
        String nombre = "";
        while (!Cliente.validarNombre(nombre)) {
            System.out.println("Nombre del cliente: ");
            nombre = sc.nextLine();
        }
        String email = "";
        while (!Cliente.validarEmail(email)) {
            System.out.println("Nombre del cliente: ");
            nombre = sc.nextLine();
        }
        System.out.println("Dime el nombre de la sala: ");
        String nombreSala = sc.nextLine();
        Sala sala = filtrarSalaPorNombre(nombre);
        if(sala == null){
            System.out.println("La sala no existe.");
            return;
        }
        
    }
}
