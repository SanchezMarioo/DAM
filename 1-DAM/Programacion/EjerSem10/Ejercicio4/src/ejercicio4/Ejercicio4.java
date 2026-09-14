/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import Controlador.ControladorAlumno;
import Dao.AlumnoDAO;
import Vista.VistaConsola;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoDAO dao = new AlumnoDAO();
        VistaConsola vista = new VistaConsola();
        ControladorAlumno controlador = new ControladorAlumno(dao, vista);
        controlador.init();

    }

}
