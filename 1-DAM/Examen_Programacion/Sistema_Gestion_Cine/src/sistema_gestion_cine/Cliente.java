/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_gestion_cine;

/**
 *
 * @author MARIO
 */
public class Cliente {

    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        if (validarNombre(nombre) && validarEmail(email)) {
            this.nombre = nombre;
            this.email = email;
        } else{
            System.out.println("ERROR: NO se puede validar el nombre o el email.");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }
    
    
    public static boolean validarNombre(String nombre) {
        return nombre.matches("[A-Za-z ]+");
    }

    public static boolean validarEmail(String email) {
        return email.matches("[A-Za-z0-9_.]+@[A-Za-z0-9_]+\\.[A-Za-z0-9_]{2,4}");
    }
}
