/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Curso cursoGeneral = new Curso("Gestión de Proyectos Ágiles", 15);

        CursoProgramacion cursoJava = new CursoProgramacion("Máster en Spring Boot", 60, "Java");
        CursoProgramacion cursoPython = new CursoProgramacion("Inteligencia Artificial con Python", 45, "Python");

        System.out.println("--- Información del Curso General ---");
        cursoGeneral.mostrarCurso();

        System.out.println("\n--- Información de Cursos de Programación ---");
        cursoJava.mostrarCurso();
        System.out.println(cursoJava.esAvanzado());
        System.out.println(); 

        cursoPython.mostrarCurso();
        System.out.println(cursoPython.esAvanzado());
    }

}
