/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Mario
 */
public class SerieTV {
    private String titulo;
    private int temporadas;
    private boolean finalizada;
    public SerieTV(){
        titulo = "Sin titulo";
        temporadas = 1;
        finalizada = false;
    }
    public SerieTV(String titulo,int temporadas){
        setTitulo(titulo);
        setTemporadas(temporadas);
        setFinalizada(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        if(temporadas >=  1){
            this.temporadas = temporadas;
        } else{
            System.err.println("Las temporadas deben de ser mayor a 1");
        }
        
    }

    public boolean getFinalizada() {
        return finalizada;
    }
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    public void sumarTemporadas(){
        if(!finalizada){
            temporadas++;
        } else{
            System.err.println("La serie ya ha finalizado");
        }
    }
    /**
     * Pone el boolean de finalizada a true y muestra un mensaje
     */
    public void finalizarSerie(){
        setFinalizada(true);
        System.out.println("La serie ha acabado.");
    }

    @Override
    public String toString() {
        return "SerieTV{" + "titulo=" + titulo + ", temporadas=" + temporadas + ", finalizada=" + finalizada + '}';
    }
}
