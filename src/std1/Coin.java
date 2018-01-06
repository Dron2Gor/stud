package std1;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random rand =new Random();
        int i;
        for (int j = 0; j <4 ; j++) {
            i = rand.nextInt(2);
            System.out.println(i);
            if (i == 0) System.out.println("orel");
            else System.out.println("rehka");
        }
    }
}
