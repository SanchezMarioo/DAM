/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expresiones_regulares_2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MARIO
 */
public class AnalizadorTexto {

    private final String idSesion = "\\b SID-([A-Z]|\\d){6}\\b";
    private final String direccionIP = "";
    private final String codigosError = "ERR:\\d{3}-(A-Z)";
    private final String archivoSensibles = "[A-Za-z0-9-]+\\.(conf|key|log)";
    private final String comandosPeligrosos = "(?i) (delete|format|shutdown|override|root) ";

    private Pattern p;
    private final String texto;

    public AnalizadorTexto(String texto) {
        this.texto = texto;
    }

    private ArrayList<String> buscar(String expresion) {
        ArrayList<String> textos = new ArrayList<>();
        Matcher m = Pattern.compile(expresion).matcher(texto);
        while (m.find()) {
            textos.add(m.group());
        }
        return textos;
    }

    public void idSesion() {
        ArrayList<String> textos = new ArrayList<>();
        textos = buscar(idSesion);
        for (String texto1 : textos) {
            System.out.println(texto1);
        }
    }

    public void direccionIP() {
        ArrayList<String> textos = new ArrayList<>();
        textos = buscar(direccionIP);
        for (String texto1 : textos) {
            System.out.println(texto1);
        }
    }

    public void codigosError() {
        ArrayList<String> textos = new ArrayList<>();
        textos = buscar(codigosError);
        for (String texto1 : textos) {
            System.out.println(texto1);
        }
    }

    public void archivosSensibles() {
        ArrayList<String> textos = new ArrayList<>();
        textos = buscar(archivoSensibles);
        for (String texto1 : textos) {
            System.out.println(texto1);
        }
    }

    public void comandosSensibles() {
        ArrayList<String> textos = new ArrayList<>();
        textos = buscar(comandosPeligrosos);
        for (String texto1 : textos) {
            System.out.println(texto1);
        }
    }

}
