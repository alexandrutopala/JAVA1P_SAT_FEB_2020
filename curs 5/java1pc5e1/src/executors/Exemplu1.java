package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu1 {

    public static void main(String[] args) {
        ExecutorService service;

        service = Executors.newSingleThreadExecutor();

        Runnable task1 = () -> System.out.println("Hello world");
        Task1 t = new Task1();

        service.execute(task1);
        service.execute(t); // Ctrl + D
        service.execute(t);
        service.execute(t);
        service.execute(t);
        service.execute(t);

        service.shutdown();  // sunt inchise firele din thread pool-ul executorului
                             // dupa ce au fost executate taskuri submise pana la shutdown

        //service.shutdownNow(); // inchide service-ul acum, intrerupand taskurile care erau in executie

        System.out.println("end main");
    }
}
