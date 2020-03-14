package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class Exemplu5 {

    /*
     Intr-un fisier file1.txt se afla cate un sir de caractere
     pe cate o linie.
     Afisati cate dintre acestea incep cu "ra"
     */
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("./file1.txt");

        BufferedReader br = Files.newBufferedReader(p);

        try (br) {
            long count =
                Stream.generate(() -> read(br))
                        .takeWhile(Objects::nonNull) // line -> Objects.nonNull(line)
                        .filter(line -> line.startsWith("ra"))
                        .count();

            System.out.println(count);
        }
    }

    private static String read(BufferedReader br) {
        try {
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }
}
