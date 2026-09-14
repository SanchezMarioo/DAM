/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaConsola {

    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public void mostrarMensajeError(String msg) {
        System.err.println(msg);
    }

    public String pedirMensaje(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    public int pedirNumero(String msg) {
        System.out.println(msg);
        while (!sc.hasNextInt()) {
            System.out.println("No es numero");
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public void mostrarAlumnos(ArrayList<Alumno> listaAlumnos) {
        if (listaAlumnos == null || listaAlumnos.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (Alumno listaAlumno : listaAlumnos) {
                System.out.println(listaAlumno);
            }
        }
    }

    public void mostrarMenu() {
        System.out.println("1. Mostrar lista de alumnos");
        System.out.println("2. Insertar usuario");
        System.out.println("3. Borrar alumno mediante su ID");
        System.out.println("4. Mostrar lista de alumnos al reves");
    }
    public void cerrarScanner(){
        sc.close();
    }
}
