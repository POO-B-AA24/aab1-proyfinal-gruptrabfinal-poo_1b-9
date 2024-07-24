package Controller;
import Model.Factura;
import Model.Pelicula;
import Model.Snack;
import View.CineView;
import java.util.ArrayList;
import java.util.List;

public class CineController {
    private List<Pelicula> peliculas;
    private List<Snack> snacks;
    private CineView vista;

    public CineController(CineView vista) {
        this.peliculas = new ArrayList<>();
        this.snacks = new ArrayList<>();
        this.vista = vista;
        inicializarDatos();
    }

    private void inicializarDatos() {
        // Añadir películas
        peliculas.add(new Pelicula("Avengers", "18:00"));
        peliculas.add(new Pelicula("Toy Story", "16:00"));

        // Añadir snacks
        snacks.add(new Snack("Palomitas", 5.0));
        snacks.add(new Snack("Refresco", 3.0));
    }

    public void mostrarPeliculas() {
        vista.mostrarPeliculas(peliculas);
    }

    public void mostrarSnacks() {
        vista.mostrarSnacks(snacks);
    }

    public void crearFactura() {
        Factura factura = new Factura(peliculas, snacks);
        ArchivoUtil.guardarFactura(factura, "factura.dat");
        Factura facturaLeida = ArchivoUtil.leerFactura("factura.dat");
        if (facturaLeida != null) {
            vista.mostrarFactura(facturaLeida);
        } else {
            vista.mostrarMensaje("Error al leer la factura desde el archivo.");
        }
    }
}
