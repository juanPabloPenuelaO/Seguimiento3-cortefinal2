package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainEdades {
    public static void main(String[] args) {
        String edades = "78, 15, 18, 26, 21, 81, 33, 5, 41";

        // Convertir la cadena de edades en una lista de enteros
        List<Integer> listaEdades = Arrays.stream(edades.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // Ordenar la lista de edades utilizando el método sorted() de streams
        List<Integer> edadesOrdenadas = listaEdades.stream()
                .sorted()
                .collect(Collectors.toList());

        // Imprimir las edades ordenadas
        System.out.println("Edades ordenadas: " + edadesOrdenadas);
    }
}