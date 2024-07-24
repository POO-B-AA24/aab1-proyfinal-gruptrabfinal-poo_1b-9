package Programa;
public class CineSinLoja {
    public static void main(String[] args) {
        CineView vista = new CineView();
        CineController controlador = new CineController(vista);

        controlador.mostrarPeliculas();
        controlador.mostrarSnacks();
        controlador.crearFactura();
    }
}
