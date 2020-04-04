package main;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
    Dandu-se o lista de nr. intregi, realizati o noua lista
    doar cu nr. pare din lista initiala
 */
public class Exemplu3 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        List<Integer> res =
            list.stream()
                    .filter(x -> x%2 == 0)
                    .collect(Collectors.toList());


        Set<Integer> res1 =
            list.stream()
                    .filter(x -> x%2 == 0)
                    .collect(Collectors.toSet());


        System.out.println(res);

        LinkedHashSet<Integer> set =
                list.stream()
                    .filter(x -> x%2 == 0)
                    .collect(Collectors.toCollection(
                            LinkedHashSet::new //() -> new LinkedHashSet<>()
                    ));
    }
}
