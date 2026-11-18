/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacroexamen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author mario.sanper.2
 */
public class SimulacroExamen {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static final String directorio = "equipos";
    static final String archivoBinario = "equipos.dat";
    static final String archivoXML = "equipos.xml";
    static final File archivoFile = new File(directorio, archivoBinario);

    public static void main(String[] args) {
        // TODO code application logic here

        prepararDirectorioSimulacro(directorio, archivoBinario);
        int opcion = -1;
        do {
            menuPrincipal();
            opcion = leerEntero("Escoge una opcion: ");
            funcionalidadMenu(opcion);

        } while (opcion != 5);
    }

    static void menuPrincipal() {
        System.out.println("1. Leer archivo");
        System.out.println("2. Escribir nuevo equipo ");
        System.out.println("3. Buscar por numero de equipo ");
        System.out.println("4. Convertir de binario a XML");
        System.out.println("5. Salir");
    }

    static int leerEntero(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Introduce un número entero válido: ");
            }
        }

    }

    static double leerDoble(String msg) {
        System.out.println(msg);
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.print("Introduce un número entero válido: ");
            }
        }

    }

    static void prepararDirectorioSimulacro(String carpeta, String archivo) {

        File directorio = new File(carpeta);

        if (!directorio.exists()) {
            directorio.mkdir();
            // Con mkdirs se crea subcarpetas
        }

        File archivoFile = new File(carpeta, archivo);
        if (!archivoFile.exists() || archivoFile.length() == 0) {
            try {
                archivoFile.createNewFile();
                // Con el getPath() te devuelve la carpeta absoluta para que no de problemas
                crearDatosPorDefecto(archivoFile.getPath());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    private static void crearDatosPorDefecto(String ruta) {
        DataOutputStream dos = null;
        Equipo equipo1 = new Equipo(5001, "Portatil", "Lenovo", "A12", 649.50);
        Equipo equipo2 = new Equipo(5002, "Sobremesa", "HP", "B03", 789.50);
        Equipo equipo3 = new Equipo(5003, "Monitor", "Samsung", "A12", 159.00);
        Equipo[] equipos = {equipo1, equipo2, equipo3};
        try {
            dos = new DataOutputStream(new FileOutputStream(ruta, true));
            for (Equipo equipo : equipos) {
                dos.writeInt(equipo.getNumeroEquipo());
                dos.writeUTF(equipo.getTipo());
                dos.writeUTF(equipo.getMarca());
                dos.writeUTF(equipo.getAula());
                dos.writeDouble(equipo.getPrecio());
            }
            dos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {

                dos.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    private static void funcionalidadMenu(int opcion) {
        switch (opcion) {
            case 1 -> {
                ArrayList<Equipo> equipos = leerEquipoDAT();
                for (Equipo equipo : equipos) {
                    System.out.println(equipo);
                }
            }
            case 2 -> {
                escribirExistiendo();
            }
            case 3 -> {
                int numeroEquipo = leerEntero("Dime el numero de equipo a buscar: ");

                Equipo equipoBuscado = buscarPorNumeroEquipo(numeroEquipo);
                if (equipoBuscado != null) {
                    System.out.println(equipoBuscado);
                } else {
                    System.out.println("Equipo no encontrado");
                }
            }
            case 4 -> {
                // Leemos los equipos
                ArrayList<Equipo> equipos = leerEquipoDAT();
                convertirXML(equipos);
            }

            default ->
                System.out.println("Opcion no valida");
        }
    }

    private static ArrayList<Equipo> leerEquipoDAT() {
        ArrayList<Equipo> equipos = new ArrayList<>();
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream(archivoFile));
            while (true) {
                int numeroInventario = dis.readInt();
                String tipo = dis.readUTF();
                String marca = dis.readUTF();
                String aula = dis.readUTF();
                double precio = dis.readDouble();
                equipos.add(new Equipo(numeroInventario, tipo, marca, aula, precio));

            }

        } catch (EOFException e) {

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }

        return equipos;
    }

    private static void escribirExistiendo() {
        DataOutputStream dis = null;

        int numeroInventario = leerEntero("Dime el numero de inventario: ");

        if (numeroInventario <= 0) {
            System.out.println("El numero debe de ser mayor a 0");

        } else {
            if (!existeEquipo(numeroInventario)) {

                System.out.println("Dime el tipo de equipo: ");
                String tipo = sc.nextLine();
                System.out.println("Dime el marca de equipo: ");
                String marca = sc.nextLine();
                System.out.println("Dime el aula de equipo: ");
                String aula = sc.nextLine();

                double precio = leerDoble("Dime el precio de equipo: ");
                try {
                    dis = new DataOutputStream(new FileOutputStream(archivoFile, true));
                    dis.writeInt(numeroInventario);
                    dis.writeUTF(tipo);
                    dis.writeUTF(marca);
                    dis.writeUTF(aula);
                    dis.writeDouble(precio);
                    System.out.println("Creado equipo.");
                } catch (FileNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                } finally {
                    if (dis != null) {
                        try {
                            dis.close();
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }

                    }
                }
            } else {
                System.out.println("Existe el equipo ");
            }

        }

    }

    private static boolean existeEquipo(int numeroInventario) {
        ArrayList<Equipo> equipos = leerEquipoDAT();
        for (Equipo equipo : equipos) {
            if (equipo.getNumeroEquipo() == numeroInventario) {
                return true;
            }
        }
        return false;
    }

    private static Equipo buscarPorNumeroEquipo(int numeroEquipo) {
        // Reutilizamos el metodo 
        ArrayList<Equipo> equipos = leerEquipoDAT();
        for (Equipo equipo : equipos) {
            if (equipo.getNumeroEquipo() == numeroEquipo) {
                return equipo;
            }
        }
        return null;
    }

    private static void convertirXML(ArrayList<Equipo> equipos) {
        Document documento = null;
        try {
            documento = crearDocumento();
        } catch (ParserConfigurationException ex) {
            System.out.println(ex.getMessage());
        }

        Element elementoRaiz = documento.createElement("equipos");
        documento.appendChild(elementoRaiz);
     
        for (Equipo equipo : equipos) {
             Element elementoHijo = añadirElementoEquipo(documento, elementoRaiz, "equipo", "numeroEquipo", Integer.toString(equipo.getNumeroEquipo()));
           añadirElemento(documento, elementoHijo, "numeroEquipo", Integer.toString(equipo.getNumeroEquipo()));
            añadirElemento(documento, elementoHijo, "tipo", equipo.getTipo());
            añadirElemento(documento, elementoHijo, "marca", equipo.getMarca());
            añadirElemento(documento, elementoHijo, "aula", equipo.getAula());
            añadirElemento(documento, elementoHijo, "precio", Double.toString(equipo.getPrecio()));
        }
        File xmlFile = new File(directorio, archivoXML);
        try {
            guardarDocumento(documento, xmlFile);
        } catch (TransformerConfigurationException ex) {
            System.out.println(ex.getMessage());
        } catch (TransformerException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void añadirElemento(Document documento, Element elementoPadre, String nombreEtiqueta, String contenido) {
        Element nuevoElemento = documento.createElement(nombreEtiqueta);
        nuevoElemento.setTextContent(contenido);
        elementoPadre.appendChild(nuevoElemento);
    }

    public static Element  añadirElementoEquipo(Document documento, Element elementoPadre, String nombreEtiqueta, String atributo, String contenidoAtributo) {
        Element nuevoElemento = documento.createElement(nombreEtiqueta);
        nuevoElemento.setAttribute(atributo, contenidoAtributo);
        elementoPadre.appendChild(nuevoElemento);
        return nuevoElemento;
    }

    public static Document crearDocumento() throws ParserConfigurationException {
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = fabrica.newDocumentBuilder();
        return constructor.newDocument();
    }

    public static void guardarDocumento(Document documento, File fichero) throws TransformerConfigurationException, TransformerException {
        TransformerFactory fabricaTransformador = TransformerFactory.newInstance();
        Transformer transformador = fabricaTransformador.newTransformer();
        transformador.setOutputProperty(OutputKeys.INDENT, "yes");
        transformador.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        DOMSource origen = new DOMSource(documento);
        StreamResult destino = new StreamResult(fichero);
        transformador.transform(origen, destino);
    }
}
