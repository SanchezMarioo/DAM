/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio20;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Gestor {

    private Scanner sc;
    private ArrayList<Usuario> usuarios;
    private ServicioLogin login;

    public Gestor() {
        sc = new Scanner(System.in);
        usuarios = new ArrayList<>();
        login = new ServicioLogin();
        cargarDatos();
    }

    public void init() {
        System.out.println("Introduce nombre del usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.println("Introduce contraseña : ");
        String contraseña = sc.nextLine();
        try {
            Usuario usuario = login.comprobarUsuario(usuarios, nombreUsuario, contraseña);
            System.out.println("Acceso concedido. Bienvenido/a! " + nombreUsuario);
        } catch (LoginException e) {
            System.err.println(e.getMessage());
        }

    }

    private void cargarDatos() {
        usuarios.add(new Usuario("Ana", "1234"));
        usuarios.add(new Usuario("Pepe", "12"));
        usuarios.add(new Usuario("Alberto", "1212"));
    }

}
