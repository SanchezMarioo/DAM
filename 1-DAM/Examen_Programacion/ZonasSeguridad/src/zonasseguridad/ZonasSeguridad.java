/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zonasseguridad;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class ZonasSeguridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dañoBase;
        int tipoElemento = 0,efectoJugador = 0;
        boolean golpeCritico = false;
        boolean enemigoVulnerable = false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime el daño base: ");
        dañoBase = sc.nextDouble();
        System.out.println("1. Fuego");
        System.out.println("2. Agua");
        System.out.println("3.Planta");
        System.out.println("Elige una opcion: ");
        tipoElemento = sc.nextInt();
        System.out.println("Dime si el golpe es critico: ");
        golpeCritico = sc.nextBoolean();
        System.out.println("Es el enemigo vulnerable: ");
        enemigoVulnerable = sc.nextBoolean();
        System.out.println("0.Normal");
        System.out.println("1. Potenciado");
        System.out.println("2. Debilitado");
        System.out.println("Elige una opcion: ");
        efectoJugador = sc.nextInt();
        if (efectoJugador == 1){
            dañoBase *= 1.60;
        } else if (efectoJugador == 2){
            dañoBase *= 1.40;
        } else if (efectoJugador == 0){
            dañoBase = dañoBase;
        }
        if (enemigoVulnerable && tipoElemento == 1){
            
        }
    }
    
}
