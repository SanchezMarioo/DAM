/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Mario
 */
public class GestorRepositorio {

    public void init() {

        Repositorio<Documento> repoDocumentos = new Repositorio<>();
        Repositorio<ProductoElectronico> repoElectronicos = new Repositorio<>();

        Documento doc1 = new Documento(1, "Factura Enero", 5);
        Documento doc2 = new Documento(2, "Manual de Usuario", 50);
        Documento doc3 = new Documento(3, "Contrato de Alquiler", 12);
        ProductoElectronico prod1 = new ProductoElectronico(101, "Portátil Dell", 2.5, true);
        ProductoElectronico prod2 = new ProductoElectronico(102, "Ratón Inalámbrico", 0.2, false);
        ProductoElectronico prod3 = new ProductoElectronico(103, "Monitor 27 pulgadas", 4.0, true);
        repoDocumentos.añadirProducto(doc1);
        repoDocumentos.añadirProducto(doc2);
        repoDocumentos.añadirProducto(doc3);

        repoElectronicos.añadirProducto(prod1);
        repoElectronicos.añadirProducto(prod2);
        repoElectronicos.añadirProducto(prod3);

        System.out.println("--- DOCUMENTOS ALMACENADOS ---");
        repoDocumentos.mostrarGenericos();
        System.out.println("Total documentos: " + repoDocumentos.numeroGenericos());

        System.out.println("\n--- PRODUCTOS ELECTRÓNICOS ALMACENADOS ---");
        repoElectronicos.mostrarGenericos();
        System.out.println("Total productos: " + repoElectronicos.numeroGenericos());

        System.out.println("\n--- ELIMINANDO ELEMENTOS... ---");
        repoDocumentos.eliminarProducto(doc2);
        repoElectronicos.eliminarProducto(prod1);

        System.out.println("\n--- DOCUMENTOS TRAS ELIMINAR ---");
        repoDocumentos.mostrarGenericos(); 
        System.out.println("Total: " + repoDocumentos.numeroGenericos());

        System.out.println("\n--- PRODUCTOS TRAS ELIMINAR ---");
        repoElectronicos.mostrarGenericos(); 
        System.out.println("Total: " + repoElectronicos.numeroGenericos());
    }
}
