package Model;

public class Horario {
    private String hora;
    private Pelicula pelicula;
    private int sala;

    public Horario(String hora, Pelicula pelicula, int sala) {
        this.hora = hora;
        this.pelicula = pelicula;
        this.sala = sala;
    }

    public String getHora() {
        return hora;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getSala() {
        return sala;
    }
}