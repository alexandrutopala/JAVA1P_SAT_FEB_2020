package main;

import java.util.List;

/*
    Dandu-se o lista de nr. intregi, afisati-le
    pe cele pare, distinct

 */
public class Exemplu4 {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 3, 4, 4);

        list.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }
}
