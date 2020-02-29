package main;

import java.io.*;

public class Exemplu5 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("pisica.srz");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        try (fis; bis; ois) {
            Pisica p = (Pisica) ois.readObject();
            System.out.println(p);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
