/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio20;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class ServicioLogin {

    public Usuario comprobarUsuario(ArrayList<Usuario> usuarios,String nombreUsuario, String contraseña) throws LoginException {

        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña)) {
                return usuario;
            }
        }
        throw new LoginException("Usuario o contraseña incorrectos ");
    }
}
