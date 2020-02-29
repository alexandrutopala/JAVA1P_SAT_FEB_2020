package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplu2 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./src/main/Exemplu1.java");
        BufferedReader br = new BufferedReader(fr);

        try (fr; br) {
            String line;

            line = br.readLine();

            while (line != null) {
                System.out.println(line);

                line = br.readLine();
            }
        }

    }
}
