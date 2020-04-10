package tema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class MergeTask extends RecursiveTask<List<Integer>> {

    private List<Integer> list;

    public MergeTask(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected List<Integer> compute() {
        if (list.size() <= 2) {
            return list.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }

        int mid = list.size() / 2;

        MergeTask t1 = new MergeTask(list.subList(0, mid));
        MergeTask t2 = new MergeTask(list.subList(mid, list.size()));

        t2.fork();

        List<Integer> list1 = t1.compute();
        List<Integer> list2 = t2.join();

        return merge(list1, list2);
    }

    private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>(list1.size() + list2.size());
        int i, j;

        // parcurgem cele 2 liste pana cand terminam elementele dintr-una
        for (i = 0, j = 0; i < list1.size() && j < list2.size();) { // obs.: nu incrementam i, respectiv j deoarece
                                                                    // acestea vor creste doar cand luam un element
                                                                    // din list1, respectiv list2
            int x = list1.get(i);
            int y = list2.get(j);

            // pun in lista rezultata cel mai mic element dintre: elementul curent din list1
            // si elementul curent din list2
            if (x < y) {
                result.add(x);
                i++; // daca am pus elementul din list1, ma duc la elementul urmator
            } else {
                result.add(y);
                j++;
            }
        }

        // obs.: dupa ce am iesit din primul for, stim ca am epuizat elementele dintr-o lista.
        // Prin urmare, putem sa "turnam" elemntele ramase in cealalta lista in result

        // punem elementele ramase din list1 in result, in cazul in care mai exista
        for (; i < list1.size(); i++) {
            int x = list1.get(i);
            result.add(x);
        }

        // punem elementele ramase din list2 in result, in cazul in care mai exista
        for (; j < list2.size(); j++) {
            int y = list2.get(j);
            result.add(y);
        }

        return result;
    }
}
