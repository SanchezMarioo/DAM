/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double entradasInfantiles, entradasAdultos,sumaTotal;
        Scanner sc = new Scanner (System.in);
        final float PRECIO_INFANTIL = 15.50f;
        final float PRECIO_ADULTO = 20f;
        System.out.print("¿Cuantas entradas infantiles quiere?: ");
        entradasInfantiles = sc.nextInt();

        entradasInfantiles = entradasInfantiles * PRECIO_INFANTIL;
        
        System.out.print("¿Cuantas entradas adulto quiere?: ");
        entradasAdultos = sc.nextInt();
  
        entradasAdultos = entradasAdultos * PRECIO_ADULTO;
        sumaTotal = entradasInfantiles + entradasAdultos;
        System.out.println("Las entradas en total son: " + sumaTotal);
        
        
        
    }
    
}
