import java.nio.file.*;

public class Exemplu8 {
    public static void main(String [] args) {
        Path p = Paths.get("A/B/./../C/../././D/X/Y/../Z");
        
        p = p.normalize();
        
        System.out.println(p);
    }
}