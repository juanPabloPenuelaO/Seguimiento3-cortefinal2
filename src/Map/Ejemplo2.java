package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Ejemplo2 {
    public static void main(String[] args) {
        List<Aviones> lista = Arrays.asList(new Aviones("Airbus","Qatar",853,"a380"),
                new Aviones("Boeing","Luftansa",660,"b747"));
        List<Aviones> listatransform = lista.stream()
                .map(avion -> {
                            avion.setAirline(avion.getAirline());
                            avion.setBrand(avion.getBrand());
                            avion.setCapacity(avion.getCapacity()/2);
                            avion.setModel(avion.getModel().toUpperCase());
                            return avion;
                        }
                )
                .collect(Collectors.toList());
        listatransform.forEach(avion -> System.out.println(avion.getBrand() + " - " + avion.getAirline() + " - " + avion.getModel()
                + " - " + avion.getCapacity() + " Pasajeros."));
    }
}
