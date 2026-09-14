/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion_entrega_paquetes;

/**
 *
 * @author MARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String regex = "PKG-\\d{4}-[A-Z]{2}"; // Doble barra aquí
        String input = "PKG-1234-AB";

        if (input.matches(regex)) {
            System.out.println("¡Formato válido!");
        } else {
            System.out.println("Formato inválido.");
        }
    }

}
