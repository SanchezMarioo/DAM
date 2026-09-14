/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorvocales;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class ContadorVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "";
        int vocal = 0, consonante = 0,letras = 0;
        char letra;
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);
            letras++;
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocal++;
            } else {
                consonante++;
            }
            
        }
        System.out.println("Consonante " + consonante + "\nVocales " + vocal + "\n" + "Letras totales: " + letras );
    }

}
