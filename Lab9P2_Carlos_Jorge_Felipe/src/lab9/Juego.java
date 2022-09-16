
package lab9;

import java.util.ArrayList;

public class Juego {
    
    private int id;
    private String categoria;
    private double costo;
    private String nombre;
    private ArrayList<Idiomas> idiomas = new ArrayList();

    public Juego() {
    }

    public Juego(int id, String categoria, double costo, String nombre) {
        this.id=id;
        this.categoria = categoria;
        this.costo = costo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Idiomas> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<Idiomas> idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
