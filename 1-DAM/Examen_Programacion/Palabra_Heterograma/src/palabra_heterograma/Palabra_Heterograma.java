/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabra_heterograma;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Palabra_Heterograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "";
        boolean esHeterograma = false;
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            int numero = frase.indexOf(letra, i + 1);
            System.out.println(numero);
        }
        if (esHeterograma) {
            System.out.println("Si lo es");
        }
    }
    

}
