package sincronizare;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Runnable2 implements Runnable {

    int x;
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

            read();
            write();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void write() {
        String threadName = Thread.currentThread().getName();

        lock.writeLock().lock();
        System.out.println(threadName + " scrie");
        x++;
        System.out.println(threadName + " a terminat de scris");
        lock.writeLock().unlock();
    }

    private void read() {
        String threadName = Thread.currentThread().getName();

        lock.readLock().lock();
        System.out.println(threadName + " citeste");
        System.out.println(x);
        System.out.println(threadName + " a terminat de citit");
        lock.readLock().unlock();
    }

}
