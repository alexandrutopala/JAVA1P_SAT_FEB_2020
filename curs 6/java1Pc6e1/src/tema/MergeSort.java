package tema;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class MergeSort {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 6, 30, 10, 2, 1, -1, 0, 20, 43);

        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<List<Integer>> task = new MergeTask(list);

        List<Integer> result = pool.invoke(task);

        System.out.println(result);
    }
}
