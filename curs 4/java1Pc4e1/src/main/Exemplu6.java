package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Dandu-se o lista de produse, afisati pretul mediu pentru fiecare categorie
 */
public class Exemplu6 {
    public static void main(String[] args) {
        List<Produs> produse = List.of(
                new Produs("laptop", 2000, "electronice"),
                new Produs("telefon", 1000, "electronice"),
                new Produs("bluza", 50, "textile"),
                new Produs("pantaloni", 100, "textile"),
                new Produs("frigider", 2500, "electrocasnice")
        );

        Map<String, Double> res =
                produse.stream()
                        .collect(Collectors.groupingBy(
                                Produs::getCategorie, //produs -> produs.getCategorie() // classifier
                                Collectors.averagingInt(Produs::getPret) // produs -> produs.getPret() // downstream collector
                        ));

        System.out.println(res);
    }
}
