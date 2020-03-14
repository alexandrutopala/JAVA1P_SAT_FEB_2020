import java.nio.file.*;

public class Exemplu9 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get("./X");
        
        if (Files.notExists(p)) {
            Files.createDirectories(p);
        } else {
            System.out.println("fisierul exista deja");
        }
    }
}