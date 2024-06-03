package Controller;
import Model.Horario;
import Model.Boleto;
import Model.Cartelera;
import View.CineMasLojaView;

import java.util.Scanner;

public class CineMasLojaController {
    private Cartelera cartelera;
    private CineMasLojaView view;

    public CineMasLojaController(Cartelera cartelera, CineMasLojaView view) {
        this.cartelera = cartelera;
        this.view = view;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al CineMas-Loja");
        System.out.println("Seleccione un día para ver la cartelera: ");
        String diaSeleccionado = scanner.nextLine();

        view.mostrarCartelera(cartelera, diaSeleccionado);
        int opcionFuncion = view.seleccionarFuncion();
        Horario horarioSeleccionado = cartelera.getHorariosPorDia(diaSeleccionado).get(opcionFuncion - 1);

        int cantidadBoletos = view.solicitarCantidadBoletos();
        Boleto boleto = new Boleto(horarioSeleccionado, cantidadBoletos);

        view.mostrarTotal(boleto.calcularTotal());
        
        scanner.close();
    }
}