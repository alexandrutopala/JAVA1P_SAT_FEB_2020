package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
    Se dau:
        - bundle-ul "hello" cu fisiere de proprietati
        - un fisier "input_<locala>.txt" care contine pe o singura linie chei
          din fisierele de proprietati, despartite printr-un spatiu (toate cheile sunt valide
          si exista in fisierele de prop)

     Se cere sa generati un fisier "trad_<locala>.txt" care sa contina traducerile
     cheilor din "input_<locala>.txt" in funtie de locala user-ului, precizata in
     numele fisierului de intrare.

     Ex.: fisierul "input_en_UK.txt" contine: "i_k am_k gigel_k gigel_k i_k am_k"
          Programul va genera fisierul "trad_en_UK.txt" care va contine:
            "I am Gigel Gigel I am"
          (conform traducerilor date in fisierele de proprietati)
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Path currentDirectory = Paths.get(".");

        Files.list(currentDirectory)
                .filter(path -> path.getFileName().toString().startsWith("input"))
                .forEach(path -> translateFile(path));
    }

    private static void translateFile(Path path) {
        Locale locale = extractLocaleFromFileName(path.getFileName().toString());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("hello", locale);

        try {
            String translatedLine =
                Files.lines(path)
                        .map(line -> line.split("\\s+"))
                        .map(wordKeysArray -> List.of(wordKeysArray))
                        .flatMap(wordKeysList -> wordKeysList.stream())
                        .map(wordKey -> resourceBundle.getString(wordKey))
                        .collect(Collectors.joining(" "));

            Path destination = Paths.get("./trad_" + locale.toString() + ".txt");

            Files.writeString(destination, translatedLine);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Locale extractLocaleFromFileName(String fileName) {
        String localeReggex = "[a-z][a-z]_[A-Z][A-Z]";
        Pattern pattern = Pattern.compile(localeReggex);
        Matcher matcher = pattern.matcher(fileName);

        if (matcher.find()) {
            int localeStartIndex = matcher.start();
            int localeEndIndex = matcher.end();

            String localeString = fileName.substring(localeStartIndex, localeEndIndex);

            return new Locale(localeString);
        }

        throw new IllegalArgumentException("No locale found in file name");
    }
}
