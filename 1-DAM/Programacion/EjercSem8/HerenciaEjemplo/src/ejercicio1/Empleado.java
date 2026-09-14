/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author mario.sanper.2
 */
public class Empleado extends Persona {

    private final double salario;
    public Empleado(String nombre,int edad,double estatura,double salario){
        this.setNombre(nombre);
        this.edad = edad;
        this.estatura = estatura;
        this.salario = salario;
    }
}
