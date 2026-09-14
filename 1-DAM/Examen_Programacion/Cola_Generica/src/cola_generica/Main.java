/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola_generica;

/**
 *
 * @author MARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Generica generica1 = new Generica();
        generica1.enqueue(1);

        generica1.enqueue(new Pedido("1", "sdffas"));
        generica1.enqueue(new Pedido("2", "dfaafsdfasd"));
        generica1.enqueue(new Pedido("3", "afdsasfd"));
        System.out.println(generica1.estaVacia());
        System.out.println(generica1.dequeue());
        System.out.println(generica1.tamaño());
        System.out.println(generica1.front());
        System.out.println(generica1.front());

    }

}
