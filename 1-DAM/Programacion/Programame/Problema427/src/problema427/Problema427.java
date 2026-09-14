/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema427;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Problema427 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String nombre = "";
        String apellido = "";
        n = sc.nextInt();
        nombre = sc.nextLine();
        for (int i = 0; i < n; i++) {
            nombre = sc.nextLine();
            apellido = sc.nextLine();
            if (nombre.equals("Luke") && apellido.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(nombre + ", yo soy tu " + apellido);
            }
        }
    }

}
