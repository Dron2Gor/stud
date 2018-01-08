package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SyncTest implements Runnable {
    private int even = 0;
    private int odd = 1;

    public int getEven() {
        return even;
    }

    public int getOdd() {
        return odd;
    }

    public int change() {
        even++;
        Thread.yield();
        even++;
        Thread.yield();
        odd++;
        Thread.yield();
        odd++;
        return even+odd;

    }

    @Override
    public void run() {
        int h;
        for (int i = 0; i < 1000; i++)  {
            h=change();
            if (h % 2 == 0) {
                System.out.println(h + " - not even");
                System.exit(0);
            }
            System.out.println(h);
//            if (getOdd() % 2 == 0) {
//                System.out.println(odd + "- not odd");
//                System.exit(1);
//            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {

            exec.execute(new SyncTest());

        }
        exec.shutdown();

    }
}
