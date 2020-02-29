package main;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exemplu6 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("B.srz");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        try (fos; bos; oos) {
            B b = new B();

            oos.writeObject(b);
        }
    }
}
