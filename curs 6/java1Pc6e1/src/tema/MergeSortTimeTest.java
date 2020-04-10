package tema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortTimeTest {

    public static void main(String[] args) {
        List<Integer> list = generateList(1_000_000);

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<List<Integer>> task = new MergeTask(list);

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        pool.invoke(task);
        endTime = System.currentTimeMillis();

        System.out.println("Paralel: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        Collections.sort(list);
        endTime = System.currentTimeMillis();

        System.out.println("Secvential: " + (endTime - startTime));
    }

    private static List<Integer> generateList(int elements) {
        Random random = new Random();

        return Stream.iterate(0, i -> i + 1)
                .limit(elements)
                .map(i -> random.nextInt())
                .collect(Collectors.toList());
    }

}
