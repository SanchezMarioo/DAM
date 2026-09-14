/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author Mario
 */
public enum RolUsuario {
    ADMIN(3),
    USUARIO(2),
    INVITADO(1);
    private int nivelPermiso;
    RolUsuario( int permiso){
        this.nivelPermiso = permiso;
    }

    public int getNivelPermiso() {
        return nivelPermiso;
    }

    
}
