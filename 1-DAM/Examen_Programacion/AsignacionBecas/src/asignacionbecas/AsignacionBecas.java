/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacionbecas;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class AsignacionBecas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double notaMedia = 0;
        int ingresosFamiliaresAnuales = 0;
        boolean estudiantePrimerAño = false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime la nota media: ");
        notaMedia = sc.nextDouble();
        System.out.println("¿Cuales son los ingresos familiares: ");
        ingresosFamiliaresAnuales = sc.nextInt();
        System.out.println("¿Eres estudiante de ultimo año (true/false): ");
        estudiantePrimerAño = sc.nextBoolean();
        if (notaMedia >= 9.5){
            System.out.println("Tipo A");
        } else if(notaMedia >= 8 && ingresosFamiliaresAnuales <= 15000 ){
            System.out.println("Tipo B");
        } else if(notaMedia >= 7.5 && ingresosFamiliaresAnuales > 15000 && ingresosFamiliaresAnuales <= 22000 ){
            System.out.println("Tipo C");
        } else if(estudiantePrimerAño && notaMedia >= 6.5 && ingresosFamiliaresAnuales < 30000 ){
            System.out.println("Tipo D");
        } else {
            System.out.println("Tipo R");
        }
    }
    
}
