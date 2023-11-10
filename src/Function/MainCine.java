package Function;

public class MainCine {
    public static void main(String[] args) {
        ReservaCine<String> cineReserva = new ReservaCine<>();

        cineReserva.hacerReserva("A1", 2);
        cineReserva.hacerReserva("B3", 3);
        cineReserva.hacerReserva("C2", 1);
        cineReserva.hacerReserva("A1", 1);

        cineReserva.cancelarReserva("B3");

        cineReserva.mostrarReservas();
    }
}

