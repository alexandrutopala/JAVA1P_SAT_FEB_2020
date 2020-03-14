import java.io.*;

public class Exemplu2 {
    public static void main(String [] args) throws IOException {
        File f = new File("./A/B/C");
        
        System.out.println(f.mkdirs());
        
        File f1 = new File("./A/file.txt");
        
        System.out.println(f1.createNewFile());
    }
}