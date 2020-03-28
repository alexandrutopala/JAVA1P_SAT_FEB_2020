package executors;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {

    private String url;

    public DownloadTask(String url) {
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        Path dest = Paths.get("./download.pdf");

        URL url = new URL(this.url);

        InputStream is = url.openStream();

        Files.copy(is, dest, StandardCopyOption.REPLACE_EXISTING);

        return dest.toString();
    }
}
