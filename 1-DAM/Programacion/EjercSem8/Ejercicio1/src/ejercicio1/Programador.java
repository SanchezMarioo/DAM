/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author mario.sanper.2
 */
public class Programador extends Empleado {

    public Programador(String nombre, double salario, String departamento) {
        setNombre(nombre);
        this.salario = salario;
        this.departamento = departamento;
    }
    public void mostrarInformacion(){
        System.out.println(getNombre());
        System.out.println(salario);
        System.out.println(departamento);
    }
}
