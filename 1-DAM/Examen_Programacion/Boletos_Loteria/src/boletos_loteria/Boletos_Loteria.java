/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletos_loteria;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Boletos_Loteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        // Variables de entrada y contadores
        long numeroBoletoOriginal;
        long numeroBoletoActual; // Variable que se consumirá en el bucle
        int secuenciaBuscar;
        int contadorPremios = 0;

        // --- 1. Entrada de datos ---
        System.out.print("Introduce el número de boleto (hasta 9 dígitos): ");
        numeroBoletoOriginal = sc.nextLong();

        System.out.print("Introduce la secuencia de 3 dígitos a buscar: ");
        secuenciaBuscar = sc.nextInt();

        // Inicializamos la variable de trabajo con el boleto original
        numeroBoletoActual = numeroBoletoOriginal;

        // Verificación de la secuencia de 3 dígitos (para que el bucle principal funcione)
        if (secuenciaBuscar < 100 || secuenciaBuscar > 999) {
            System.out.println("Error: La secuencia a buscar debe ser de 3 dígitos.");
            // Podrías agregar un bucle aquí para pedir la secuencia de nuevo
            return;
        }

        // --- 2. Lógica del Bucle ---
        // El bucle se ejecuta mientras queden al menos 3 dígitos por analizar (0..99)
        while (numeroBoletoActual >= 100) {

            // 1. Aísla las últimas 3 cifras del número de boleto actual
            // El operador módulo (%) 1000 nos da los 3 últimos dígitos.
            int tresDigitosActuales = (int) (numeroBoletoActual % 1000);

            // 2. Comprobación condicional
            if (tresDigitosActuales == secuenciaBuscar) {
                contadorPremios++;
            }

            // 3. Consumir un dígito
            // El operador de división entera (/) 10 elimina el último dígito del número,
            // avanzando la ventana de 3 dígitos una posición a la izquierda.
            numeroBoletoActual = numeroBoletoActual / 10;
        }

        // --- 3. Resultado Final ---
        System.out.println("\n--- Resultado de la Verificación ---");

        if (contadorPremios > 0) {
            System.out.println("¡PREMIO! La secuencia " + secuenciaBuscar
                    + " fue encontrada en el boleto " + numeroBoletoOriginal + ".");
            System.out.println("La secuencia " + secuenciaBuscar
                    + " apareció un total de " + contadorPremios + " veces.");
        } else {
            System.out.println("Lo siento, no hay premio. La secuencia " + secuenciaBuscar
                    + " no fue encontrada.");
            System.out.println("La secuencia " + secuenciaBuscar
                    + " apareció un total de 0 veces.");
        }
    }

}
