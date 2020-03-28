package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exemplu3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        // ne creeaza un thread pool cu un numar variabil de fire in functie nr de taskuri,
        // tinandu-le active pana in 60s

        // cacheThreadPool - bun pt taskuri multe si scurte
        // fixedThreadPool - bun pt taskuri de lunga durata

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
