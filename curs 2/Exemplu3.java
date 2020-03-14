import java.io.*;

public class Exemplu3 {
    public static void main(String [] args) {
        File f = new File("./A");
        
        File[] files = f.listFiles();
        
        for (File file : files) {
            System.out.println(file);
        }
    }
}