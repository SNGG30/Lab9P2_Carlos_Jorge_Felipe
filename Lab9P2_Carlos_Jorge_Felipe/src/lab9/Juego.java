
package lab9;

import java.util.ArrayList;

public class Juego {
    
    private int id;
    private String categoria;
    private double costo;
    private String nombre;
    private String idiomas;

    public Juego() {
    }

    public Juego(int id, String categoria, double costo, String nombre, String idiomas) {
        this.id=id;
        this.categoria = categoria;
        this.costo = costo;
        this.nombre = nombre;
        this.idiomas=idiomas;
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

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    
    
    @Override
    public String toString() {
        return nombre;
    }
    
}
