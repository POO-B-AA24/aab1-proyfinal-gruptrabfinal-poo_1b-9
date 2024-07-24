package Controller;

import Model.Pelicula;
import View.viewPelicula;
import java.util.Scanner;

public class ControladorPelicula {

    private Pelicula modelo;
    private viewPelicula vista;

    public ControladorPelicula(Pelicula modelo, viewPelicula vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void ActualizarVista() {
        vista.MostrarInfo(modelo.getTitulo(), modelo.getHorario(), modelo.getPrecio());
    }

    public void setPeliculaTitulo(String titulo) {
        modelo.setTitulo(titulo);
    }

    public void setPeliculaHorario(String horario) {
        modelo.setHorario(horario);
    }

    public void setPeliculaPrecio(double precio) {
        modelo.setPrecio(precio);
    }

    public void Start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            vista.MostrarMensaje("Elija una opción:");
            vista.MostrarMensaje("1. Ver información de la película");
            vista.MostrarMensaje("2. Modificar título");
            vista.MostrarMensaje("3. Modificar horario");
            vista.MostrarMensaje("4. Modificar precio");
            vista.MostrarMensaje("5. Salir");

            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    ActualizarVista();
                    break;
                case 2:
                    vista.MostrarMensaje("Ingrese el nuevo Titulo: ");
                    String nuevoTitulo = sc.nextLine();
                    setPeliculaTitulo(nuevoTitulo);
                    break;
                case 3:
                    vista.MostrarMensaje("Ingrese el nuevo Horario: ");
                    String nuevoHorario = sc.nextLine();
                    setPeliculaHorario(nuevoHorario);
                    break;
                case 4:
                    vista.MostrarMensaje("Ingrese el nuevo Precio: ");
                    double nuevoPrecio = sc.nextDouble();
                    setPeliculaPrecio(nuevoPrecio);
                    break;
                case 5:
                    vista.MostrarMensaje("Saliendo.. ");
                    sc.close();
                    return;
                default:
                    vista.MostrarMensaje("Opcion no válida, intenSte nuevamente");
            }
        }
    }
}
