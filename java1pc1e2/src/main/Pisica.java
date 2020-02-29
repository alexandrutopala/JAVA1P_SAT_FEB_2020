package main;

import java.io.Serializable;

public class Pisica implements Serializable {

    private static final long serialVersionUID = 0L;

    String nume;
    int varsta;
    //String culoare = "negru";
    transient int greutate = 7;


    {
        System.out.println("bloc anonim non-static pisica");
    }

    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        System.out.println("c-tor pisica");
    }

    @Override
    public String toString() {
        return nume + " " + varsta + " " + greutate;
    }
}
