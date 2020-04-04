package main;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
    Dandu-se o lista de String-uri, afisati lungimile fiecarui
    despartite prin virgula (pe aceeasi linie)

    "aa" "b" "ccc" -> 2,1,3
 */
public class Exemplu2 {

    public static void main(String[] args) {
        List<String> list = List.of("aa", "b", "ccc");

        String res =
            list.stream()
                    .map(String::length) // x -> x.length()
                    .map(String::valueOf) // i -> String.valueOf(i)
                    .collect(Collectors.joining(","));

        System.out.println(res);
    }
}
