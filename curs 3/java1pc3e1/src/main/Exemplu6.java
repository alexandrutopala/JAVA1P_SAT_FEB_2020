package main;

import java.util.List;

public class Exemplu6 {

    /*
        Dandu-se o lista de stringuri, afisati suma lungimilor lor
     */
    public static void main(String[] args) {
        List<String> list = List.of("aaa", "b", "cc", "d");

        int sum =
            list.stream()
                    .map(s -> s.length())
                    .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
