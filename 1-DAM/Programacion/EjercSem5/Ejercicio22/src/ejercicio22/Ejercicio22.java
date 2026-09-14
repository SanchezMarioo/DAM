/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroAdivinar = 0;
        int numeroUsuario = 0;
        int contador = 0;
        do {
            numeroAdivinar = 0;
            numeroUsuario = 0;
            contador = 0;
            System.out.println("===== NÚMERO SECRETO =====");
            System.out.println("Selecciona un nivel:");
            System.out.println("1. Nivel 1 (números del 1 al 20)");
            System.out.println("2. Nivel 2 (números del 1 al 100)");
            System.out.println("3. Nivel 3 (números del 1 al 500)");
            System.out.println("-1. Para salir");
            System.out.print("Introduce una opción (1-3): ");
            int opcion = sc.nextInt();
            if (opcion == -1) {
                break;
            }
            switch (opcion) {
                case 1 -> {
                    numeroAdivinar = nivelPrimero();
                    System.out.println(numeroAdivinar);
                    do {
                        numeroUsuario = sc.nextInt();
                        if (numeroUsuario > numeroAdivinar) {
                            System.out.println("El numero es menor");
                            contador++;
                        } else if (numeroUsuario < numeroAdivinar) {
                            System.out.println("El numero es mayor");
                            contador++;
                        } else {
                            // Se sale en caso de que sea igual 
                            break;
                        }
                    } while (true);
                }
                case 2 -> {
                    numeroAdivinar = nivelSegundo();
                    System.out.println(numeroAdivinar);
                    do {
                        numeroUsuario = sc.nextInt();
                        if (numeroUsuario > numeroAdivinar) {
                            System.out.println("El numero es menor");
                            contador++;
                        } else if (numeroUsuario < numeroAdivinar) {
                            System.out.println("El numero es mayor");
                            contador++;
                        } else {
                            // Se sale en caso de que sea igual 
                            break;
                        }
                    } while (true);
                }
                case 3 -> {
                    numeroAdivinar = nivelTercero();
                    System.out.println(numeroAdivinar);
                    do {
                        numeroUsuario = sc.nextInt();
                        if (numeroUsuario > numeroAdivinar) {
                            System.out.println("El numero es menor");
                            contador++;
                        } else if (numeroUsuario < numeroAdivinar) {
                            System.out.println("El numero es mayor");
                            contador++;
                        } else {
                            // Se sale en caso de que sea igual 
                            System.out.println("Numero intentos " + contador);
                            break;
                        }
                    } while (true);

                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }

            }
        } while (true);
    }

    static int nivelPrimero() {
        int numeroRandom = (int) (Math.random() * 20) + 1;
        return numeroRandom;
    }

    static int nivelSegundo() {
        int numeroRandom = (int) (Math.random() * 100) + 1;
        return numeroRandom;
    }

    static int nivelTercero() {
        int numeroRandom = (int) (Math.random() * 500) + 1;
        return numeroRandom;
    }

}
