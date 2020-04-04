package decorator;

public class Exemplu4 {

    public static void main(String[] args) {
        var bis = new ByteInputStream();
        var iis = new IntInputStream(bis);

        System.out.println( iis.read() );
    }
}
