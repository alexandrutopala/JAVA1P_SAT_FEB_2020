package main;

import java.util.stream.Stream;

public class EvenNumbersThread extends Thread {

    @Override
    public void run() {
        Stream.iterate(0, i -> i + 2)
                .takeWhile(i -> i <= 20)
                .forEach(System.out::println);
    }
}
