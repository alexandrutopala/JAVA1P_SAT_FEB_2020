package main;

import java.io.*;

public class Exemplu3 {

    public static void main(String[] args) throws IOException {
        // Exemplu2.java -> Exemplu2_copie.java

        FileReader fr = new FileReader("./src/main/Exemplu2.java");
        BufferedReader br = new BufferedReader(fr);
        PrintWriter pw = new PrintWriter("./src/main/Exemplu2_copie.java");

        try (fr; br; pw) {
            String line;

            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
        }
    }
}
