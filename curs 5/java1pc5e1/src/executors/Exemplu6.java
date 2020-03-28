package executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exemplu6 {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Task2 t = new Task2();

        //service.scheduleWithFixedDelay(t, 0, 3, TimeUnit.SECONDS);
        // fixed delay reexecuta urmatorul task la 3 secunde dupa terminarea celui anterior

        service.scheduleAtFixedRate(t, 0, 3, TimeUnit.SECONDS);
        // fixed rate ne asigura cel putin un delay de 3s intre executiile task ului

//        service.invokeAll(List<Callable>) : blocheaza executia firului curent
////        pana se termina executia tuturor taskurilor din lista

        //service.invokeAny(List<Callable>) : blocheaza executia firului curent
//        pana se termina executia a macar unui task dintre cele precizate
    }
}
