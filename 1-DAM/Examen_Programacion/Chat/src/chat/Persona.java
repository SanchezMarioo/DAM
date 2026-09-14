/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chat;

/**
 *
 * @author Mario
 */
public class Persona {

    private String nombre;
    // true si esta, false NO esta
    private boolean estadoConexion = false;
    private Chat chat;
    public Persona(String nombre, Chat chat ){
        this.nombre = nombre;
        estadoConexion = false;
        this.chat = chat;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoConexion() {
        return estadoConexion;
    }
    
    public void conectar() {
        estadoConexion = true;
        System.out.println("El usuario " + nombre + " se ha conectado" );
    }

    public void desconectar() {
        estadoConexion = false;
        System.out.println("El usuario " + nombre + " se ha desconectado" );
    }

    public void enviarMensaje(String mensaje, Persona destinatario) {
      if(estadoConexion){
          chat.enviarMensaje(this, destinatario, mensaje);
      } else{
          System.out.println("No esta conectado el remitente");
      }
    }

    public void recibirMensaje(String mensaje, String remitente) {
        System.out.println(remitente + " envia: " + mensaje);
    }
}
