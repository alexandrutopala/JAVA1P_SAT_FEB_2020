package main;

import java.io.Serializable;

public class B extends A implements Serializable {

    int atributB = 12;

    public B() {
        System.out.println("c-tor B");
    }
}
