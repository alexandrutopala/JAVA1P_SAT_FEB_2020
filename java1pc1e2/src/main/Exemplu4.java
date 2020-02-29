package main;

import java.io.*;

public class Exemplu4 {

    public static void main(String[] args) throws IOException {
        Pisica p = new Pisica("mitzi", 3);

        FileOutputStream fos = new FileOutputStream("pisica.srz");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        try (fos; bos; oos) {
            System.out.println(p);
            oos.writeObject(p);
        }
    }
}
