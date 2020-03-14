package main;

import java.util.List;

public class Exemplu3 {

    /*
        Dandu-se o lista de nr intregi, afisati cele mai mici trei numere,
        ordonate crescator, distincte, impare
     */
    public static void main(String[] args) {
        List.of(2, 4, 1, 10, 5, 20, 1, 40, 58).stream()
                .filter(i -> i % 2 != 0) // da la o parte numerel pare
                .distinct() // elimin duplicatele de pe stream
                .sorted() // sortez elementele ramase
                .limit(3) // iau doar primele 3 elemente
                .forEach(System.out::println);
    }
}
