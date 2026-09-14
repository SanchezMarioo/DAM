/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

import java.time.LocalDateTime;

/**
 *
 * @author mario.sanper.2
 */
public class Texto {

    private int longitudMaxima;
    private String cadena = "";
    private LocalDateTime fechaCreada;
    private LocalDateTime fechaUltimaModificacion;

    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.fechaCreada = LocalDateTime.now();
    }

    public int getLongitudMaxima() {
        return longitudMaxima;
    }

    public void setLongitudMaxima(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public LocalDateTime getFechaCreada() {
        return fechaCreada;
    }

    public void setFechaCreada(LocalDateTime fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public LocalDateTime getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(LocalDateTime fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public String añadirCaracteresPrincipio(String cadenaAñadir) {
        if ((cadena.length() + cadenaAñadir.length()) > longitudMaxima) {
            return("No puedes añadir eso ");
        } else {
            cadena = cadenaAñadir + cadena;
            modificarFecha();
            return ("Se ha añadido correctamente");
        }
    }

    public String añadirCaracteresFinal(String cadenaAñadir) {
        if ((cadena.length() + cadenaAñadir.length()) > longitudMaxima) {
            return ("No puedes añadir eso ");
        } else {
            cadena += cadenaAñadir;
            modificarFecha();
            return ("Se ha añadido correctamente");

        }
    }

    private void modificarFecha() {
        fechaUltimaModificacion = LocalDateTime.now();
    }

    public String añadirCaracteresPrincipio(char cadenaAñadir) {
        if ((cadena.length() + 1) > longitudMaxima) {
            return ("No puedes añadir eso ");
        } else {
            cadena = cadenaAñadir + cadena;
            modificarFecha();
            return ("Se ha añadido correctamente");

        }
    }

    public String añadirCaracteresFinal(char cadenaAñadir) {
        if ((cadena.length() + 1) > longitudMaxima) {
            return ("No puedes añadir eso.");
        } else {
            cadena += cadenaAñadir;
            System.out.println(cadena);
            modificarFecha();
            return ("Se ha añadido correctamente");
        }
    }

    public int contarVocales() {
        String cadenaMinusculas = cadena.toLowerCase();
        int vocales = 0;
        for (int i = 0; i < cadenaMinusculas.length(); i++) {
            char c = cadenaMinusculas.charAt(i);
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u':
                    vocales++;
                    break;
            }
        }
        return vocales;
    }

    public String mostrarInformacion() {
        return ("Fecha creacion: " + fechaCreada
                + "\nUltima modificacion: " + fechaUltimaModificacion
                + "\nCadena:\n" + cadena);
    }
}
