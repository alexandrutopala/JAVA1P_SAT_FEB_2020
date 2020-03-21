package main;

import java.util.Optional;

public class Exemplu10 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty();

        Optional<String> o2 = Optional.of("hello"); // daca valoare data ca parametru este nula,
                                                    // vom primi o exceptie

        Optional<String> o3 = Optional.ofNullable(null);

        System.out.println(o3.isPresent());
    }
}
