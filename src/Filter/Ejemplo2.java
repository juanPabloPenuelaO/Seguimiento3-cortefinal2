package Filter;

import java.util.Arrays;
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<Ropa> lista = Arrays.asList(
                new Ropa("Camisa","Manga larga",50000),
                new Ropa("Pantalon","Jean",100000),
                new Ropa("Gorra","Plana",80000)
        );
        List<Ropa> ePrice = lista.stream()
                .filter(e-> e.getPrice() > 70000 && e.getName().startsWith("P"))
                .toList();
        ePrice.forEach(p-> System.out.println(p.getName() + " " + p.getType() + " " + p.getPrice()));
    }
}

