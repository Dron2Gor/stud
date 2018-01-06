package std1.cycl;

public class CyclesTest {
    public static void rider(CycleFactory cf) {
        Cycle ct=cf.getCycle();
        ct.ride();

    }

    public static void main(String[] args) {
        rider(new UnicucleFactory());
        rider(new BicycleFactory());
        rider(new TricycleFactory());
    }
}
