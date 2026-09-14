/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Dispositivos_Electronicos {

    private String titulo;
    private int peso;
    private boolean fragil;

    public Dispositivos_Electronicos(String titulo, int peso, boolean fragil) {
        this.titulo = titulo;
        this.peso = peso;
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Dispositivos_Electronicos{" + "titulo=" + titulo + ", peso=" + peso + ", fragil=" + fragil + '}';
    }
    
    
    
}
