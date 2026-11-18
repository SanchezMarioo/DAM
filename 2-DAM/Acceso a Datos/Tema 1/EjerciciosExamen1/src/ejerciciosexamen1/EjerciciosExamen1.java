/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosexamen1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Mario
 */
public class EjerciciosExamen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Document documento = cargarDocumento(new File("empleados.xml"));
            insertarEmpleado(documento, "71070399", "Mario", 1800);
            guardarDocumento(documento, new File("empleados.xml"));
            borrarEmpleado(documento, "71070399");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void sumarYAnexarTotal(String ruta) {
        // Tu código aquí
        File archivo = new File(ruta);
        ArrayList<String> lineas = new ArrayList<>();
        String linea = "";
        int suma = 0;
        if (archivo.exists() && archivo.isFile() && archivo.length() > 0) {
            try {
                BufferedReader lectura = new BufferedReader(new FileReader(archivo));
                try {
                    while ((linea = lectura.readLine()) != null) {
                        lineas.add(linea);
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());

                }

            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            for (String linea1 : lineas) {
                try {
                    int numero = Integer.parseInt(linea1);
                    suma += numero;
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }
            try {
                BufferedWriter bf = new BufferedWriter(new BufferedWriter(new FileWriter(ruta, true)));
                bf.write("Total " + suma);
                bf.flush();
                bf.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        } else {
            System.out.println("No entra");
        }
    }

    public static void guardarNota(Nota n, String ruta) {
        // Tu código aquí
        File archivo = new File(ruta);
        boolean existeYTieneDatos = archivo.exists() && archivo.length() > 0;
        MyObjectOutputStream moos = null;
        ObjectOutputStream oos = null;
        if (existeYTieneDatos) {
            try {
                moos = new MyObjectOutputStream(new FileOutputStream(ruta, true));
                moos.writeObject(n);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } finally {
                if (moos != null) {
                    try {
                        moos.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        } else {

            try {
                oos = new ObjectOutputStream(new FileOutputStream(ruta));
                oos.writeObject(n);
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            } finally {
                if (oos != null) {
                    try {
                        oos.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }

    }

    public static void verNotaBinaria(String ruta) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
            while (true) {
                Nota n = (Nota) ois.readObject();
                System.out.println(n);
            }
        } catch (EOFException e) {

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void actualizarPrecioDOM(String rutaXML, int idBuscado, double nuevoPrecio) {
        try {
            Document documento = cargarDocumento(new File(rutaXML));
            cambiarPrecio(documento, idBuscado, nuevoPrecio);
            guardarDocumento(documento, new File(rutaXML));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static Document cargarDocumento(File fichero) throws Exception {
        DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
        DocumentBuilder constructor = fabrica.newDocumentBuilder();
        Document documento = constructor.parse(fichero);
        documento.getDocumentElement().normalize(); // Limpia nodos de texto vacíos
        return documento;
    }

    public static void cambiarPrecio(Document documento, int idBuscado, double nuevoPrecio) {

        try {
            // Cargar y normalizar el XML con el método de inicialización

            NodeList nodosAlumnos = documento.getElementsByTagName("producto");

            // Recorrer cada nodo
            for (int i = 0; i < nodosAlumnos.getLength(); i++) {
                Node nodoAlumno = nodosAlumnos.item(i);

                if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoAlumno = (Element) nodoAlumno;

                    int id = Integer.parseInt(elementoAlumno.getAttribute("id"));
                    if (id == idBuscado) {
                        elementoAlumno.getElementsByTagName("precio").item(0)
                                .setTextContent(String.valueOf(nuevoPrecio));
                        System.out.println("Entra");
                        break;
                    }

                }
            }

        } catch (Exception excepcion) {
            System.err.println("Error al leer el archivo XML: " + excepcion.getMessage());
        }

    }

    public static void guardarDocumento(Document documento, File fichero) throws Exception {
        TransformerFactory fabricaTransformador = TransformerFactory.newInstance();
        Transformer transformador = fabricaTransformador.newTransformer();
        transformador.setOutputProperty(OutputKeys.INDENT, "yes");
        transformador.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

        DOMSource origen = new DOMSource(documento);
        StreamResult destino = new StreamResult(fichero);
        transformador.transform(origen, destino);
    }

    public static void insertarEmpleado(Document doc, String nif, String nombre, double salario) {
        Element elementoRaiz = doc.getDocumentElement();
        
        Element elementoHijo = añadirElementoAtributo(doc, elementoRaiz, "empleado", "nif", nif);
        añadirElemento(doc, elementoHijo, "nombre", nombre);

        añadirElemento(doc, elementoHijo, "salario", String.valueOf(salario));

    }

    public static void añadirElemento(Document documento, Element elementoPadre, String nombreEtiqueta, String contenido) {
        Element nuevoElemento = documento.createElement(nombreEtiqueta);
        nuevoElemento.setTextContent(contenido);
        elementoPadre.appendChild(nuevoElemento);
    }

    public static Element añadirElementoAtributo(Document documento,
            Element elementoPadre,
            String nombreEtiqueta,
            String nombreAtributo, String valorAtributo) {
        Element nuevoElemento = documento.createElement(nombreEtiqueta);
        nuevoElemento.setAttribute(nombreAtributo, valorAtributo);
        elementoPadre.appendChild(nuevoElemento);
        return nuevoElemento;
    }
    public static boolean borrarEmpleado(Document doc, String nifBuscado) {
            try {
            // Cargar y normalizar el XML con el método de inicialización
            Document documento = doc;

            // Obtener todos los nodos <alumno>
            NodeList nodosAlumnos = documento.getElementsByTagName("empleado");

            // Recorrer cada nodo
            for (int i = 0; i < nodosAlumnos.getLength(); i++) {
                Node nodoAlumno = nodosAlumnos.item(i);

                if (nodoAlumno.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoAlumno = (Element) nodoAlumno;
                    String nif = elementoAlumno.getAttribute("nif");
                    
                    if(nif.equals(nifBuscado)){
                        elementoAlumno.removeChild(nodoAlumno);
                        return true;
                    }
                    
                }
            }
        } catch (Exception excepcion) {
            System.err.println("Error al leer el archivo XML: " + excepcion.getMessage());
        }
        return false;
}

}
