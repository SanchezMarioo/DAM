/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejemplo2;

/**
 *
 * @author mario.sanper.2
 */
public class HerenciaEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hora h1 = new Hora(23,00,00);
        Hora h2 = new Hora(23,00,00);
        System.out.println(h1);
        System.out.println(h2);
        if(h1.equals(h2)){
            System.out.println("Son iguales");
        } else{
            System.out.println("NO son iguales");
        }
    }
    
}
