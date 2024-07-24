package Model;

import java.io.Serializable;
import java.util.List;

public class Factura implements Serializable {
    private List<Pelicula> peliculas;
    private List<Snack> snacks;

    public Factura(List<Pelicula> peliculas, List<Snack> snacks) {
        this.peliculas = peliculas;
        this.snacks = snacks;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    public void setSnacks(List<Snack> snacks) {
        this.snacks = snacks;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "peliculas=" + peliculas +
                ", snacks=" + snacks +
                '}';
    }
}
