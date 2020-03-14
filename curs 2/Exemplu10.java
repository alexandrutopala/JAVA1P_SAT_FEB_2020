import java.nio.file.*;

public class Exemplu10 {
    public static void main(String [] args) throws Exception {
        Path p = Paths.get("./X/file.txt");
        
        if (Files.notExists(p)) {
            Files.createFile(p);
        }
        
        java.io.File f = p.toFile();
        Path p1 = f.toPath();
        
        try (java.io.BufferedWriter bw = Files.newBufferedWriter(p)) {
            bw.write("Hello");
        }
        
    }
}