package main;

import java.util.List;

public class Exemplu7 {

    /*
        Afisati cate dintre sirurile date au lungime
        divizibila cu 3
     */
    public static void main(String[] args) {
        List<String> list = List.of("aaa", "b", "cc", "d");

        long count =
            list.stream()
                    .map(String::length) // s -> s.lenght() sau String::length
                    .filter(l -> l % 3 == 0)
                    .count();

        System.out.println(count);
    }
}
