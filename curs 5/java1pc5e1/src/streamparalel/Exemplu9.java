package streamparalel;

import java.util.List;

public class Exemplu9 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 3, 2, 5, 6, 10);

        list.parallelStream()
                .filter(x -> x % 2 == 1)
                .forEachOrdered(System.out::println);
    }
}
