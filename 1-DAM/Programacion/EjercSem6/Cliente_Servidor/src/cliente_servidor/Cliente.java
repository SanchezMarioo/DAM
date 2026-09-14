/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente_servidor;

/**
 *
 * @author mario.sanper.2
 */
public class Cliente {

    private String ip;
    private String ip_servidor;
    private Servidor servidor;
    private final String IP_DEFECTO = "0.0.0.0";

    public Cliente(String ip_servidor) {
        setIp_servidor(ip_servidor);
    }

    public boolean ping() {
        if(servidor !=null){
            return true;
        } else{
            return false;
        }
        
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (ValidarIP.comprobarIP(ip)) {
            this.ip = ip;
        } else {
            this.ip = IP_DEFECTO;
        }
    }

    public String getIp_servidor() {
        return ip_servidor;
    }

    public void setIp_servidor(String ip_servidor) {
        if (ValidarIP.comprobarIP(ip_servidor)) {
            this.ip_servidor = ip_servidor;
        } else {
            this.ip_servidor = "127.0.0.1";
        }

    }

    public Servidor getServidor() {
        return servidor;
    }

    public void setServidor(Servidor servidor) {
        this.servidor = servidor;
    }

    /**
     * Metodo que ejecuta el servidor para enlazarse con el cliente
     *
     * @param servidor
     */
    public void establecerServidor(Servidor servidor) {
        servidor.enlazarCliente(this);
    }

}
