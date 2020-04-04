package factory;

public final class Paths {

    enum OS {
        WINDOWS, LINUX
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
