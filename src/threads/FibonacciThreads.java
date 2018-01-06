package threads;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class FibonacciThreads implements Callable {
    int quantity=0;

    public FibonacciThreads(int quantity) {
        this.quantity = quantity;
    }
    public Integer call() {
        int[] fib = new int[quantity];
        int temp = 0;
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < quantity; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        for (int i=0;i<fib.length; i++)
            temp+=fib[i];
        return temp;
    }


    public static void main(String[] args) {

//        System.out.println(Arrays.toString(fib(10)));
    }
}