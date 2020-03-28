package forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Exemplu8 {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> task = new MaxTask(List.of(3, 5, 1, 7, 10, 9, 3));

        Integer max = pool.invoke(task);

        System.out.println(max);
    }
}
