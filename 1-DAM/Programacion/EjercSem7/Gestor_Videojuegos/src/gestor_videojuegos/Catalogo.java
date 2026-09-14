/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor_videojuegos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Catalogo {

    ArrayList<Videojuego> listaJuegos;
    Scanner sc; // Variable global para la clase

    public Catalogo() {
        listaJuegos = new ArrayList<>();
    }

    /**
     * Si el catálogo está vacío, añade 3 juegos por defecto
     */
    public void crearCatalogoDefecto() {
        if (listaJuegos.isEmpty()) {
            listaJuegos.add(new Videojuego("Fifa", 29.50));
            listaJuegos.add(new Videojuego("Star Wars Jedi: Survivor", 19.99));
            listaJuegos.add(new Videojuego("Pokémon Escarlata", 45.9));
        }
    }

    public void init() {
        sc = new Scanner(System.in);
        boolean salir = false;
        do {
            int opcion = mostrarMenu();
            switch (opcion) {
                case 1 ->
                    mostrarJuegos();
                case 2 ->
                    incluirJuego();
                case 3 ->
                    buscar();
                case 4 ->
                    precioAlto();
                case 5 ->
                    filtroPrecio();
                case 6 ->{
                    filtarLetra();
                }
                case 0 ->
                    salir = true;
            }
        } while (!salir);
        sc.close();
    }

    private int mostrarMenu() {
        int opcion;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("        CATÁLOGO         ");
            System.out.println("-------------------------");
            System.out.println("1. Muestra todos los juegos");
            System.out.println("2. Añadir nuevo juego");
            System.out.println("3. Buscar un juego");
            System.out.println("4. Juego más caro");
            System.out.println("5. Filtrar por precio");
            System.out.println("6. Filtrar por letra");
            System.out.println("0. Salir");

            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); // 

                if (opcion >= 0 && opcion <= 6) {
                    return opcion;
                } else {
                    System.out.println("Error: Debe introducir un valor válido.");
                }
            } else {
                System.out.println("Error: Debe introducir un número entero.");
                sc.next(); // limpiar entrada inválida
            }
        }
    }

    private void mostrarJuegos() {
        for (Videojuego juego : listaJuegos) {
            System.out.println("-> " + juego.getNombre());
        }
        System.out.println("");
    }

    private void incluirJuego() {
        String nombre = pedirNombreVideojuego();
        double precio = pedirPrecioVideojuego();

        listaJuegos.add(new Videojuego(nombre, precio));
    }

    // Métodos añadidos para que incluirJuego() funcione correctamente
    private String pedirNombreVideojuego() {
        System.out.println("Introduce el nombre del nuevo juego:");
        return sc.nextLine();
    }

    private double pedirPrecioVideojuego() {
        System.out.println("Introduce el precio del nuevo juego:");
        double precio = sc.nextDouble();
        sc.nextLine(); // Limpiar el buffer
        return precio;
    }

    private void buscar() {
        String nombre = pedirJuegoUsuario();
        Videojuego juegoBuscado = buscarJuego(nombre);

        if (juegoBuscado != null) {
            System.out.println("Juego encontrado");
            System.out.println("Nombre: " + juegoBuscado.getNombre() + " , precio: " + juegoBuscado.getCantidad() + " ?");
        } else {
            System.out.println("No se ha encontrado el juego: " + nombre);
        }
    }

    private String pedirJuegoUsuario() {
        String resultado;
        while (true) {
            System.out.println("Introduce el nombre del juego que quieres buscar");
            resultado = sc.nextLine();
            if (!resultado.isEmpty()) {
                return resultado;
            } else {
                System.out.println("No introduzcas una cadena vacía");
            }
        }
    }

    private Videojuego buscarJuego(String nombre) {
        for (Videojuego juego : listaJuegos) {
            if (juego.getNombre().toUpperCase().equals(nombre.toUpperCase())) {
                return juego;
            }
        }
        return null;
    }

    private void precioAlto() {
        Videojuego juego = buscarMayorPrecio();
        if (juego != null) {
            System.out.println("El juego con el precio más alto es: " + juego.getNombre() + " " + juego.getCantidad() + "?");
        } else {
            System.out.println("No hay juegos en el catálogo");
        }
    }

    private Videojuego buscarMayorPrecio() {
        if (listaJuegos.isEmpty()) {
            return null;
        }

        Videojuego masCaro = listaJuegos.get(0);

        for (Videojuego juego : listaJuegos) {
            if (juego.getCantidad() > masCaro.getCantidad()) {
                masCaro = juego;
            }
        }
        return masCaro;
    }

    private void filtroPrecio() {
        double precio = pedirPrecioMinimo();
        int contador = 0;

        for (Videojuego juego : listaJuegos) {
            if (juego.getCantidad() > precio) {
                System.out.println("Juego: " + juego.getNombre() + " , precio: " + juego.getCantidad() + "?");
                contador++;
            }
        }
        System.out.println(contador + " juegos encontrados");
    }

    private double pedirPrecioMinimo() {
        double precio;
        while (true) {
            System.out.println("¿Cuál es el precio mínimo?");

            if (sc.hasNextDouble()) {
                precio = sc.nextDouble();
                sc.nextLine(); // limpiar el salto de línea

                if (precio >= 0) {
                    return precio;
                } else {
                    System.out.println("El precio no puede ser negativo.");
                }
            } else {
                System.out.println("Debes introducir un número válido.");
                sc.nextLine();
            }
        }
    }

    private void filtarLetra() {
        char letra = pedirConsonante();
        letra = Character.toUpperCase(letra);
        System.out.println("=============== LETRA " + letra + " ==================================");
        for (Videojuego listaJuego : listaJuegos) {
            char inicialJuego = Character.toUpperCase(listaJuego.getNombre().charAt(0));
            if(inicialJuego == letra){
                System.out.println("");
                System.out.println("========================================================");
                System.out.println("Nombre del videojuego: " + listaJuego.getNombre());
                System.out.println("Precio del videojuego: " + listaJuego.getCantidad());
                System.out.println("========================================================");
            }
        }
    }

    private char pedirConsonante() {
        char letra;
        do {
            System.out.println("Dime la letra por la que empieza");
            letra = sc.next().charAt(0);
            if(!Character.isLetter(letra)){
                System.out.println("No has introducido una letra");
            }
        } while (!Character.isLetter(letra));
        return letra;
    }
}
