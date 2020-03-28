package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu2 {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        try {
            Task1 t = new Task1();

            service.execute(t);
            service.execute(t);
            service.execute(t);
            service.execute(t);
            service.execute(t);

        } finally {
            service.shutdown();
        }
    }
}
