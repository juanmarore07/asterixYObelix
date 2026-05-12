package datas;

import java.io.Serializable;

public class Aldeano implements Serializable {
    private String nombre;
    private String profesion;
    private int romanosDerrotados;

    //Constructor
    public Aldeano(String nombre, String profesion, int romanosDerrotados) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.romanosDerrotados = romanosDerrotados;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getRomanosDerrotados() {
        return romanosDerrotados;
    }
    public void setRomanosDerrotados(int romanosDerrotados) {
        this.romanosDerrotados = romanosDerrotados;
    }

    //Métodos
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Profesión: " + this.profesion + " Romanos derrotados: " + this.romanosDerrotados + "\n";
    }
}
