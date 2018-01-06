package std1;

import java.util.Random;

public class FourthRand {
    public static void main(String[] args) {
        Random rand = new Random();
        int j;
        int temp = 0;
        while (true) {
            j = rand.nextInt(88);
            if (j > temp) System.out.println(j + " больше " + temp);
            else if (j < temp) System.out.println(j + " less " + temp);
            else System.out.println(j + " equal " + temp);
            temp = j;
        }
    }
}

