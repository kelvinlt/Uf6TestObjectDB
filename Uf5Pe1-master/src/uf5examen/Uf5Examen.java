package uf5examen;

import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Uf5Examen {
    public static void main(String[] args) {
        HashMap<String, Pelicula> todasPeliculas = new HashMap<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/hitchcock.xml"));
            NodeList peliculas = document.getElementsByTagName("pelicula");
            
            for (int i = 0; i < peliculas.getLength(); i++) {
                Element elem1 = (Element) peliculas.item(i);
                
                NodeList titulo = elem1.getElementsByTagName("titulo");
                Element elem2 = (Element) titulo.item(0);
                
                NodeList fecha = elem1.getElementsByTagName("fecha");
                Element elem3 = (Element) fecha.item(0);
                
                NodeList actor = elem1.getElementsByTagName("actor");
                Element elem4 = (Element) actor.item(0);
                
                NodeList actriz = elem1.getElementsByTagName("actriz");
                Element elem5 = (Element) actriz.item(0);
                
                String tTitulo = elem2.getFirstChild().getNodeValue();
                int tFecha = Integer.parseInt(elem3.getFirstChild().getNodeValue());
                String[] tActores = {elem4.getFirstChild().getNodeValue(),elem5.getFirstChild().getNodeValue()};
                
                Pelicula tPelicula = new Pelicula(tTitulo, tFecha, tActores);
                todasPeliculas.put(tTitulo, tPelicula);
                System.out.println("Introducido en el HashMap: " + tPelicula);
                
                
            }
            System.out.println(todasPeliculas);
            
            System.out.println("-------------------------------------");
            
            System.out.println("Tryout de salida con xml");
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document documentOut = documentBuilder.newDocument();
            
            Element root = documentOut.createElement("Peliculas");
            documentOut.appendChild(root);
            Element pelicula = documentOut.createElement("pelicula");
            root.appendChild(pelicula);
            Element titulo = documentOut.createElement("titulo");
            pelicula.appendChild(titulo);
            Text text = documentOut.createTextNode("test");
            titulo.appendChild(text);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource origen = new DOMSource(documentOut);
            StreamResult desti = new StreamResult(new File("src/test.xml"));
            transformer.transform(origen, desti);
            
            System.out.println("-------------------------------------");
            System.out.println("Tryout de treeset");
            Set<String> claus = todasPeliculas.keySet();
            
            TreeSet<String> clausOrdenades = new TreeSet(claus);
            
            for (String clau : clausOrdenades) {
                System.out.printf("%-10s%10s\n", clau, todasPeliculas.get(clau));
            }
            
            System.out.println("-------------------------------------");
            System.out.println("");
            
            System.out.println("-------------------------------------");
        } catch (Exception e) {
            System.out.println(e);
        }


    }

}
