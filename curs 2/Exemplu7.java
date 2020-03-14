import java.nio.file.*;

public class Exemplu7 {
    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B");
        Path p2 = Paths.get("D:/X/Y");
        
        p1 = p1.resolve(p2);
        
        System.out.println(p1);
    }
}