/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Mario
 */
public class Cancion {

    private String titulo;
    private String artista;
    public int duracion;

    /**
     * Constructor por defecto que establece el titulo y el artista en
     * desconocido y la duracion a 0
     */
    public Cancion() {
        titulo = "Desconocido";
        artista = "Desconocido";
        duracion = 0;
    }

    /**
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
         this.titulo = titulo;
    }

    /**
     *
     * @param artista
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     *
     * @param titulo
     * @return
     */
    public String getTitulo(String titulo) {
        return titulo;
    }

    /**
     *
     * @param artista
     * @return
     */
    public String getArtista(String artista) {
        return artista;
    }

    /**
     * Metodo Setter, este comprueba si la duracion es mayor a 3 en caso de aqui
     * sea establece el valor
     *
     * @param duracion
     */
    public void setDuracion(int duracion) {
        if (duracion > 3) {
            this.duracion = duracion;
        } else {
            System.err.println("La duracion debe de ser mayor a 3.");
        }

    }

    /**
     * Este metodo muestra la informacion sobre la cancion
     */
    public void mostrarInformacion() {
        System.out.println("");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duracion " + duracion + " secs");
    }
}
