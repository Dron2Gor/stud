package std1;

public class TwoTest {
    public static void main(String[] args) {
        TwoMetBase tw=  new TwoMetExt();
        tw=(TwoMetBase)tw;
        tw.methodOne();
    }
}
