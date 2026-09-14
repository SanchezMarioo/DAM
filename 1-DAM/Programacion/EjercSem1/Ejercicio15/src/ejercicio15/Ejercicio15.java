/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,x, resultado ;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce coeficiente a: ");
        a = sc.nextInt();
        System.out.print("Introduce coeficiente b: ");
        b = sc.nextInt();
        System.out.print("Introduce coeficiente c: ");
        c = sc.nextInt();
        System.out.print("Introduce coeficiente x: ");
        x = sc.nextInt();
        resultado = (int) (a * Math.pow(x, 2)) + (b * x) + c;
        System.out.println(resultado);
        
    }
    
}
