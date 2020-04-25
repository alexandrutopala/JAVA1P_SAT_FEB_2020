package exemplu;

public class Produs {

    private String nume;

    @Pret(3)
    private int pret;

    public void printPret() {
        System.out.println(pret);
    }
}
