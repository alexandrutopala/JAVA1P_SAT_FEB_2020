package main;

import java.util.List;

/*
    Se da o lista de numere intregi (pozitive si negative)
    Se cere diferenta in modul a celor mai mici doua numere pozitive din sir

    ex1: 3 0 2 10 -> 2 (|0 - 2|)
    ex2: 2 0 3 10 -> 2 (|2 - 0|)
    ex3: -2 -1 5 10 -> 5 (|10 - 5|)
 */
public class Exemplu1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(-2, -1, 5, 10);

        int result =
            list.stream()
                    .filter(i -> i >= 0)
                    .sorted()
                    .limit(2)
                    .reduce(0, (a, b) -> Math.abs(a - b));

        System.out.println(result);
    }
}
