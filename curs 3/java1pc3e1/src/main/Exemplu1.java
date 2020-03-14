package main;

import java.util.function.Supplier;

/*
    java.util.function

    Consumer - primeste o valoare si nu returneaza nimic (o consuma)
    BiConsumer - primeste doua valoari si nu returneaza nimic (le consuma)
    Predicate - primeste o valoare si returneaza true sou false
    BiPredicate - primeste doua valoari si returneaza true sou false
    Supplier - nu primeste nimic, dar ne returneaza o valoare
    Function - primeste o valoare si ne returneaza o alta valoare
    BiFunction - primeste doua valoari si ne returneaza o alta valoare
    UnaryOperator - primeste o valoare si returneaza o valoare de acelasi tip ca
                    a celei primite
    BinaryOperator - primeste doua valoari si returneaza o valoare de acelasi tip ca
                    a celor primite

    IntFunction - este un Function care primeste un int si retuneaza ceva
    ToIntFunction -  este un Function care primeste ceva si retuneaza un int
 */
public class Exemplu1 {

    public static void main(String[] args) {
        Supplier<Integer> s1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 4;
            }
        };

        Supplier<Integer> s2 = () -> 4;

        Supplier<Integer> s3 = () -> {
            int x = 4;
            return x;
        };
    }

}
