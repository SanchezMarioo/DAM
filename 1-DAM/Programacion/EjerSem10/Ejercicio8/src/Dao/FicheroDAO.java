/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Mario
 */
public class FicheroDAO {

    private static final String ruta = "ejemplo.txt";
    private static final String REGEXP = "[A-Za-z0-9\\._\\-+]+@[A-Za-z0-9\\._\\-+]+\\.[A-Za-z]{2,}";
    private Pattern pattern;
    private Matcher matcher;

    public ArrayList<String> leer() throws FileNotFoundException, IOException {
        ArrayList<String> correos = new ArrayList<>();
        pattern = Pattern.compile(REGEXP);
        String linea;
        try (BufferedReader lector = new BufferedReader(new FileReader(ruta))) {
            while ((linea = lector.readLine()) != null) {
                matcher = pattern.matcher(linea);
                while(matcher.find()){
                    
                    correos.add(matcher.group());
                }
                
            }
        }
        return correos;
    }
}
