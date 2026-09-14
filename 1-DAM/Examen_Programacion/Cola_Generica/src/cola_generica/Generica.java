/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola_generica;

import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class Generica<T> {

    private ArrayList<T> elementos = new ArrayList<>();

    public void enqueue(T elemento) {
        elementos.add(elemento);
    }

    public T dequeue() {
        if (!estaVacia()) {
            return elementos.removeFirst();
        } else {
            return null;
        }
    }

    public T front() {
        if (!estaVacia()) {
            return elementos.getFirst();
        } else {
            return null;
        }
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
    public int tamaño(){
        return elementos.size();
    }

}
