package BiFunction;

import java.util.function.BiFunction;

class ClaseBiFunction implements BiFunction<Estudiante, Profesor, String> {

    @Override
    public String apply(Estudiante estudiante, Profesor profesor) {
        return "La clase de " + estudiante.getNombre() + " es con " + profesor.getNombre();
    }

    public static void main(String[] args) {
        ClaseBiFunction claseBiFunction = new ClaseBiFunction();

        Estudiante estudiante = new Estudiante("Juan Pablo");
        Profesor profesor = new Profesor("JulioProfe");

        String mensaje = claseBiFunction.apply(estudiante, profesor);
        System.out.println(mensaje);
    }
}
