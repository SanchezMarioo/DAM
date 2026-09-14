/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaControlador {
    private Scanner sc;

    public VistaControlador() {
        sc = new Scanner(System.in);
    }
    
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public String pedirMensaje(String frase){
        System.out.println(frase);
        return sc.nextLine();
    }
}
