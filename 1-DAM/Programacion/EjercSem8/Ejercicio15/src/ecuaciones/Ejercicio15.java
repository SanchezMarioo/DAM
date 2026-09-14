/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuaciones;

/**
 *
 * @author MARIO
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EcuacionSegundoGrado eq1 = new EcuacionSegundoGrado(1, -5, 6);
        System.out.println(eq1.obtenerSoluciones());

        EcuacionSegundoGrado eq2 = new EcuacionSegundoGrado(1, 2, 1);
        System.out.println(eq2.obtenerSoluciones());

        EcuacionSegundoGrado eq3 = new EcuacionSegundoGrado(1, 0, 1);
        System.out.println(eq3.obtenerSoluciones());

        EcuacionSegundoGrado eq4 = new EcuacionSegundoGrado(0, 2, 1);
        System.out.println(eq4.obtenerSoluciones());
    }

}
