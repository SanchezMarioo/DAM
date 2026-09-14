/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Mario
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SerieTV serie1 = new SerieTV();
        SerieTV serie2 = new SerieTV("Separacion",2);
        serie1.setTemporadas(-1);
        serie2.finalizarSerie();
        serie2.sumarTemporadas();
        System.out.println("Serie 1: " +  serie1.toString());
        System.out.println("Serie 2: " +  serie2.toString());
    }
    
}
