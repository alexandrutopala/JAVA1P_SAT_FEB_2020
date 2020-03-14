import java.io.*;

public class Exemplu4 {
    public static void main(String [] args) {
        File f = new File("./A");
        
        System.out.println(f.delete());
        System.out.println("E folder? " + f.isDirectory());
        
    }
}