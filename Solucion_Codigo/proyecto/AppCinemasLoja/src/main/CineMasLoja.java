package main;

import Controller.CineMasLojaController;
import Model.Cartelera;
import Model.Horario;
import Model.Pelicula;
import View.CineMasLojaView;
import model.*;

public class CineMasLoja {
    public static void main(String[] args) {
        // Crear películas
        Pelicula pelicula1 = new Pelicula("Titanic", "Romance/Drama", 5.0);
        Pelicula pelicula2 = new Pelicula("Star Wars", "Ciencia Ficción/Aventura", 6.0);

        // Crear horarios
        Horario horario1 = new Horario("12:00", pelicula1, 1);
        Horario horario2 = new Horario("15:00", pelicula2, 2);
        Horario horario3 = new Horario("18:00", pelicula1, 1);

        // Crear cartelera
        Cartelera cartelera = new Cartelera();
        cartelera.agregarHorario("Lunes", horario1);
        cartelera.agregarHorario("Martes", horario2);
        cartelera.agregarHorario("Miércoles", horario3);

        // Crear vista
        CineMasLojaView view = new CineMasLojaView();

        // Crear controlador
        CineMasLojaController controller = new CineMasLojaController(cartelera, view);

        // Iniciar la aplicación
        controller.iniciar();
    }
}