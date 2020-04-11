package factory;

import java.util.Arrays;
import java.util.List;

public final class Paths {

    enum OS {
        WINDOWS("win"),
        LINUX("unix", "uix");

        List<String> abbreviations;

        OS(String ... abbreviations) {
            this.abbreviations = List.of(abbreviations);
        }

        public static OS parseValue(String osName) {
            return Arrays.stream(OS.values())
                    .filter(os -> containsIgnoreCaseOneOf(osName, os.abbreviations))
                    .findAny()
                    .orElseThrow(IllegalArgumentException::new);
        }

        private static boolean containsIgnoreCaseOneOf(String osName, List<String> abbreviations) {
            return abbreviations.stream()
                    .anyMatch(abbreviation -> osName.toLowerCase().contains(abbreviation));
        }
    }

    private Paths() {
    }

    /*
        O metoda care returneaza WindowsPath pt OS.WINDOWS
        sau Linux pt OS.LINUX, altfel arunca o exceptie
     */
    public static Path get(OS os) {
        switch (os) {
            case LINUX: return new LinuxPath();
            case WINDOWS:return new WindowsPath();
            // CASE MAC: return MacPath();
            default: throw new IllegalArgumentException("Not supported");
        }
    }

    public static Path get() {
        String osAbbreviation = System.getProperty("os.name");
        OS os = OS.parseValue(osAbbreviation);

        return get(os);
    }

    private static class WindowsPath implements Path {
        @Override
        public String getRoot() {
            return "C:\\";
        }
    }

    private static class LinuxPath implements Path {
        @Override
        public String getRoot() {
            return "/";
        }
    }
}
