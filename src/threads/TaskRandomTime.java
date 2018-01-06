package threads;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskRandomTime implements Runnable {
    private Random rand=new Random();
    @Override
    public void run() {
        int i=rand.nextInt(10)*100;
        try {
            TimeUnit.MILLISECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        ExecutorService exec= Executors.newCachedThreadPool();
        for (int i=0; i<6; i++)
            exec.execute(new TaskRandomTime());
        exec.shutdown();
    }
}

