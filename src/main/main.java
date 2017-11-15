package main;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class main {
    static HashMap<Integer,Libro> todosLibros = new HashMap<Integer, Libro>();

    static File mestre = new File("mestre.txt");
    static File altes = new File("altes.txt");
    static File salida = new File("salida.txt");

    public static void main(String[] args){
        try {
            readAllLibros(mestre);
            readAllLibros(altes);
            writeOutAll(salida);
        }
        catch (Exception e){

        }

    }

    public static String[] splitStringX(String algo) {
        String conversor = algo;
        String[] splitString = conversor.split(":");
        return splitString;
    }

    public static void readAllLibros(File doc){
        try {
            FileReader fr = new FileReader(doc);
            BufferedReader br = new BufferedReader(fr);
            String linea1;

            while ((linea1 = br.readLine()) != null) {
                String[] temp = splitStringX(linea1);
                int lId = Integer.parseInt(temp[0]);
                String lTipus = temp[1];
                String lTitul = temp[2];
                String lAutor = temp[3];
                double lPreu = Double.parseDouble(temp[4]);
                int lStock = Integer.parseInt(temp[5]);

                Libro n = new Libro(lId,lTipus,lTitul,lAutor,lPreu,lStock);

                todosLibros.put(lId,n);
            }
            br.close();
            System.out.println(todosLibros);
        }
        catch (Exception e){

        }
    }

    public static void writeOutAll(File doc){
        try {
            FileWriter fw = new FileWriter(doc);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Map.Entry<Integer,Libro> entry : todosLibros.entrySet()){

                String finalText =
                        entry.getValue().getId()+":"+entry.getValue().getTipus()+ ":"+
                        entry.getValue().getTitol()+":"+entry.getValue().getAutor()+":"+
                        entry.getValue().getPreu()+":"+entry.getValue().getStock() + System.getProperty("line.separator");

                System.out.println(finalText);
                bw.write(finalText);
            }
            bw.close();
        }catch (Exception e){

        }
    }
}
