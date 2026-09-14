/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente_servidor;

/**
 *
 * @author mario.sanper.2
 */
public class Cliente_Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Crear varios clientes (IPs válidas e inválidas)
        Cliente c1 = new Cliente("192.168.1.1");
        c1.setIp("192.168.1.2");  // válida

        Cliente c2 = new Cliente("192.168.1.1");
        c2.setIp("999.999.999.999");  // inválida, se pondrá 0.0.0.0

        Cliente c3 = new Cliente("192.168.1.1");
        c3.setIp("192.168.1.4");  // válida

        // 2. Crear un servidor con IP inválida
        Servidor servidor1 = new Servidor("999.999.999.999"); // se pondrá 127.0.0.1

        // 3. Crear un servidor con IP válida
        Servidor servidor2 = new Servidor("192.168.1.1");

        // 4. Crear otro cliente
        Cliente c4 = new Cliente("192.168.1.1");
        c4.setIp("192.168.1.5");

        // 5. Enlazar todos los clientes con el servidor válido
        c1.establecerServidor(servidor2);
        c2.establecerServidor(servidor2);
        c3.establecerServidor(servidor2);
        c4.establecerServidor(servidor2);

        // 6. Lanzar el menú del servidor
        servidor2.iniciarMenu();  // Esto produce el bucle interactivo
    }

}
