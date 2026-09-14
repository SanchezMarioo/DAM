/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Inventario {
    private ArrayList<Mascota> animales;

    public Inventario() {
        this.animales = new ArrayList<>();
    }

    // 1. Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)
    public void mostrarListaAnimales() {
        System.out.println("--- LISTA DE ANIMALES ---");
        for (Mascota m : animales) {
            // getClass().getSimpleName() obtiene el nombre de la clase (Perro, Gato, etc.)
            System.out.println(m.getClass().getSimpleName() + ": " + m.getNombre());
        }
    }

    // 2. Mostrar todos los datos de un animal concreto (buscando por nombre)
    public void mostrarDatosAnimal(String nombre) {
        System.out.println("--- DATOS DE " + nombre.toUpperCase() + " ---");
        for (Mascota m : animales) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                m.muestra();
                return; // Termina el método si lo encuentra
            }
        }
        System.out.println("Animal no encontrado en el inventario.");
    }

    // 3. Mostrar todos los datos de todos los animales
    public void mostrarTodosDatos() {
        System.out.println("--- DATOS DE TODOS LOS ANIMALES ---");
        for (Mascota m : animales) {
            m.muestra();
        }
    }

    // 4. Insertar animales en el inventario
    public void insertarAnimal(Mascota m) {
        animales.add(m);
        System.out.println(m.getNombre() + " ha sido añadido al inventario.");
    }

    // 5. Eliminar animales del inventario
    public void eliminarAnimal(String nombre) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(animales.get(i).getNombre() + " ha sido eliminado del inventario.");
                animales.remove(i);
                return;
            }
        }
        System.out.println("No se pudo eliminar. Animal no encontrado.");
    }

    // 6. Vaciar el inventario
    public void vaciarInventario() {
        animales.clear();
        System.out.println("El inventario ha sido vaciado por completo.");
    }
}
