import java.nio.file.*;

public class Exemplu12 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get("./A");
        
        Files.list(p)
             .forEach(path -> System.out.println(path));
    }
}
