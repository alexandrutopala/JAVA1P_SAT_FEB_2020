package singleton;

public class Pisica {

    private String nume;

    private static final class SingletonHolder {
        private final static Pisica INSTANCE = new Pisica();
    }

    private Pisica() {
    }

    public static Pisica getInstance() {
        return SingletonHolder.INSTANCE;
    }


}
