package main;

import java.util.stream.Stream;

public class Exemplu2 {







    // java.util.stream
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty();

        Stream<Integer> s2 = Stream.iterate(1, i -> i + 2);

        Stream<Integer> s3 = Stream.generate(() -> 1);

        Stream<Integer> s4 = Stream.of(1, 22, 5, 10);

        s2.limit(20).forEach(x -> System.out.println(x));

        System.out.println("================");

        Stream.iterate(1, i -> i + 2)
                .takeWhile(i -> i < 20)
                .forEach(System.out::println); // x -> System.out.println(x) sau System.out::println
    }
}
