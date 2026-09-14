/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_paquetes;

import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class Contenedor<T> {
    private ArrayList<T> elementos = new ArrayList<>();
    
    
    public void añadir (T elemento){
        elementos.add(elemento);
    }
    public void eliminar (T elemento){
        elementos.remove(elemento);
    }
    public void recorrerElementos(){
        for (T elemento : elementos) {
            System.out.println(elementos);
        }
    }
}
