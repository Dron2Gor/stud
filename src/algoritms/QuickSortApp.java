package algoritms;

import java.util.Random;

public class QuickSortApp {
    public static void main(String[] args) {
        int maxSize =16;
        ArrayIns arr=new ArrayIns(maxSize);
        Random rand=new Random();
        for (int i = 0; i < maxSize; i++) {
            arr.insert(rand.nextInt(99));
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
