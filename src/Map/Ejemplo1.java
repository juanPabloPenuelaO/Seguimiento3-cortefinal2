package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Ejemplo1 {
    public static void main(String[] args) {
        List<Equipos> lista = Arrays.asList(new Equipos("Nacional","Medellin",33), new Equipos("Millonarios", "Bogota", 30));
        List<Equipos> listatransform = lista.stream()
                .map(equipo -> {
                            equipo.setCity(equipo.getCity());
                            equipo.setName(equipo.getName().toUpperCase());
                            equipo.setPoints(equipo.getPoints());
                            return equipo;
                        }
                )
                .collect(Collectors.toList());
        listatransform.forEach(equipo -> System.out.println(" El equipo " + equipo.getName() + " Es de la ciudad de: " +
                equipo.getCity() + " Y obtuvo: " + equipo.getPoints() +" Puntos."));
    }
}

