package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

//Single Functions Lambdas with one return type
        Function<String, String> upperCaseName = name -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        // Bi Functional Method with two return types
        BiFunction<String, Integer, String> upperCaseName2 = (name, age) -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        String nAme = upperCaseName2.apply("Joshua", 30);

        System.out.println(nAme);

    }
}
