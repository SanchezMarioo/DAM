/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triaje;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Triaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int asignacionPrimo = 0;
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;
        boolean esValle = false, esCreciente = false, esAlterno = false, esMultiplo = false, accesoTotal = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero: ");
        numero = sc.nextInt();

        if (numero >= 10000 && numero <= 99999) {
            d1 = numero / 10000;
            d2 = numero / 1000 % 10;
            d3 = numero / 100 % 10;
            d4 = numero / 10 % 10;
            d5 = numero % 10;
            asignacionPrimo = d5 + d1;
            int asignacionMultiplo = d5+d4+d3;
            boolean esPrimo = (asignacionPrimo < 10)
                    && (asignacionPrimo == 2 || asignacionPrimo == 3 || asignacionPrimo == 5 || asignacionPrimo == 7);
            esMultiplo = (asignacionMultiplo % d3 == 0);
            System.out.println(asignacionMultiplo + " " + d3);
            System.out.println(esMultiplo);
            System.out.println(asignacionPrimo);
            System.out.println(esPrimo  );
            if (d5 > d4 && d1 > d2 && d4 > d3 && d2 > d3) {
                esValle = true;
            }
            if (d5 < d4 && d4 < d3 && d3 < d2 && d2 < d1) {
                esCreciente = true;
            }

        if ((d5 % 2 == 0 && d4 % 2 == 1 && d3 % 2 == 0 && d2 % 2 == 1 && d1 % 2 == 0)
                || (d5 % 2 == 1 && d4 % 2 == 0 && d3 % 2 == 1 && d2 % 2 == 0 && d1 % 2 == 1)) {
            esAlterno = true;
        }

            System.out.println(d1 % 2 + " " + d2 % 2 + " " + d3 % 2 + " " + d4 % 2 + " " + d5 % 2);
            if (esValle && esPrimo && esMultiplo){
                accesoTotal = true;
                System.out.println("ACCESO TOTAL CONCEDIDO");
            } else if ( !accesoTotal && esAlterno && (esCreciente || esMultiplo)){
                System.out.println("ACCESO Parcial");
            } else if (!accesoTotal && (esValle || esCreciente) && (!esPrimo && !esMultiplo)){
                System.out.println("Acesso denegado: Alerta de seguridad");
            } else{
                System.out.println("Acceso denegado: clave incorrecta");
            }
    }
        else {
            System.out.println("Numero erroneo");
    }

}

}
