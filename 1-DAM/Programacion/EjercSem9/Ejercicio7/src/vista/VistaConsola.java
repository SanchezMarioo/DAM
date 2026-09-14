/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class VistaConsola {
    private Scanner sc = new Scanner(System.in);
    public void mostrarMsg(String msg){
        System.out.println(msg);
    }
    public String pedirTexto(){
        return sc.nextLine();
    }
    public double pedirNota(){
        while(!sc.hasNextDouble()){
            mostrarMsg("No es numero");
            sc.nextLine();
        }
        return sc.nextDouble();
    }
    public void limpiarBuffer(){
        sc.nextLine();
    }
}
