import java.nio.file.*;

public class Exemplu14 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get(".");
        
        Files.find(p, Integer.MAX_VALUE, 
            (path, a) -> 
                path.getFileName()
                .toString().endsWith(".txt")
            )
             .forEach(path -> System.out.println(path));
    }
}