package main;

import java.util.List;
import java.util.OptionalDouble;

/*
    Dandu-se o lista de stringuri, afisati media lungimilor lor
 */
public class Exemplu9 {

    public static void main(String[] args) {
        List<String> list = List.of("a", "bb", "c");

        // [-1 1] : 0 ?
        // [] : 0 ?
        OptionalDouble avg =
                list.stream()
                        .mapToInt(String::length) // s -> s.length
                        .average();

        System.out.println(avg);

        double x = avg.getAsDouble(); // daca este goala cutia, vom primi NullPointerException
        double x1 = avg.orElse(0.0); // incearca sa ia valoarea din cutie, iar nu exista,
                                           //   ne da valoarea default 0.0
        double x2 = avg.orElseGet(() -> {
            double defaultValue = 0.0;
            return defaultValue;
        });

        double x3 = avg.orElseThrow(() -> new IllegalArgumentException("Colectia nu poate fi vida"));

        System.out.println(avg.isPresent());

        avg.ifPresent(x4 -> System.out.println(x4));
        /*
        if (avg.isPresent()) {
            System.out.println(avg.getAsDouble());
        }
         */
    }
}
