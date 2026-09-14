/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saltossecuencia;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class SaltosSecuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = -1, prevNum = 0, salto = 0, salto5 = 0, sumTotalSaltos = 0;
        for (int i = 0; numero != 0; i++) {
            System.out.println("Dime un numero: ");
            numero = sc.nextInt();
            if (numero == 0){
                continue;
            }
            if (i == 0) {
                prevNum = numero;
            } else {
                
                salto = prevNum - numero;
                
                salto = Math.abs(salto);
                sumTotalSaltos += salto;
                if (salto > 5) {
                    salto5++;
                }
                System.out.println("Salto entre " + prevNum + " y " + numero + " : " + salto);
                prevNum = numero;
            }

        }
        System.out.println("Saltos mayores que 5: " + salto5);
        System.out.println("Suma total de saltos: " + sumTotalSaltos);
    }

}
