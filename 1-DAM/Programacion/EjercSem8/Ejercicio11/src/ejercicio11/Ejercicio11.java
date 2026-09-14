/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author Mario
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inventario inventario = new Inventario();

        // --- INICIO DE LÍNEAS AÑADIDAS PARA PROBAR EL CÓDIGO ---
        // Insertamos un gato llamado Misu y un perro llamado Toby para que las búsquedas funcionen
        inventario.insertarAnimal(new Gato("Misu", 3, "10/05/2021", "Sano", "Blanco y negro", false));
        inventario.insertarAnimal(new Perro("Toby", 5, "12/08/2019", "Sano", "Labrador", false));
        System.out.println(); // Salto de línea estético antes de empezar con los prints de la imagen
        // --- FIN DE LÍNEAS AÑADIDAS ---

        System.out.println("=== LISTA DE ANIMALES ===");
        inventario.mostrarListaAnimales();

        System.out.println("\n=== DATOS DE UN ANIMAL CONCRETO ===");
        inventario.mostrarDatosAnimal("Misu");

        System.out.println("\n=== DATOS DE TODOS LOS ANIMALES ===");
        // Nota: Asegúrate de que el método en la clase Inventario se llame así.
        // En el código de la respuesta anterior se llamó mostrarTodosDatos()
        inventario.mostrarTodosDatos();

        System.out.println("\n=== ELIMINAR ANIMAL ===");
        inventario.eliminarAnimal("Toby");
        inventario.mostrarListaAnimales();

        System.out.println("\n=== VACIAR INVENTARIO ===");
        inventario.vaciarInventario();
        inventario.mostrarListaAnimales();
    }

}
