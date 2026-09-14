/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario
 */
public class GestionEsculturas {

    private ArrayList<Escultura> esculturas;

    public GestionEsculturas() {
        esculturas = new ArrayList<>();
        cargarEsculturasPorDefecto();
    }

    
    public void cargarEsculturasPorDefecto() {
        esculturas.add(new Escultura("El Ángel Caído", "Ricardo Bellver", 1878, "bronce"));
        esculturas.add(new Escultura("La Piedad", "Miguel Ángel", 1499, "mármol"));
        esculturas.add(new Escultura("El Pensador", "Auguste Rodin", 1904, "bronce"));
        esculturas.add(new Escultura("Puppy", "Jeff Koons", 1992, "acero"));
        esculturas.add(new Escultura("Maman", "Louise Bourgeois", 1999, "acero"));
        esculturas.add(new Escultura("Cloud Gate", "Anish Kapoor", 2006, "acero"));
        esculturas.add(new Escultura("Guerrero de Capestrano", "Autor desconocido", 500, "piedra"));
        esculturas.add(new Escultura("Árbol de la Vida", "Jaume Plensa", 2010, "acero"));
        esculturas.add(new Escultura("Monumento a la Paz", "Laura González", 2015, "bronce"));
        esculturas.add(new Escultura("Espiral Urbana", "Carlos Méndez", 2021, "acero"));
    }

    public void añadirEscultura(Escultura e) {
        esculturas.add(e);
    }

    // Esculturas creadas después del año indicado
    private void mostrarDespuesDeAnio(int anioMinimo) {
        System.out.println("Esculturas después de " + anioMinimo + ":");
        for (Escultura e : esculturas) {
            if (e.getAnio() > anioMinimo) {
                System.out.println(e);
            }
        }
    }

    // Cuántas son de acero
    private int contarAcero() {
        int contador = 0;
        for (Escultura e : esculturas) {
            if (e.getMaterial().equalsIgnoreCase("acero")) {
                contador++;
            }
        }
        return contador;
    }

    // Buscar esculturas de un autor concreto
    private void buscarPorAutor(String autor) {
        System.out.println("Esculturas de " + autor + ":");
        for (Escultura e : esculturas) {
            if (e.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(e);
            }
        }
    }

    // La más antigua
    private Escultura getMasAntigua() {
        if (esculturas.isEmpty()) {
            return null;
        }
        Escultura masAntigua = esculturas.get(0);
        for (Escultura e : esculturas) {
            if (e.getAnio() < masAntigua.getAnio()) {
                masAntigua = e;
            }
        }
        return masAntigua;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Añadir escultura");
            System.out.println("2. Esculturas después de un año");
            System.out.println("3. Contar esculturas de acero");
            System.out.println("4. Buscar por autor");
            System.out.println("5. Escultura más antigua");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Material: ");
                    String material = sc.nextLine();
                    añadirEscultura(new Escultura(titulo, autor, anio, material));
                    break;
                case 2:
                    System.out.print("Año mínimo: ");
                    int anioMinimo = sc.nextInt();
                    sc.nextLine();
                    mostrarDespuesDeAnio(anioMinimo);
                    break;
                case 3:
                    System.out.println("Esculturas de acero: " + contarAcero());
                    break;
                case 4:
                    System.out.print("Autor: ");
                    String autorBuscar = sc.nextLine();
                    buscarPorAutor(autorBuscar);
                    break;
                case 5:
                    System.out.println("Más antigua: " + getMasAntigua());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
