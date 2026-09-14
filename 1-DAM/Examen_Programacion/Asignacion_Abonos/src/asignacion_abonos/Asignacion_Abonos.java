/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion_abonos;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Asignacion_Abonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double costeBase = 0;
        int prioridad = 0;
        boolean contrato = false, esClienteDeContrato = false;
        double costoAcumulado = 0, costoFinal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el costo base? : ");
        costeBase = sc.nextDouble();
        System.out.println("Cual es la prioridasd (1-4): ");
        prioridad = sc.nextInt();
        System.out.println("¿Es el cliente del contrato (true/false): ");
        contrato = sc.nextBoolean();
        switch (prioridad) {
            case 1:
                costoAcumulado += 25;
            case 2:
                costoAcumulado += 15;
            case 3:
                costoAcumulado += 10;
                break;
            case 4:
                costoAcumulado = 0;
                break;
            default:
                costoAcumulado = 0.0;
                System.out.println("Error no has elegido ninguna prioridad");
        }
        double costeSubtotal = costeBase - costoAcumulado;
        if (contrato && prioridad == 1) {

            costoFinal = costeSubtotal * 0.9;
        } else if (contrato && prioridad == 4) {

            costoFinal = costeSubtotal * 1.05;
        } else if (contrato && (prioridad == 2 || prioridad == 3)) {
            costoFinal = costeSubtotal;
        } else if (!esClienteDeContrato && prioridad == 1) {
            costoFinal = costeSubtotal + 30;
        } else {
            costoFinal = costeSubtotal;
        }
        System.out.println("El coste final es " + costoFinal);
    }

}
