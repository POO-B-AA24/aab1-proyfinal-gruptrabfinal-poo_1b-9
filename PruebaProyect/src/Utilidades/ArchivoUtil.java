package Utilidades;
import java.io.*;
import 

public class ArchivoUtil {

    public static void guardarFactura(Factura factura, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(factura);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Factura leerFactura(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (Factura) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
