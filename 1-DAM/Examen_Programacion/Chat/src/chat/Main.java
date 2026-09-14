/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chat;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        System.out.println("Nombre de la persona 1: ");
        String nombreP1 = sc.nextLine();
        System.out.println("Nombre de la persona 2: ");
        String nombreP2 = sc.nextLine();
        Chat chat = new Chat();
        Persona persona1 = new Persona(nombreP1, chat);
        Persona persona2 = new Persona(nombreP2, chat);
        chat.registrarPersona(persona1);
        chat.registrarPersona(persona2);
        do {
            System.out.println("1 - " + persona1.getNombre());
            System.out.println("2 - " + persona2.getNombre());
            System.out.println("Escoge uno: ");
            int opcionObjeto = sc.nextInt();
            Persona personaSeleccionada;

            if (opcionObjeto == 1) {
                personaSeleccionada = persona1;
            } else {
                personaSeleccionada = persona2;
            }
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    personaSeleccionada.conectar();
                }
                case 2 -> {
                    personaSeleccionada.desconectar();
                }
                case 3 -> {
                    chat.mostrarNombre();
                    System.out.print("Opcion: ");
                    String nombrePersona = sc.nextLine();
                    sc.nextLine();
                    Persona destinatario = chat.buscarPersona(nombrePersona);
                    System.out.print("Mensaje: ");
                    String mensaje = sc.nextLine();
                    chat.enviarMensaje(personaSeleccionada, destinatario, mensaje);

                }
            }
        } while (opcion != 4);
    }

    static void mostrarMenu() {
        System.out.println("1. Conectar persona");
        System.out.println("2. Desconectar persona");
        System.out.println("3. Enviar mensaje");
        System.out.println("4. Salir");
    }

}
