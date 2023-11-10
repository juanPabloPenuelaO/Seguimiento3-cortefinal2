package BiFunction; //ejemplo tomado del repositorio del profesor

import java.util.function.BiFunction;

public class claseBiFunction2 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> addNumbers = (a, b) -> a * b;

        int multi = addNumbers.apply(2, 5);
        System.out.println("la multiplicacion entre 2 y 5 es " + multi);
    }
}
