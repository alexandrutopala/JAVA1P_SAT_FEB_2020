package executors;

public class Task1 implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        System.out.println("Start task");

        System.out.println("Fir: " + threadName);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End task");
    }
}
