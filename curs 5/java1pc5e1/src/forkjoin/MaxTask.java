package forkjoin;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class MaxTask extends RecursiveTask<Integer> {

    private List<Integer> list;

    public MaxTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (list.size() <= 2) {
            return Collections.max(list);
        }

        int mid = list.size() / 2;

        MaxTask t1 = new MaxTask(list.subList(0, mid));
        MaxTask t2 = new MaxTask(list.subList(mid, list.size()));

        t1.fork(); // va face un nou fir executie pe care se apela compute

        int max2 = t2.compute();
        int max1 = t1.join();

        return Integer.max(max1, max2);
    }
}
