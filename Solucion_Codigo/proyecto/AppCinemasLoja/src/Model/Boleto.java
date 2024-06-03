package Model;

public class Boleto {
    private Horario horario;
    private int cantidad;

    public Boleto(Horario horario, int cantidad) {
        this.horario = horario;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return horario.getPelicula().getPrecioEntrada() * cantidad;
    }
}