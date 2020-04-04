package main;

import java.util.List;

/*
    Stream<Object>
    IntStream     -> int
    LongStream    -> long
    DoubleStream  -> double

    Stream<Object> ---->  mapToInt(ToIntFunction)         ----> IntStream
    Stream<Object> ---->  mapToLong(ToLongFunction)       ----> LongStream
    Stream<Object> ---->  mapToDouble(ToDoubleFunction)   ----> DoubleStream

    IntStream ----> mapToLong(IntToLongFunction)     ----> LongStream
    IntStream ----> mapToDouble(IntToDoubleFunction) ----> DoubleStream
    IntStream ----> mapToObj(IntFunction)            ----> Stream<Object>
 */
/*
    Dandu-se o lista de stringuri, afisati suma lungimilor lor
 */
public class Exemplu8 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "bb", "c");

        int sum =
            list.stream()
                    .mapToInt(String::length) // s -> s.length
                    .sum(); // <=> reduce(0, (a, b) -> a+b)

        System.out.println(sum);
    }
}
