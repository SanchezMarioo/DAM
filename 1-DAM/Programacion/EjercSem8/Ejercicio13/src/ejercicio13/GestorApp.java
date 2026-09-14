/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author Mario
 */
public class GestorApp {

    private ReproductorMusical reproductorMusical = new ReproductorMusical();

    public void init() {

        reproductorMusical.añadirCola("Starman - David Bowie");
        reproductorMusical.añadirCola("Blinding Lights - The Weeknd");
        reproductorMusical.añadirCola("Wonderwall - Oasis");

        System.out.println("Total de canciones: " + reproductorMusical.tamanoCola());
        reproductorMusical.mostrarCola();

        reproducirCancion(reproductorMusical);
        reproducirCancion(reproductorMusical);
        reproducirCancion(reproductorMusical);
        System.out.println("\n--- 4. ESTADO FINAL DE LA COLA ---");
        reproductorMusical.mostrarCola();
        reproducirCancion(reproductorMusical);

    }

    private void reproducirCancion(ReproductorMusical rm) {
            String sonando = rm.siguenteCancion("");
            System.out.println(sonando);
    }
}
