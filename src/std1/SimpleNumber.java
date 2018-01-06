package std1;

public class SimpleNumber {
    public static void main(String[] args) {
        int temp = 1;
        boolean flag = false;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0)
                    if (j != 1) {
                        temp = 1;
                        flag = true;
                    } else {
                        temp = i;
                        flag = false;
                    }
            }
            if (!flag) {
                System.out.println(temp);
            }
        }
    }
}
