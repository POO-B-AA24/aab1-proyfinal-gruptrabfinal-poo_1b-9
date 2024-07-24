package View;

public class viewPelicula {

    public void MostrarInfo(String titulo, String horario, double precio) {
        System.out.println("Titulo: " + titulo);
        System.out.println("horario: " + horario);
        System.out.printf("Precio: $%.2f%n", precio);
    }
    public void MostrarMensaje(String mensaje){
        System.out.println(mensaje);
        
    }
}
