package executors;

import java.util.concurrent.*;

public class Exemplu4 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<String> task =
                new DownloadTask("https://profs.info.uaic.ro/~acf/java/Cristian_Frasinaru-Curs_practic_de_Java.pdf");

        System.out.println("Incep descarcarea ....");

        Future<String> future = service.submit(task);
        // obiectul prin care pot urmari executia DownloadTask ului

        System.out.println("Se descarca ....");

        try {
            String path = future.get();
            // blochez firul curent (main) pana la terminarea executiei task ului

            System.out.println("Fisierul a fost descarcat la: " + path);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
