/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

/**
 *
 * @author mario.sanper.2
 */
public class Empleado extends Persona {

    private String codigo;

    public Empleado(String codigo, String nombre, int edad, String dni) {
        super(nombre, edad, dni);
        this.codigo = codigo;
    }

    

    @Override
    public void mostrarInformacion() {
        System.out.println(codigo + ": Mi nombre es " + getNombre() + " tengo " + getEdad() + " años");
    }
}
