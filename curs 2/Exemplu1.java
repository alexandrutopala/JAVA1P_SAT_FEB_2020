import java.io.*;

public class Exemplu1 {
    public static void main(String [] args) {
        
        File f = new File("./A");
        
        boolean rez = f.mkdir();
        System.out.println(rez);
    }
}