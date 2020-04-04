package builder;

public class Exemplu3 {

    public static void main(String[] args) {
        Casa c = new Casa.Builder()
                .setAdresa("bd. Timisoara")
                .setEtaje(1)
                .setUsi(2)
                .build();

        System.out.println(c);
    }
}
