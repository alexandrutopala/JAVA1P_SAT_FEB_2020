package sincronizare;

import java.util.concurrent.atomic.AtomicInteger;

public class Runnable3 implements Runnable {

    AtomicInteger x = new AtomicInteger(0);
    // AtomicBoolean, AtomicArray, AtomicReference

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(x.incrementAndGet()); // ++x
        }
    }
}
