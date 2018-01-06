package threads;

public class FirstThread implements Runnable {
    private int count = 10;
    static int id=0;
    private final int num=id++;

    @Override
    public void run() {
        while (--count > 0) {
            System.out.print("##" + num + ":" + count + "  ");
            Thread.yield();
        }
    }

    public FirstThread() {

        System.out.println("Constructor object " + num);
    }
}
