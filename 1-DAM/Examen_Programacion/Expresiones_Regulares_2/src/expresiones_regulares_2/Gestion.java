/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones_regulares_2;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Gestion {

    private Scanner sc = new Scanner(System.in);
    private AnalizadorTexto analisis;
    private final String texto = """
                           El sistema registró múltiples eventos durante la madrugada. El usuario con SID-A9F3K2 inició sesión desde la dirección 192.168.1.10, pero segundos después apareció otra conexión con SID-7K2L9P desde 10.0.0.254. El administrador sospecha que puede tratarse de un acceso duplicado o un intento de suplantación.
                           
                           Minutos más tarde, el sistema generó un error ERR:404-NF al intentar acceder a un archivo llamado server.conf, seguido de otro error más crítico ERR:500-SE relacionado con private.key. Además, se detectó actividad extraña desde la IP 172.16.0.5 que ejecutó comandos como shutdown y override sin autorización.
                           
                           En otro registro, se menciona un archivo access.log modificado después de ejecutar un proceso desconocido. También aparece un identificador inválido SID-12345 junto con una IP mal formada 192.168.1. Sin embargo, el sistema sí reconoció correctamente la sesión SID-X7P9Q2 desde 8.8.8.8.
                           
                           Por último, se encontraron referencias a comandos peligrosos como DELETE, format y root en distintos puntos del sistema, lo que indica una posible intrusión en curso. El equipo recomienda revisar todos los accesos y validar la integridad de los archivos críticos.""";

    public Gestion() {
        this.analisis = new AnalizadorTexto(texto);
    }

    public void init() {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            funcionalidad(opcion);
        } while (true);
    }

    private void mostrarMenu() {
        System.out.println("1.Mostrar el texto completo analizado");
        System.out.println("2.Buscar IDs de sesión");
        System.out.println("3.Buscar direcciones IP");
        System.out.println("4.Buscar códigos de error");
        System.out.println("5.Buscar archivos sensibles");
        System.out.println("6.Buscar comandos peligrosos");
        System.out.println("7.Mostrar todas las coincidencias");
    }

    private void funcionalidad(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println(texto);
                break;
            case 2:
                analisis.idSesion();
                break;
            case 3:
                analisis.direccionIP();
                break;
            case 4:
                analisis.codigosError();
                break;
            case 5:
                analisis.archivosSensibles();
                break;
            case 6:
                analisis.comandosSensibles();
                break;
            case 7:
                analisis.idSesion();
                analisis.direccionIP();
                analisis.codigosError();
                analisis.archivosSensibles();
                analisis.comandosSensibles();
            default:
                System.out.println("Opcion no valida.");
        }
    }
}
