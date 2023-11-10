package Predicate;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import java.util.function.Predicate;

public class VerificadorContraseña {

    public static Predicate<String> esContraseñaCorrecta(String contraseñaCorrecta) {
        return contraseña -> contraseña.equals(contraseñaCorrecta);
    }

    public static void main(String[] args) {
        String contraseñaCorrecta = "12345";

        Predicate<String> verificaContraseña = esContraseñaCorrecta(contraseñaCorrecta);

        String contraseña1 = "12345";
        String contraseña2 = "11111";

        boolean esCorrecta1 = verificaContraseña.test(contraseña1);
        boolean esCorrecta2 = verificaContraseña.test(contraseña2);

        System.out.println(esCorrecta1); // true
        System.out.println(esCorrecta2); // false
    }
}

