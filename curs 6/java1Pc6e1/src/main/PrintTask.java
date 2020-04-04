package main;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class PrintTask extends RecursiveAction {

    private List<Integer> list;

    public PrintTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected void compute() {
        if (list.size() <= 1) {
            list.stream().forEach(System.out::println);

            return;
        }

        int mid = list.size() / 2;

        PrintTask t1 = new PrintTask(list.subList(0, mid));
        PrintTask t2 = new PrintTask(list.subList(mid, list.size()));

        invokeAll(t1, t2);
    }
}
