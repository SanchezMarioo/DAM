/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frasePrimera,fraseSegunda;
        int longitudPrimera,longitudSegunda;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime la primera frase:");
        frasePrimera = sc.nextLine();
        System.out.println("Dime la segunda frase:");
        fraseSegunda = sc.nextLine();
        
        longitudPrimera = frasePrimera.length();
        longitudSegunda = fraseSegunda.length();
        
        if(longitudPrimera > longitudSegunda ){
            System.out.println("La frase primera es mayor que la segunda");
        } else if (longitudPrimera == longitudSegunda ){
            System.out.println("La frase primera es igual que la segunda");
        } else {
            System.out.println("La frase primera es menor que la segunda");
        }
    }
    
}
