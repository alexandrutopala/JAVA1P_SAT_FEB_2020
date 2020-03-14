package main;

import java.util.Locale;
import java.util.ResourceBundle;

public class Exemplu10 {


    public static void main(String[] args) {
        Locale l1 = new Locale("en", "UK");
        Locale l2 = new Locale.Builder()
                .setLanguage("ro")
                .setRegion("RO")
                .build();
        Locale l3 = Locale.CANADA_FRENCH;

        Locale l4 = Locale.getDefault();

        System.out.println(l4);

        ResourceBundle bundle = ResourceBundle.getBundle("hello", l3);

        String message = bundle.getString("helloKey");

        System.out.println(message);
    }
}
