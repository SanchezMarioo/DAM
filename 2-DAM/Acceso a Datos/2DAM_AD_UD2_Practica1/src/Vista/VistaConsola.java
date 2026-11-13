/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Empleado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaConsola {

    private Scanner sc = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("==========================================================");
        System.out.println("0. Salir");
        System.out.println("1. Consultar todos los empleados");
        System.out.println("2. Consultar empleado por DNI ");
        System.out.println("3. Consultar empleados que tenga un salario superior");
        System.out.println("4. Consultar empleados que tenga un salario igual o inferior");
        System.out.println("==========================================================");
    }

    public int pedirNumero(String msg) {
        System.out.println(msg);
        while (true) {
            
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Numero no valido");
            }
        }
    }

    public double pedirNumeroDoble(String msg) {
        System.out.println(msg);
        while (true) {
            
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Numero no valido");
                System.out.println(msg);
            }
        }
    }

    public String pedirCadena(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    public void mostrarEmpleados(ArrayList<Empleado> empleados) {
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }
}
