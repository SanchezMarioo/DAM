/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

/**
 *
 * @author Mario
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("==================");
            System.out.println("Tabla del: " + i);
            System.out.println("==================");

            for (int j = 1; j <= 10; j++) {
                resultado = j * i;
                System.out.println(i + "*" + j + "=" + resultado);
            }
        }
    }

}
