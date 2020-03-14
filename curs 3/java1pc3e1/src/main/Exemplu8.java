package main;

import java.util.Collection;
import java.util.List;

public class Exemplu8 {

    /*
        Dandu-se o lista de stringuri, afisati numarul de vocale care
        exista in stringuri date
     */
    public static void main(String[] args) {
        List<String> list = List.of("aa", "bc", "ad", "bec");

        long count =
            list.stream()
                    .map(s -> s.split("\\s*")) // Stream<String> -> Stream<String[]>
                    .map(List::of) // sa -> List.of(sa) // Stream<String[]> -> Stream<List<String>>
                    .flatMap(Collection::stream) // ls -> ls.stream // mapam listele date la stream, si concatenam stream-urile rezultate
                                                                    // obtinand unul singur
                    .filter("aeiou"::contains) // c -> "aeiou".contains(c)
                    .count();

        System.out.println(count);
    }
}
