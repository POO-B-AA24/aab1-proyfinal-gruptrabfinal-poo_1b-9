package Model;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private List<Boleto> boletos;
    private List<Snack> snacks;

    public Venta() {
        boletos = new ArrayList<>();
        snacks = new ArrayList<>();
    }

    public void agregarBoleto(Boleto boleto) {
        boletos.add(boleto);
    }

    public void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public double calcularTotal() {
        double totalBoletos = boletos.stream().mapToDouble(Boleto::calcularTotal).sum();
        double totalSnacks = snacks.stream().mapToDouble(Snack::getPrecio).sum();
        return totalBoletos + totalSnacks;
    }
}