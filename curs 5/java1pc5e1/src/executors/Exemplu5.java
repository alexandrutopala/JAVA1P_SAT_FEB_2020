package executors;

import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemplu5 {

    public static void main(String[] args) {
        ScheduledExecutorService service;
        // ScheduledExecutorService - folosit pt a executa taskuri cu un anumit delay sau pentru
        // a executa automat taskuri repetitive

        service = Executors.newSingleThreadScheduledExecutor();

        Task2 t = new Task2();

        System.out.println(Instant.now());
        service.schedule(t, 3, TimeUnit.SECONDS);
        // execut task ul t cu un delay de 1 sec

        service.shutdown();
    }
}
