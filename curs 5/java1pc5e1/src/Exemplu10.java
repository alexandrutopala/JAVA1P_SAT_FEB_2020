import java.util.Arrays;

public class Exemplu10 {

    public static void main(String[] args) {
        String s = "a.b";

        String[] ss = s.split("[.]+");

        Arrays.toString(ss);
    }
}
