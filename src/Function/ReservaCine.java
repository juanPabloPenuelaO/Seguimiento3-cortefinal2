package Function;

import java.util.HashMap;
import java.util.Map;

class ReservaCine<T> {
    private Map<T, Integer> reservas;

    public ReservaCine() {
        this.reservas = new HashMap<>();
    }

    public void hacerReserva(T asiento, int cantidadPersonas) {
        if (reservas.containsKey(asiento)) {
            System.out.println("El asiento " + asiento + " ya está reservado.");
        } else {
            reservas.put(asiento, cantidadPersonas);
            System.out.println("Reserva realizada para el asiento " + asiento + " para " + cantidadPersonas + " personas.");
        }
    }

    public void cancelarReserva(T asiento) {
        if (reservas.containsKey(asiento)) {
            reservas.remove(asiento);
            System.out.println("Reserva para el asiento " + asiento + " cancelada.");
        } else {
            System.out.println("El asiento " + asiento + " no está reservado.");
        }
    }

    public void mostrarReservas() {
        System.out.println("Lista de reservas:");
        for (Map.Entry<T, Integer> entry : reservas.entrySet()) {
            System.out.println("Asiento: " + entry.getKey() + ", Personas: " + entry.getValue());
        }
    }
}
