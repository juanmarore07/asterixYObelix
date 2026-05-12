package datas;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Aldea {
    Map <String, Aldeano> mapaAladeanos = new HashMap<>();

    //Constructor
    public Aldea() {
        cargarFichero();
    }

    //Getters y setters
    public Map<String, Aldeano> getMapaAladeanos() {
        return mapaAladeanos;
    }

    public void setMapaAladeanos(Map<String, Aldeano> mapaAladeanos) {
        this.mapaAladeanos = mapaAladeanos;
    }

    //Métodos
    public void cargarFichero() {
        try {
            //Voy a abrir un canal de lectura de objetos sobre un fichero binario
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aldea.dat"));
            setMapaAladeanos((Map<String, Aldeano>) ois.readObject());
            ois.close();

        } catch (FileNotFoundException e) {
            System.out.println("El fichero aldea.dat no existe");
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void escribirDatosFichero() {
        //Tengo que meter los datos de este club (this) en un fichero
        try {
            //Voy a abrir un canal de escritura de objetos sobre un fichero binario
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aldea.dat"));
            oos.writeObject(mapaAladeanos); //Poniendo this nos referimos a este club, este objeto
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
