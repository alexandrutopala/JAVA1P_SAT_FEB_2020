package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu4 {

    public static void main(String[] args) {
        List<Produs> produse = List.of(
                new Produs("laptop", 2000, "electronice"),
                new Produs("telefon", 1000, "electronice"),
                new Produs("bluza", 50, "textile"),
                new Produs("pantaloni", 100, "textile"),
                new Produs("frigider", 2500, "electrocasnice")
                //new Produs("frigider", 3000, "electrocasnice")
        );

        Map<String, Integer> map =
                produse.stream()
                        .collect(Collectors.toMap(
                                Produs::getNume, //produs -> produs.getNume(), // keyMapper
                                Produs::getPret, //produs -> produs.getPret() // valueMapper
                                (oldValue, newValue) -> newValue + oldValue //
                        ));

        System.out.println(map);
    }
}
