import java.nio.file.*;

public class Exemplu15 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get("./Exemplu15.java");
        
        java.util.List<String> lines = Files.readAllLines(p);
        
        Files.lines(p)
             .forEach(line -> System.out.println(line));
    }
}