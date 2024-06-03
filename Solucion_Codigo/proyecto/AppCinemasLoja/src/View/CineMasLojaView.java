package View;
import Model.Cartelera;
import Model.Horario;
import java.util.List;
import java.util.Scanner;

public class CineMasLojaView {
    public void mostrarCartelera(Cartelera cartelera, String dia) {
        List<Horario> horariosDisponibles = cartelera.getHorariosPorDia(dia);
        if (horariosDisponibles.isEmpty()) {
            System.out.println("No hay funciones disponibles para este día.");
        } else {
            System.out.println("Horarios disponibles para " + dia + ":");
            for (int i = 0; i < horariosDisponibles.size(); i++) {
                Horario horario = horariosDisponibles.get(i);
                System.out.println((i + 1) + ". " + horario.getHora() + " - " + horario.getPelicula().getTitulo());
            }
        }
    }

    public int seleccionarFuncion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el número de la función que desea ver:");
        return scanner.nextInt();
    }

    public int solicitarCantidadBoletos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos boletos desea comprar?");
        return scanner.nextInt();
    }

    public void mostrarTotal(double total) {
        System.out.println("El total a pagar es: $" + total);
    }
}
