package Filter;

import java.util.Arrays;
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<Productos> lista = Arrays.asList(
                new Productos("Poker",50,4500),
                new Productos("Pepsi",40,5000),
                new Productos("Sprite",70,3000)
        );
        List<Productos> ePrice = lista.stream()
                .filter(e->e.getPrice() > 4000 && e.getName().startsWith("P"))
                .toList();
        ePrice.forEach(p -> System.out.println(p.getName()+ " " + p.getPrice()));
    }
}

