/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author Mario
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario admin = new Usuario("Carlos", RolUsuario.ADMIN);
        Usuario usuario = new Usuario("Ana", RolUsuario.USUARIO);
        Usuario invitado = new Usuario("Luis", RolUsuario.INVITADO);

        admin.puedeAcceder();
        usuario.puedeAcceder();
        invitado.puedeAcceder();

    }

}
