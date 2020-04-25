package exemplu;

public class Caine {
    private int varsta = 3;
    private String nume = "Pablo";
    private String rasa = "Frenchie";
    private String culoare = "Maro";
    private Caine() {};

    private void spuneHam() {
        System.out.println("Ham Ham!");
    }

    private void spuneNume() {
        System.out.println("Ham, numele meu este " + nume);
    }

    private void spuneVarsta() {
        System.out.println("Ham, varsta mea este " + varsta);
    }

}
