import java.nio.file.*;

public class Exmeplu5 {
    public static void main(String [] args) {
        Path p1 = Paths.get("/A/B", "C");
        
        System.out.println(p1.getClass());
        System.out.println(p1.isAbsolute());
        
        System.out.println(p1.getRoot());
        System.out.println(p1.getFileName());
        
        for (int i = 0; i < p1.getNameCount(); i++) {
            System.out.println(i + " " + p1.getName(i));    
        }
        
    }
}