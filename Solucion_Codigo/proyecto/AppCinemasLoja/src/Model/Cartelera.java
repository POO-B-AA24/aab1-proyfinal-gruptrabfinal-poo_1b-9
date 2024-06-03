package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cartelera {
    private Map<String, List<Horario>> horariosPorDia;

    public Cartelera() {
        horariosPorDia = new HashMap<>();
    }

    public void agregarHorario(String dia, Horario horario) {
        List<Horario> horarios = horariosPorDia.getOrDefault(dia, new ArrayList<>());
        horarios.add(horario);
        horariosPorDia.put(dia, horarios);
    }

    public List<Horario> getHorariosPorDia(String dia) {
        return horariosPorDia.getOrDefault(dia, new ArrayList<>());
    }
}