/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Documentos misDocs = new Documentos("Contrato confidencial", 15);
        Dispositivos_Electronicos miTablet = new Dispositivos_Electronicos("Tablet Pro", 500, true);

        Caja<Documentos> cajaDocumentos = new Caja<>();
        Caja<Dispositivos_Electronicos> cajaDispositivo = new Caja<>();

        System.out.println("--- PRUEBA CAJA DOCUMENTOS ---");
        System.out.println("¿La caja está vacía al principio? " + cajaDocumentos.estaVacio());

        cajaDocumentos.añadirElemento(misDocs);
        System.out.println("¿La caja está vacía después de añadir? " + cajaDocumentos.estaVacio());
        System.out.println(cajaDocumentos.recuperarObjeto());

        Documentos docRecuperado = cajaDocumentos.recuperarObjeto();
        System.out.println("Documento recuperado correctamente de la caja.");

        System.out.println("\n--- PRUEBA CAJA DISPOSITIVOS ---");
        System.out.println("¿La caja está vacía al principio? " + cajaDispositivo.estaVacio());
        System.out.println(cajaDispositivo.recuperarObjeto());
        cajaDispositivo.añadirElemento(miTablet);
        System.out.println("¿La caja está vacía después de añadir? " + cajaDispositivo.estaVacio());

    }

}
