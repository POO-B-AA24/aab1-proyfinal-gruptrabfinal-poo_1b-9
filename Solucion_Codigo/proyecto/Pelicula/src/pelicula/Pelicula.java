package pelicula;
// Clase que representa una película

class Pelicula {

    String titulo;
    String genero;
    double precioEntrada;

    public Pelicula(String titulo, String genero, double precioEntrada) {
        this.titulo = titulo;
        this.genero = genero;
        this.precioEntrada = precioEntrada;
    }
}

// Clase que representa un horario de proyección
class Horario {

    String hora;
    Pelicula pelicula;
    int sala;

    public Horario(String hora, Pelicula pelicula, int sala) {
        this.hora = hora;
        this.pelicula = pelicula;
        this.sala = sala;
    }
}

// Clase que gestiona la cartelera de películas
class Cartelera {

    java.util.Map<String, java.util.List<Horario>> horariosPorDia;

    public Cartelera() {
        horariosPorDia = new java.util.HashMap<>();
    }

    public void agregarHorario(String dia, Horario horario) {
        java.util.List<Horario> horarios = horariosPorDia.getOrDefault(dia, new java.util.ArrayList<>());
        horarios.add(horario);
        horariosPorDia.put(dia, horarios);
    }

    public java.util.List<Horario> getHorariosPorDia(String dia) {
        return horariosPorDia.getOrDefault(dia, new java.util.ArrayList<>());
    }
}

// Clase que representa un boleto
class Boleto {

    Horario horario;
    int cantidad;

    public Boleto(Horario horario, int cantidad) {
        this.horario = horario;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return horario.pelicula.precioEntrada * cantidad;
    }
}

// Clase que representa un producto de snack
class Snack {

    String nombre;
    double precio;

    public Snack(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
}

// Clase que representa una venta
class Venta {

    java.util.List<Boleto> boletos;
    java.util.List<Snack> snacks;

    public Venta() {
        boletos = new java.util.ArrayList<>();
        snacks = new java.util.ArrayList<>();
    }

    public void agregarBoleto(Boleto boleto) {
        boletos.add(boleto);
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public double calcularTotal() {
        double totalBoletos = boletos.stream().mapToDouble(Boleto::calcularTotal).sum();
        double totalSnacks = snacks.stream().mapToDouble(snack -> snack.precio).sum();
        return totalBoletos + totalSnacks;
    }
}