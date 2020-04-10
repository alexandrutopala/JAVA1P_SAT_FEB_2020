package tema.produs;

import tema.MergeTask;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeSortProduseTimeTest {

    public static void main(String[] args) {
        List<Produs> list = generateList(1000);

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<List<Produs>> task = new MergeProdusTask(list);

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

    private static List<Produs> generateList(int elements) {
        Random random = new Random();

        return Stream.iterate(0, i -> i + 1)
                .limit(elements)
                .map(i -> random.nextInt())
                .map(i -> new Produs("cioco", i))
                .collect(Collectors.toList());
    }

}
