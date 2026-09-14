/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {

    private Escritura escritura;
    private Lectura lectura;
    private VistaControlador vista;

    public Gestor(Escritura escritura, Lectura lectura, VistaControlador vista) {
        this.escritura = escritura;
        this.lectura = lectura;
        this.vista = vista;
    }

    public void copiar() {

        try {
            String texto = lectura.leerArchivo();
            
            escritura.escribirArchivo(texto);

            
            vista.mostrarMensaje("Se ha copiado correctamente el archivo");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
