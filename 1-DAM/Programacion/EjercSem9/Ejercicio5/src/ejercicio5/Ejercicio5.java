/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaControlador vista = new VistaControlador();

        String rutaOrigen = vista.pedirMensaje("Introduce el nombre del fichero de origen:");
        String rutaDestino = null;
        if (rutaOrigen.contains(".")) {
            String ruta[] = rutaOrigen.split("\\.");
            if (ruta.length == 2) {
                rutaDestino = ruta[0] += "_copia.";
                rutaDestino += ruta[1];
            } else{
                vista.mostrarMensaje("Error: No se puede tener archivos con mas de un punto");
                return;
            }

        } else {
            rutaDestino = rutaOrigen + "_copia";
        }

        // 3. Configurar MVC
        Lectura modeloLectura = new Lectura(rutaOrigen);
        Escritura modeloEscritura = new Escritura(rutaDestino);
        Gestor controlador = new Gestor(modeloEscritura, modeloLectura, vista);

        // 4. Ejecutar
        controlador.copiar();
    }

}
