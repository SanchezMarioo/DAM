/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author MARIO
 */
class Satelite extends Astro {

    private Planeta planeta;

    public Satelite(Planeta planeta, String nombre, double masa, double diametroMedio, double periodoRotacionEje, double periodoTranslacion, double distanciaMedia) {
        super(nombre, masa, diametroMedio, periodoRotacionEje, periodoTranslacion, distanciaMedia);
        this.planeta = planeta;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\n--- PLANETA: " + getNombre() + " ---");
        System.out.println("Masa: " + getMasa() + " kg");
        System.out.println("Diámetro medio: " + getDiametroMedio() + " km");
        System.out.println("Período de rotación: " + getPeriodoRotacionEje() + " días");
        System.out.println("Período de traslación: " + getPeriodoTranslacion() + " días");
        System.out.println("Distancia media al Sol: " + getDistanciaMedia() + " km");

    }

}
