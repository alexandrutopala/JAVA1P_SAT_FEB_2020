package tema.produs;

import java.util.Comparator;

public class Produs implements Comparable<Produs> {

    private String nume;

    private int pret;

    public Produs(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }


    @Override
    public int compareTo(Produs o) {
        try {
            Thread.sleep(0, 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (this.pret != o.pret) {
            return this.pret - o.pret;
        } else {
            return this.nume.compareTo(o.nume);
        }
    }
}
