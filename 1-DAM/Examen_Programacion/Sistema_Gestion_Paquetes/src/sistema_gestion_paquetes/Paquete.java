/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_paquetes;

/**
 *
 * @author MARIO
 */
public class Paquete {
    private String codEnvio;
    private String nombreRemitente;
    private String nombreDestinatario;
    private double peso;
    private String prioridad;

    public Paquete(String codEnvio, String nombreRemitente, String nombreDestinatario, double peso, String prioridad) {
        this.codEnvio = codEnvio;
        this.nombreRemitente = nombreRemitente;
        this.nombreDestinatario = nombreDestinatario;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Paquete{" + "codEnvio=" + codEnvio + ", nombreRemitente=" + nombreRemitente + ", nombreDestinatario=" + nombreDestinatario + ", peso=" + peso + ", prioridad=" + prioridad + '}';
    }
    
    
}
