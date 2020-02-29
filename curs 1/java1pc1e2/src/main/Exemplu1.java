package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplu1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); // CTRL + P

        try (isr; br) { // ALT + ENTER
            String line = br.readLine();
            System.out.println("Hello, " + line);
        }
    }
}
