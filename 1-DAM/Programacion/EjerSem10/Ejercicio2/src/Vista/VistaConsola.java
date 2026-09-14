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
    
    public void mostrarMensaje(String msg){
        System.out.println(msg);
    }
    
    public void mostrarAlumnos(ArrayList <Alumno> listaAlumnos){
        if(listaAlumnos == null || listaAlumnos.isEmpty()){
            System.out.println("Lista vacia");
        } else{
            for (Alumno listaAlumno : listaAlumnos) {
                System.out.println(listaAlumno);
            }
        }
    }
}
