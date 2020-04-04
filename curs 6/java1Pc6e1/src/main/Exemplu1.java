package main;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Exemplu1 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Void> task = new PrintTask(List.of(2, 6, 2, 8, 5, 3));

        pool.invoke(task);
    }
}
