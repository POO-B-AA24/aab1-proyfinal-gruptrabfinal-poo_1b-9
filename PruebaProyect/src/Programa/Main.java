package Programa;

import Controller.ControladorPelicula;
import Model.Pelicula;
import View.viewPelicula;

public class Main {
    public static void main(String[] args) {
        Pelicula modelo = new Pelicula("La Monja", "22:00", 8.25);
        viewPelicula vista = new viewPelicula();
        ControladorPelicula controlador = new ControladorPelicula(modelo, vista);
        
        controlador.Start();
    }
}
