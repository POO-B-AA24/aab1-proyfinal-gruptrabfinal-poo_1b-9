package Model;
import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private String horario;
    private double precio;

    public Pelicula(String titulo, String horario, double precio) {
        this.titulo = titulo;
        this.horario = horario;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}