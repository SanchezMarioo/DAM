/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibbonaci;

/**
 *
 * @author Mario
 */
public class Fibbonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, num2 = 1, fibb = 0;
        for (int i = 1; i < 15; i++) {
            System.out.println(fibb);
            fibb = num1 + num2;
            num1 = num2;
            num2 = fibb;
        }
    }

}
