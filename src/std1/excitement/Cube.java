package std1.excitement;

public class Cube implements ThrowSub {
    @Override
    public void dice() {
        int i=rand.nextInt(6);
        System.out.println(i+1);
    }

    public static void main(String[] args) {
        new Cube().dice();
    }
}
