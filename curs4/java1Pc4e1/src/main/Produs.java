package main;

import java.util.Objects;

public class Produs {

    private String nume;

    private int pret;

    private String categorie;

    public Produs(String nume, int pret, String categorie) {
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
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

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produs produs = (Produs) o;
        return Objects.equals(nume, produs.nume) &&
                Objects.equals(categorie, produs.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, categorie);
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
