package std1.exceptionPack;

import java.util.Arrays;

public class ExeptTest {


    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        for (int j = 0; j < 5; j++) {
            try {
                System.out.println(i[j]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getClass().getSimpleName());
            }
        }

        System.out.println(Arrays.toString(i));
    }

}
