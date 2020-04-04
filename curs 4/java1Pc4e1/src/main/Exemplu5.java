package main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Dandu-se o lista de produse, grupatile dupa categorie
 */
public class Exemplu5 {

    public static void main(String[] args) {
        List<Produs> produse = List.of(
                new Produs("laptop", 2000, "electronice"),
                new Produs("telefon", 1000, "electronice"),
                new Produs("bluza", 50, "textile"),
                new Produs("pantaloni", 100, "textile"),
                new Produs("frigider", 2500, "electrocasnice")
        );

        Map<String, List<Produs>> res =
            produse.stream()
                    .collect(Collectors.groupingBy(
                            Produs::getCategorie //produs -> produs.getCategorie() // classifier
                    ));

        System.out.println(res);
    }
}
