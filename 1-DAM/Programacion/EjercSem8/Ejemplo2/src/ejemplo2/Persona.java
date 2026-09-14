/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author mario.sanper.2
 */
public class Persona {

    private String nombre;
    private int edad;
    private String dni;

    public Persona() {
        nombre = "Anonimo";
        edad = 0;
        dni = "sin definir";
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public void mostrarInformacion(){
        System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
    
    

}
