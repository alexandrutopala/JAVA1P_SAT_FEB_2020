package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Dandu-se o lista de nr. intregi, creati doua colectii:
     - una cu numerele pare
     - cealalta cu numerele impare
 */
public class Exemplu7 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> res =
            list.stream()
                    .collect(Collectors.partitioningBy(
                            x -> x % 2 == 0
                    ));

        System.out.println(res);
    }
}
