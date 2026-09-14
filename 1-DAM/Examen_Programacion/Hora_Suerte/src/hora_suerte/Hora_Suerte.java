/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hora_suerte;

/**
 *
 * @author Mario
 */
public class Hora_Suerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0,contador = 0;
        for (int hora = 0; hora < 24; hora++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                suma = hora + minutos;
                if (suma == 7){
                    contador++;
                }
            }
        }
        System.out.println("Hay " + contador + "minutos de la suerte");
    }
    
}
