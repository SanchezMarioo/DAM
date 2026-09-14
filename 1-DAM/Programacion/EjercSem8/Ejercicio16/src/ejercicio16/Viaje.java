/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author MARIO
 */
public class Viaje {

    private int importeTotal;
    private int numeroPersonas;

    public Viaje(int importeTotal, int numeroPersonas) {
        this.importeTotal = importeTotal;
        this.numeroPersonas = numeroPersonas;
    }

    public void calcularImportePersona() {

        try {
            int importe = importeTotal / numeroPersonas;
            System.out.println("El importe por persona es " + importe + " €");
        } catch (ArithmeticException e) {
            System.out.println("El viaje no puede ir con 0 personas ");
            System.err.println(e.getMessage());
        }
    }
}
