/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c,raizCuadrada;
        double ecuacionPos,ecuacionNeg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la letra A:");
        a = sc.nextDouble();
        System.out.println("Dime la letra B:");
        b = sc.nextDouble();
        System.out.println("Dime la letra C:");
        c = sc.nextDouble();
        raizCuadrada = Math.pow(b, 2) - (4 * a * c);
        
        if((c == 0 ) || a == 0 || raizCuadrada < 0){
            System.out.println("No se puede hacer");
        }
        else{
            ecuacionPos = (-b + Math.sqrt(raizCuadrada)) / (2 * a);
            ecuacionNeg = (-b - Math.sqrt(raizCuadrada)) / (2 * a) ;
            if (ecuacionPos == ecuacionNeg){
                System.out.println("La ecuacion positiva y negativa son iguales: " + ecuacionPos);
            } else{
                System.out.println("X1 = " +ecuacionPos + " X2 = " + ecuacionNeg);
            }
            
        }
        
        
    }
    
}
