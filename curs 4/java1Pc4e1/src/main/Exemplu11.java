package main;

import java.util.stream.Stream;

public class Exemplu11 {

    public static void main(String[] args) throws InterruptedException {
        EvenNumbersThread t1 = new EvenNumbersThread();
        Runnable task = Exemplu11::showOddNumbers; //() -> showOddNumbers();
        Thread t2 = new Thread(task);

        t2.start();
        t1.start();

        t1.join(); // firul main asteapta pana se termina t1
        t2.join(); // firul main asteapta pana se termina t2

        System.out.println("End main");
    }

    private static void showOddNumbers() {
        Stream.iterate(1, i -> i + 2)
                .takeWhile(i -> i < 20)
                .forEach(System.out::println);
        System.out.println("Odd numbers");
    }
}
