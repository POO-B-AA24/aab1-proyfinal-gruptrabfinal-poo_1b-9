package Model;

public class Pelicula {
    private String titulo;
    private String genero;
    private double precioEntrada;

    public Pelicula(String titulo, String genero, double precioEntrada) {
        this.titulo = titulo;
        this.genero = genero;
        this.precioEntrada = precioEntrada;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }
}