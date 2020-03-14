import java.nio.file.*;

public class Exemplu13 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get("./A");
        
        Files.walk(p, 1)
             .forEach(path -> System.out.println(path));
    }
}