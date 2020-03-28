package executors;

import java.time.Instant;

public class Task2 implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        Instant instant = Instant.now();

        System.out.println(threadName + " -> " + instant);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
