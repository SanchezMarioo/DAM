/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author MARIO
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nota cancion[]={Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};
        Piano p = new Piano();
        
        for (Nota nota : cancion) {
            p.add(nota);
        }
        
        p.interpretar();
    }
    
}
