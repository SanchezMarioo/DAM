/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seguroautomovil;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class SeguroAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int costeBase = 800, edadConductor = -1, antiguedad = -1;
        double costeFinal = 0;
        boolean accidentesPrevios = false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Cual es su edad: ");
        edadConductor = sc.nextInt();
        System.out.println("¿Cuantos años llevas con el carnet?: ");
        antiguedad = sc.nextInt();
        System.out.println("¿Has tenido accidentes previos (true/false): ");
        accidentesPrevios = sc.nextBoolean();
        costeFinal = costeBase;
        if (edadConductor < 25) {
            costeFinal += 350;
        } 
        if (antiguedad < 3) {
            costeFinal += 275;
        } 
        if (accidentesPrevios) {
            costeFinal *=1.30;
        } else if (!accidentesPrevios && edadConductor >= 65) {
            costeFinal = costeBase * 0.85;
        }
        System.out.println("El coste final de la poliza es de " + costeFinal);

    }

}
