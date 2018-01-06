package std1;

import java.util.Arrays;

public class Fibonacci {
    public static int[] fib(int quantity) {
        int[] fib = new int[quantity];
        int temp = 1;
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < quantity; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }
        return fib;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fib(10)));
    }
}
