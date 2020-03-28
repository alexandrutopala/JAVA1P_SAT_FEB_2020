package sincronizare;

import java.util.concurrent.Semaphore;

public class Runnable1 implements Runnable {

    int x;
    private Semaphore semaphore = new Semaphore(1, true); // un singur fir va putea instra in intersectie la un moment de timp

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            x++;
            try {
                semaphore.acquire();

                System.out.println(x++);
                // ...

                semaphore.release();

                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
