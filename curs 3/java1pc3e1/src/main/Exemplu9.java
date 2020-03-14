package main;

import java.util.List;

public class Exemplu9 {

    /*
        Dandu-se o lista de nr intregi, afisati daca toate
        sunt numere impare
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 5, 7);

        boolean b =
            list.stream()
                    .allMatch(i -> i % 2 != 0);
        // allMatch - toate elementele de pe stream respecta conditia data
        // anyMatch - cel putin un element de pe stream respecta conditia data
        // noneMatch - niciun element de pe stream nu respecta conditia data

        System.out.println(b);
    }
}
