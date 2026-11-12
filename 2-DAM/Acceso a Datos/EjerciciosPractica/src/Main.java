import java.io.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        borrarArchivos("archivos");

    }

    static void borrarArchivos(String ruta) {
        File file = new File(ruta);
        if (file.isDirectory() && file.exists()) {
            File[] listaArchivos = file.listFiles();
            if (listaArchivos != null) {
                for (int i = 0; i < listaArchivos.length; i++) {
                    if (listaArchivos[i].length() == 0 && listaArchivos[i].isFile()) {
                        listaArchivos[i].delete();
                    }
                }
            }
        }


    }

    static ArrayList<String> leerFichero(File archivoIncial) {
        String linea = "";
        ArrayList<String> lineas = new ArrayList<>();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoIncial));
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return lineas;
    }
    public static void sumarYAnexarTotal(String ruta) {
        ArrayList<String> lineas  = leerFichero(new File(ruta));
        for(linea : lineas){

        }
    }
    static void escribirFichero(String suma, File archivoDestino) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDestino))) {

                escritor.write(suma);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}