package factory;

import static factory.Paths.OS.*;

public class Exemplu5 {

    public static void main(String[] args) {
        Path p1 = Paths.get(LINUX);
        Path p2 = Paths.get(WINDOWS);

        System.out.println(p1.getRoot());
        System.out.println(p2.getRoot());

        Path p3 = Paths.get();

        System.out.println(p3.getRoot());
    }
}
