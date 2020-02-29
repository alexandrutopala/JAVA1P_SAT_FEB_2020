package main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exemplu7 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("B.srz");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        try (fis; bis; ois) {
            B b = (B) ois.readObject();

            System.out.println(b.atributA + " " + b.atributB);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
