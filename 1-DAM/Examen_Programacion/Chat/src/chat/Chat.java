/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

/**
 *
 * @author Mario
 */
public class Chat {

    private int MAX_PERSONAS = 2;
    private int contador = 0;
    public Persona[] personas = new Persona[MAX_PERSONAS];

    public void registrarPersona(Persona p) {
        if (contador >= MAX_PERSONAS) {
            System.out.println("Has excedido el limite");
        } else {
            personas[contador] = p;
            contador++;
        }
    }

    public Persona buscarPersona(String nombre) {
        for (int i = 0; i < personas.length; i++) {
            if (nombre.equals(personas[i].getNombre()) && personas[i] != null ) {
                return personas[i];
            }
        }
        return null;
    }

    public void mostrarNombre() {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i] != null) {
                System.out.println(i + " - " + personas[i].getNombre());
            }
        }
    }

    public void enviarMensaje(Persona remitente, Persona destinatario, String mensaje) {
        if (destinatario.isEstadoConexion()) {
            destinatario.recibirMensaje(mensaje, remitente.getNombre());
        } else {
            System.out.println("El destinario no esta conectado ");
        }
    }
}
