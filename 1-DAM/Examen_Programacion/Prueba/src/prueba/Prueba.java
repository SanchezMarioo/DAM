/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author Mario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0, c = 0;
        do {
            if (i % 2 != 0) {
                i++;
                continue;
            }
            i++;
            c++;
        } while (i < 5);
        System.out.print(c);
    }

}
