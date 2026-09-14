/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author Mario
 */
public class Usuario {

    private String nombre;
    private RolUsuario rol;

    public Usuario(String nombre, RolUsuario rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public void puedeAcceder() {
        switch (rol) {
            case INVITADO -> {
                System.out.println(nombre + " acceso solo lectura");
            }
            case USUARIO -> {
                System.out.println(nombre + " acceso limitado");
            }
            case ADMIN -> {
                System.out.println(nombre + " acceso completo");
            }
        }
    }

}
