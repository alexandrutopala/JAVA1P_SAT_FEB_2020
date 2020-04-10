package tema.produs;

import tema.produs.Produs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;

public class MergeProdusTask extends RecursiveTask<List<Produs>> {

    private List<Produs> list;

    public MergeProdusTask(List<Produs> list) {
        this.list = list;
    }

    @Override
    protected List<Produs> compute() {
        if (list.size() <= 2) {
            return list.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }

        int mid = list.size() / 2;

        MergeProdusTask t1 = new MergeProdusTask(list.subList(0, mid));
        MergeProdusTask t2 = new MergeProdusTask(list.subList(mid, list.size()));

        t2.fork();

        List<Produs> list1 = t1.compute();
        List<Produs> list2 = t2.join();

        return merge(list1, list2);
    }

    private List<Produs> merge(List<Produs> list1, List<Produs> list2) {
        List<Produs> result = new ArrayList<>(list1.size() + list2.size());
        int i, j;

        // parcurgem cele 2 liste pana cand terminam elementele dintr-una
        for (i = 0, j = 0; i < list1.size() && j < list2.size();) { // obs.: nu incrementam i, respectiv j deoarece
            // acestea vor creste doar cand luam un element
            // din list1, respectiv list2
            Produs x = list1.get(i);
            Produs y = list2.get(j);

            // pun in lista rezultata cel mai mic element dintre: elementul curent din list1
            // si elementul curent din list2
            if (x.compareTo(y) < 0) {
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
            Produs x = list1.get(i);
            result.add(x);
        }

        // punem elementele ramase din list2 in result, in cazul in care mai exista
        for (; j < list2.size(); j++) {
            Produs y = list2.get(j);
            result.add(y);
        }

        return result;
    }
}
