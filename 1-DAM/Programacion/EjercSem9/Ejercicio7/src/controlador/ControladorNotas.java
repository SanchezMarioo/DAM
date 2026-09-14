/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Alumno;
import modelo.AlumnoDAO;
import modelo.NotaNoValidaException;
import vista.VistaConsola;

/**
 *
 * @author MARIO
 */
public class ControladorNotas {

    private VistaConsola consola;
    private AlumnoDAO alumnoDAO;
    private File archivo;

    public ControladorNotas(VistaConsola consola, AlumnoDAO alumno) {
        this.consola = consola;
        this.alumnoDAO = alumno;
        archivo = new File(alumno.getRUTA());
        if (existeArchivo()) {
            pedirDatosAlumno();

        } else {
            crearNotas();
            consola.mostrarMsg("Creando alumnos...");
            pedirDatosAlumno();

        }
    }

    private boolean existeArchivo() {
        return archivo.exists();
    }

    private void leerArchivo() throws NotaNoValidaException {
        try {
            ArrayList<Alumno> alumnos = alumnoDAO.lectura();
            for (Alumno alumno : alumnos) {
                consola.mostrarMsg(alumno.toFile());
            }
        } catch (IOException ex) {
            consola.mostrarMsg(ex.getMessage());
        }
    }

    private void crearNotas() {
        ArrayList<Alumno> alumnos = cargarAlumnos();
        try {
            alumnoDAO.escritura(alumnos);
        } catch (IOException ex) {
            consola.mostrarMsg(ex.getMessage());
        }
    }

    private ArrayList<Alumno> cargarAlumnos() {
        ArrayList<Alumno> lista = new ArrayList<>();

        try {
            lista.add(new Alumno("Ana", 7.5));
            lista.add(new Alumno("Carlos", 4.2));
            lista.add(new Alumno("Lucía", 9.0));
            lista.add(new Alumno("Mario", 6.3));
            lista.add(new Alumno("Elena", 5.0));
            lista.add(new Alumno("Sofía", 8.7));
            lista.add(new Alumno("Pablo", 6.0));
            lista.add(new Alumno("Laura", 9.5));
            lista.add(new Alumno("Diego", 2.4));
        } catch (NotaNoValidaException ex) {
            consola.mostrarMsg(ex.getMessage());
        }

        return lista;
    }

    private boolean modificarNotas(String alumno, double nota) {
        boolean noExiste = true;
        ArrayList<Alumno> lista;
        try {
            lista = alumnoDAO.lectura();
            alumnoDAO.limpiarArchivo();
            for (Alumno alumno1 : lista) {
                // En caso de que sea igual entra en el if y en el contrario lo sobrescribee
                if (alumno1.getNombre().equals(alumno)) {
                    alumno1.setNota(nota);
                    alumnoDAO.escritura(alumno1.toFile());
                    noExiste = false;

                } else {
                    alumnoDAO.escritura(alumno1.toFile());
                }

            }
            return noExiste;
        } catch (IOException ex) {
            consola.mostrarMsg(ex.getMessage());
            return false;
        } catch (NotaNoValidaException ex) {
            consola.mostrarMsg(ex.getMessage());
            return false;
        }

    }

    private void pedirDatosAlumno() {
        try {
            leerArchivo();
        } catch (NotaNoValidaException ex) {
            System.getLogger(ControladorNotas.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        String nombreAlumno = "";
        do {
            consola.mostrarMsg("Dime el nombre del alumno (fin para acabar): ");
            nombreAlumno = consola.pedirTexto();
            consola.mostrarMsg("Dime la nota a modificar: ");
            double nota = consola.pedirNota();
            consola.limpiarBuffer();
            if (nota < 0 || nota > 10) {
                try {
                    throw new NotaNoValidaException("La nota no es valida");
                } catch (NotaNoValidaException ex) {
                    consola.mostrarMsg(ex.getMessage());
                }
            }
            if (modificarNotas(nombreAlumno, nota)) {
                consola.mostrarMsg("El alumno no existe");
            } else {
                consola.mostrarMsg("El alumno " + nombreAlumno + "se ha modificado la nota " + nota);
            }

        } while (!nombreAlumno.equals("salir"));
    }
}
