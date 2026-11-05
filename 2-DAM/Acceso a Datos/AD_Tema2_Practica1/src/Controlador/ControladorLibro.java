/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConsultasSQL;
import Modelo.Libro;
import Vista.VistaConsola;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ControladorLibro {
    private VistaConsola vista = new VistaConsola();
    private ConsultasSQL sql = new ConsultasSQL();
    
    public void init(){
        int numero = -1;
        while(numero != 0){
            vista.mostrarMenu();
            numero = vista.pedirNumero("Escoge una opcion: ");
            funcionalidadMenu(numero);
        }
    }

    private void funcionalidadMenu(int numero){
        switch(numero){
            case 1 -> {
                ArrayList<Libro> libros = sql.consultar();
                vista.mostrarLibros(libros);
            }
            case 0 -> {
                vista.mostrarMensaje("Saliendo del programa...");
            }
            default -> {
                vista.mostrarMensaje("Opcion no valida");
            }
        }
    }
}
