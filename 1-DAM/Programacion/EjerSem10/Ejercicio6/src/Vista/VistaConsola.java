/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Libro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class VistaConsola {
    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
    public String pedirMsg(String msg){
        System.out.println(msg);
        return sc.nextLine();
    }
    public void mostrarAlumnos(ArrayList<Libro> listaLibros) {
        if (listaLibros == null || listaLibros.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (Libro libro : listaLibros) {
                System.out.println(libro);
            }
        }
    }
}
