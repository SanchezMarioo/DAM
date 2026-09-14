/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- PRUEBA: PILA DE STRINGS ---");
        Pila<String> historial = new Pila<>();
        historial.push("google.com");
        historial.push("github.com");
        historial.push("stackoverflow.com");

        
        System.out.println("Página actual (peek): " + historial.peek());
        System.out.println("Botón atrás (pop): " + historial.pop());
        System.out.println("Nueva página actual: " + historial.peek());
        System.out.println("Tamaño actual: " + historial.numElementos());
        System.out.println();



        System.out.println("--- PRUEBA: PILA DE INTEGERS ---");
        Pila<Integer> numeros = new Pila<>();
        numeros.push(10);
        numeros.push(20);
        numeros.push(30);

        while (!numeros.estaVacio()) {
            System.out.println("Extrayendo número: " + numeros.pop());
        }
        System.out.println("¿Está vacía después de vaciar?: " + numeros.estaVacio());
        System.out.println("Intento de pop en vacía: " + numeros.pop()); 
        System.out.println();
        

        
        System.out.println("--- PRUEBA: PILA DE OBJETOS PUNTO ---");
        Pila<Punto> coordenadas = new Pila<>();
        coordenadas.push(new Punto(0, 0));
        coordenadas.push(new Punto(5, 10));
        coordenadas.push(new Punto(100, 200));
        System.out.println(coordenadas);
        System.out.println("Extrayendo último punto: " + coordenadas.pop());
        System.out.println("Punto que queda en el tope: " + coordenadas.peek());
        System.out.println("Tamaño final: " + coordenadas.numElementos());
    }
    
}
