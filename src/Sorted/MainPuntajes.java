package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPuntajes {
    public static void main(String[] args) {
        String puntaje = "5,2,4,5,4,1,4,1,1";

        List<Integer> puntajes = Arrays.stream(puntaje.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> puntajesOrdenados = puntajes.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Puntajes de estudiantes ordenados de menor a mayor: " + puntajesOrdenados);
    }
}