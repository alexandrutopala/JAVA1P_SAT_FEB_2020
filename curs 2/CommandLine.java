import java.io.*;
import java.nio.file.*;

public class CommandLine {
    public static void main(String [] args) {
        
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr)) {
            
             String line;
             String [] input;
             Path current = Paths.get("").toAbsolutePath();
             Path p;
             
             while (true) {
                 int count = current.getNameCount(); 
                 // calea absoluta va fi de forma: "C:\A\B\C\D\."
                 // vrem sa afisam ultimele 3 componente ale caii (in cazul in care exista cel putin 3 componente)
                 int low = count - 3 >= 0 ? count - 3 : 0;
                 System.out.print(current.subpath(low, count) + " > ");
                 
                 line = br.readLine();
                 input = line.split(" ");
                 
                 switch (input[0].toUpperCase()) {
                     case "CD" : 
                        p = getResolvedPath(current, concatStrings(input));
                        if (Files.notExists(p) || Files.isRegularFile(p)) {
                            System.out.println("Fisierul nu exista sau nu este un director");
                            continue;
                        }
                        current = p;
                        break;
                     case "PWD" : 
                        System.out.println(current);
                        break;
                     case "TOUCH" : 
                        p = getResolvedPath(current, concatStrings(input));
                        if (Files.notExists(p)) {
                            Files.createFile(p);
                        } else {
                            System.out.println("Fisierul exista deja");
                        }
                        break;
                     case "MKDIR" : 
                        p = getResolvedPath(current, concatStrings(input));
                        if (Files.notExists(p)) {
                            Files.createDirectory(p);
                        } else {
                            System.out.println("Fisierul exista deja");
                        }
                        break;
                     case "LS" :
                        Files.list(current).forEach(path -> System.out.println(path));
                        break;
                     case "RM" : 
                        p = getResolvedPath(current, concatStrings(input));
                        recursiveDelete(p);
                        break;
                     case "EXIT" : 
                        System.exit(0);
                        break;
                     default : System.err.println("Comanda invalida");
                 }
             }
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Path getResolvedPath(Path base, String param) {
        Path p = Paths.get(param);
        return base.resolve(p).normalize();
    }
    
    private static String concatStrings(String[] input) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < input.length; i++) {
            sb.append(input[i]);
            sb.append(" ");
        }
        return sb.substring(0, sb.length() - 1); // vom elimina ultimul spatiu din String, care a fost pus in plus 
                                                 // de for-ul de mai sus
    }
    
    private static void recursiveDelete(Path start) {
        try {
            // daca e un fisier obisnuit, il putem sterge direct
            if (Files.isRegularFile(start)) {
                Files.delete(start);
                return;
            }
            
            // altfel, inseamna ca e un folder, deci ii stergem intai continutul
            Files.list(start)
                 .forEach(path -> recursiveDelete(path));
            
            // apoi il stergem si pe acesta     
            Files.delete(start);     
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}