package datas;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Aldea implements Serializable{
    private String nombre;
    private Map <Integer, Aldeano> mapaAladeanos = new HashMap<>();

    //Constructor
    public Aldea() {
        cargarFichero();
    }

    //Getters y setters
    public Map<Integer, Aldeano> getMapaAladeanos() {
        return mapaAladeanos;
    }
    public void setMapaAladeanos(Map<Integer, Aldeano> mapaAladeanos) {
        this.mapaAladeanos = mapaAladeanos;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public void cargarFichero() {
        try {
            //Voy a abrir un canal de lectura de objetos sobre un fichero binario
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aldea.dat"));
            Aldea aldeaLeida = (Aldea) ois.readObject();
            this.setMapaAladeanos(aldeaLeida.getMapaAladeanos());
            this.setNombre(aldeaLeida.getNombre());
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
            oos.writeObject(this); //Poniendo this nos referimos a este club, este objeto
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
