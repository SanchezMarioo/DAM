/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecos_mario;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ecos_Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase = "";
        int letraA = 0, letraE = 0, letraI = 0, letraU = 0, letraO = 0;
        int ecos = 0;
        boolean noCuentes = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la frase: ");

        do {
            frase = sc.nextLine();
            if (frase.equals("FIN")) {
                continue;
            }
            frase = frase.toLowerCase();
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (c == '!') {
                    break;
                }
                if (c == '[') {
                    noCuentes = true;
                    continue;
                }
                if (c == ']') {
                    noCuentes = false;
                }
                if (!noCuentes) {
                    switch (c) {
                        case 'a' -> letraA++;
                        case 'e' -> letraE++;
                        case 'i' -> letraI++;
                        case 'u' -> letraU++;
                        case 'o' -> letraO++;
                    }
                }
            }
        } while (!frase.equals("FIN"));
        ecos = letraA + letraE + letraI + letraU + letraO;
        System.out.println("Has descubierto " + ecos + " en el mensaje sagrado");
        System.out.println("Esta tiene  a: " + letraA + " e: " + letraE + " i: " + letraI + " o: " + letraO + " u: " + letraU);

    }

}
