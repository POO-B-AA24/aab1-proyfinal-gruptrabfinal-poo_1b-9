/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula;

/**
 *
 * @author sanma
 */
public class Main {

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

        // Simular venta de boletos
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Bienvenido al CineMas-Loja");
        System.out.println("Seleccione un día para ver la cartelera: ");
        String diaSeleccionado = scanner.nextLine();
        java.util.List<Horario> horariosDisponibles = cartelera.getHorariosPorDia(diaSeleccionado);
        if (horariosDisponibles.isEmpty()) {
            System.out.println("No hay funciones disponibles para este día.");
        } else {
            System.out.println("Horarios disponibles para " + diaSeleccionado + ":");
            for (int i = 0; i < horariosDisponibles.size(); i++) {
                Horario horario = horariosDisponibles.get(i);
                System.out.println((i + 1) + ". " + horario.hora + " - " + horario.pelicula.titulo);
            }
            System.out.println("Seleccione el número de la función que desea ver:");
            int opcionFuncion = scanner.nextInt();
            Horario horarioSeleccionado = horariosDisponibles.get(opcionFuncion - 1);

            System.out.println("¿Cuántos boletos desea comprar?");
            int cantidadBoletos = scanner.nextInt();
            Boleto boleto = new Boleto(horarioSeleccionado, cantidadBoletos);

            System.out.println("El total a pagar es: $" + boleto.calcularTotal());
        }

        scanner.close();
    }
}
