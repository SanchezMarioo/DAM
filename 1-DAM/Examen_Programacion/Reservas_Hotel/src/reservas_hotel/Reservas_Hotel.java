/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservas_hotel;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Reservas_Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int reservasValidas = 0;
        int reservasNoValidas = 0;
        int totalSuma = 0;
        int numero = sc.nextInt();
        sc.nextLine();
        String reservas = "";
        for (int i = 0; i < numero; i++) {
            String frase = sc.nextLine();
            boolean esValido = reservaValida(frase);
            if (esValido) {
                reservasValidas++;
                totalSuma = imprimirFormatoCorrecto(frase, totalSuma);
            } else {
                reservasNoValidas++;
            }

        }

        System.out.println("Reservas Validas: " + reservasValidas);
        System.out.println("Reservas inválidas: " + reservasNoValidas);
        System.out.println("Total ganado por el hotel: " + totalSuma);

    }

    static boolean reservaValida(String reservas) {
        String[] campos = reservas.split("-");
        if (campos.length != 4) {
            return false;
        }
        return esDiasPositivo(campos) && esPrecioPositivo(campos);

    }

    static boolean esDiasPositivo(String[] campos) {
        for (int i = 0; i < campos[1].length(); i++) {
            char c = campos[1].charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        int campoComprobar = Integer.parseInt(campos[1]);
        return campoComprobar > 0;

    }

    static boolean esPrecioPositivo(String[] campos) {
        int puntos = 0;
        for (int i = 0; i < campos[2].length(); i++) {
            char c = campos[2].charAt(i);
            if (c >= '0' && c <= '9') {
                continue; // dígito válido
            } else if (c == '.') {
                puntos++;
                if (puntos > 1) {
                    return false; // más de un punto
                }
            } else {
                return false; // cualquier otra cosa no es válida
            }
        }
        double campoComprobar = Double.parseDouble(campos[2]);
        return campoComprobar > 0;
    }

    static int imprimirFormatoCorrecto(String reservas, int totalSuma) {
        String[] campos = reservas.split("-");
        String codigo = campos[0];
        int dias = Integer.parseInt(campos[1]);
        double precio = Double.parseDouble(campos[2]);
        String nombreReserva = campos[3];
        System.out.println(codigo + " | " + nombreReserva + " | " + precio + "?/día " + " | " + "Total: " + (precio * dias));
        totalSuma += precio * dias;
        return totalSuma;
    }
}
