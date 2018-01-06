package threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreads {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exec=Executors.newCachedThreadPool();
        Future<Integer> i=exec.submit(new FibonacciThreads(6));
        Future<Integer> j=exec.submit(new FibonacciThreads(4));
        Future<Integer> f=exec.submit(new FibonacciThreads(10));
        Future<Integer> h=exec.submit(new FibonacciThreads(10));
        exec.shutdown();
        System.out.println(f.get());
        System.out.println(j.get());
        System.out.println(i.get());
        System.out.println(h.get());

    }
}
