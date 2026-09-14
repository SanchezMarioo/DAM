/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema114;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Problema114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        int n = 0;
        int resultado = 1;
        while(casosPrueba > 0) {
            n = sc.nextInt();
            if (n <= 0) {
                break;
            }

 
            for (int i = 1; i <= n; i++) {
                resultado = resultado * i;    
            }
            resultado = resultado % 10;
            System.out.println(resultado);
            casosPrueba--;
        }

    }

}
