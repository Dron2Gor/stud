package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorites implements Runnable {
    private int countDown = 5;
    private volatile double d;
    private int priority;

    public SimplePriorites(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown +" p="+priority;
    }


    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            for (int i = 0; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorites(Thread.MIN_PRIORITY));
        }
        exec.execute(new SimplePriorites(Thread.MAX_PRIORITY));
        exec.shutdown();
    }
}
