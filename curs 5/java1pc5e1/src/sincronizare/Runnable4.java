package sincronizare;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Runnable4 implements Runnable {

    CyclicBarrier barrier = new CyclicBarrier(2);
    // asteapta sa ajunge la bariera 2 fire, si le da drumu in acelasi timp
    // in momentul in care au ajuns amandoua

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println(threadName + " a ajuns la bariera");

        try {

            barrier.await();

            System.out.println(threadName + " a trecut de bariera");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
