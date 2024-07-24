package View;
import Model.Factura;
import Model.Pelicula;
import Model.Snack;
import java.util.List;
import java.util.Scanner;

public class CineView {
    public static void main(String[] args) {
        
    private Scanner scanner = new Scanner(System.in);

    public void mostrarPeliculas(List<Pelicula> peliculas) {
        System.out.println("Películas disponibles:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
    }

    public void mostrarSnacks(List<Snack> snacks) {
        System.out.println("Snacks disponibles:");
        for (Snack snack : snacks) {
            System.out.println(snack);
        }
    }

    public void mostrarFactura(Factura factura) {
        System.out.println("Factura:");
        System.out.println(factura);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}