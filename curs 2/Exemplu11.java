import java.nio.file.*;

public class Exemplu11 {
    public static void main(String [] args) throws Exception {
        Path src = Paths.get("./X/file.txt");
        Path dest = Paths.get("./X/copy.txt");
        
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
        
        Files.deleteIfExists(src);
    }
}


