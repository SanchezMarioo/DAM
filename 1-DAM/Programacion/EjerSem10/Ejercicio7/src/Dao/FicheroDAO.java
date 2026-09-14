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
 * @author mario.sanper.2
 */
public class FicheroDAO {

    private String ruta;
    private String REGEXP = "[0-9A-Za-z\\._-]+@[0-9A-Za-z\\._-]+\\.[a-zA-Z]{2,}";
    private Pattern pattern;
    private Matcher matcher;

    public FicheroDAO(String ruta) {
        this.ruta = ruta;
    }

    public ArrayList<String> read() throws FileNotFoundException, IOException {
        ArrayList<String> correos = new ArrayList<>();
        pattern = Pattern.compile(REGEXP);
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            while ((linea = br.readLine()) != null) {
                matcher = pattern.matcher(linea);
                while (matcher.find()) {
                    correos.add(matcher.group());
                }

            }
        }
        return correos;
    }
}
